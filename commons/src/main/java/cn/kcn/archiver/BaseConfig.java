package cn.kcn.archiver;

/**
 * Created by kcn on 15/3/17.
 */

import java.beans.PropertyVetoException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import cn.kcn.utils.ConfigProperties;
import cn.kcn.utils.ConfigUtils;
import cn.kcn.utils.SpringContextUtil;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

@Configuration
@MapperScan("cn.kcn.archiver.dao")
@ComponentScan("cn.kcn.archiver")
@Import(ConfigProperties.class)
public class BaseConfig {
    private static final Logger LOG = LoggerFactory.getLogger(BaseConfig.class);

    @Value("${dburl}")
    private String jdbcUrl;

    @Value("${dbdriver}")
    private String driverClassName;

    @Value("${dbuser}")
    private String username;

    @Value("${dbpass}")
    private String password;

    @Value("${logbackxml}")
    private String logbackxml;

    @Bean(name = "dataSource")
    @DependsOn("properties")
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass(driverClassName);
        ds.setJdbcUrl(jdbcUrl);
        ds.setUser(username);
        ds.setPassword(password);

        // TODO: add c3p0 parameters
        return ds;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }

    @Bean
    public SpringContextUtil springContextUtil() {
        return new SpringContextUtil();
    }

    @PostConstruct
    public void postConstruct() {
        if (!StringUtils.isEmpty(logbackxml)) {
            ConfigUtils.changeLogbackConfig(logbackxml);
        }
    }
}

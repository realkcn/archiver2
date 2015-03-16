package cn.kcn.archiver;
/**
 * Created by kcn on 15/3/17.
 */

import cn.kcn.ConfigProperties;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Import;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;

@Configuration
@MapperScan("cn.kcn.archiver.dao")
@Import(ConfigProperties.class)
public class BaseConfig {
    private static final Logger LOG = LoggerFactory
            .getLogger(BaseConfig.class);

    @Value("${dburl}")
    private String jdbcUrl;
    @Value("${dbdriver}")
    private String driverClassName;
    @Value("${dbuser}")
    private String username;
    @Value("${dbpass}")
    private String password;

    @Bean(name = "dataSource")
    @DependsOn("properties")
    public DataSource dataSource() throws PropertyVetoException {
        ComboPooledDataSource ds = new ComboPooledDataSource();
        ds.setDriverClass(driverClassName);
        ds.setJdbcUrl(jdbcUrl);
        ds.setUser(username);
        ds.setPassword(password);

        //TODO: add c3p0 parameters
        return ds;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(dataSource());
        return sessionFactory.getObject();
    }
}

package cn.kcn;
/**
 * Created by kcn on 15/3/17.
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

@Configuration
public class ConfigProperties {
    private static final Logger LOG = LoggerFactory
            .getLogger(ConfigProperties.class);

    protected static String runningEnvironment = null;

    public static String getRunningEnvironment() {
        if (null == runningEnvironment)
            return System.getenv("run-env");
        return runningEnvironment;
    }

    public static void setRunningEnvironment(String runningEnvironment) {
        ConfigProperties.runningEnvironment = runningEnvironment;
    }

    @Bean
    public PropertyPlaceholderConfigurer properties() throws Exception {
        if (null == getRunningEnvironment()) {
            throw new Exception("没有配置运行环境变量");
        }
        PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
        Resource[] resources = new Resource[]
                {
                        new ClassPathResource("archiver.conf"),
                        new FileSystemResource("/etc/archiver." + getRunningEnvironment() + ".conf")
                };
        ppc.setIgnoreUnresolvablePlaceholders(true);
        ppc.setIgnoreResourceNotFound(true);
        ppc.setLocations(resources);
        return ppc;
    }

}

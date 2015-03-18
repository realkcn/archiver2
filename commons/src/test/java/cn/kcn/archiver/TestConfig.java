package cn.kcn.archiver;

/**
 * Created by kcn on 15/3/17.
 */

import cn.kcn.utils.ConfigProperties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("cn.kcn.archiver")
public class TestConfig {
    private static final Logger LOG = LoggerFactory.getLogger(TestConfig.class);

    static {
        ConfigProperties.setRunningEnvironment("test");
    }
}

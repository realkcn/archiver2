package cn.kcn.utils;

/**
 * Created by kcn on 15/3/17.
 */

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.joran.spi.JoranException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings("UnusedDeclaration")
public class ConfigUtils {
    private static final Logger LOG = LoggerFactory.getLogger(ConfigUtils.class);

    public static void changeLogbackConfig(String logbackxml) {
        try {
            LOG.info("Set logback configuration:{}", logbackxml);
            LoggerContext context = (LoggerContext) LoggerFactory.getILoggerFactory();
            JoranConfigurator configurator = new JoranConfigurator();
            configurator.setContext(context);
            // Call context.reset() to clear any previous configuration, e.g. default
            // configuration. For multi-step configuration, omit calling context.reset().
            context.reset();
            configurator.doConfigure(logbackxml);
        } catch (JoranException je) {
            // StatusPrinter will handle this
            LOG.error("Set logback configuration error:", je);
        }
    }
}

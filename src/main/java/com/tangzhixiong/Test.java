package com.tangzhixiong;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.BasicConfigurator;
import redis.clients.jedis.Jedis;

/**
 * Created by tzx on 2016/11/8.
 */
public class Test {
    public static void main(String[] args) {
        testLog4j();
    }

    public static void testCsv() {

    }

    public static void testJson() {

    }

    // private static Logger logger = Logger.getLogger(Test.class);
    private static Logger logger = Logger.getRootLogger();
    static {
        // PropertyConfigurator.configure("D:/tzx/git/netty-websocket/src/main/java/src/log4j.properties");
        // PropertyConfigurator.configure("D:\\tzx\\git\\netty-websocket\\src\\main\\java\\src\\log4j.properties");
        BasicConfigurator.configure();
    }

    public static void testJedis() {
        // jedis
        Jedis jedis = new Jedis("localhost");
        jedis.set("foo", "bar");
        String value = jedis.get("foo");
        System.out.println(value);
    }

    public static void testLog4j() {
        // log4j
        // get a logger instance named "com.foo"
        // Logger logger = Logger.getLogger("com.tangzhixiong");

        // Now set its level. Normally you do not need to set the
        // level of a logger programmatically. This is usually done
        // in configuration files.
        logger.setLevel(Level.INFO);

        Logger barlogger = Logger.getLogger("com.foo.Bar");

        // This request is enabled, because WARN >= INFO.
        logger.warn("Low fuel level.");

        // This request is disabled, because DEBUG < INFO.
        logger.debug("Starting search for nearest gas station.");

        // The logger instance barlogger, named "com.foo.Bar",
        // will inherit its level from the logger named
        // "com.foo" Thus, the following request is enabled
        // because INFO >= INFO.
        barlogger.info("Located nearest gas station.");

        // This request is disabled, because DEBUG < INFO.
        barlogger.debug("Exiting gas station search");
    }
}

package test;

import org.junit.Test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSlf4j {
    @Test
    public void test() {
        Logger logger = LoggerFactory.getLogger(TestSlf4j.class);
        logger.error("");   // empty msg
        logger.error(null); // null msg
        logger.error("Error Arg1:{} Arg2:{}");
        logger.error("Error Arg1:{} Arg2:{}", new Exception());
        logger.error("Error Arg1:{} Arg2:{}", "a", new Exception());
        logger.error("Error Arg1:{} Arg2:{}", "a", "b", new Exception());
        logger.error("Error Arg1:{} Arg2:{}", "a", "b", "c", new Exception());

        logger.error(null, new Exception());    // exception with null msg -> output olny exception
        logger.error("", new Exception());    // exception with empty msg -> output olny exception
        logger.error("exception", new Exception());    // exception with msg-> output exception after msg

        logger.trace("Trace Arg1:{} Arg2:{}");
        logger.trace("Trace Arg1:{} Arg2:{}", new Exception());
        logger.trace("Trace Arg1:{} Arg2:{}", "a", new Exception());
        logger.trace("Trace Arg1:{} Arg2:{}", "a", "b", new Exception());
        logger.trace("Trace Arg1:{} Arg2:{}", "a", "b", "c", new Exception());

        logger.info("a");
        logger.trace("ENTRY:");
        logger.trace("EXIT:");
        logger.debug("1 abc");
        logger.debug("2 abc", "abc");
        logger.debug("3 abc {}", null, null);
        logger.debug("4 abc {}", "abc");
        logger.debug("5 abc {}", new Exception());
        logger.debug("6 abc {} {}", "abc");
        logger.debug("7 abc {}", "abc", new Exception());
        logger.debug("8 abc {} {}", "abc", new Exception());
        logger.debug("9 abc {} {}", "abc", new byte[]{0,1,2});
        logger.debug("10 abc {} {}", "abc", new char[]{'a','b','c'});
        logger.debug("11 abc {} {}", "abc", new Object[]{'a',"b",1});
    }
}

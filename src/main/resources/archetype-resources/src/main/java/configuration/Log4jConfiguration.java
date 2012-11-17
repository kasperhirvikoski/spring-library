#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package}.configuration;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Log4jConfiguration {

    public static Logger configure() {

        Logger rootLogger = Logger.getRootLogger();

        rootLogger.setLevel(Level.WARN);
        rootLogger.addAppender(new ConsoleAppender(new PatternLayout("%d [%t] %-5p %c - %m%n")));

        return rootLogger;
    }
}
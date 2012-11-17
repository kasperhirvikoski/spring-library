#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.configuration.Log4jConfiguration;
import ${package}.configuration.SpringContextConfiguration;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Library {

    private static Logger rootLogger = null;
    private static ApplicationContext context = null;

    public Library() {
        init();
    }

    private void init() {

        // Configure Log4j
        if (rootLogger == null) {
            rootLogger = Log4jConfiguration.configure();
        }

        // Configure Spring Context
        if (context == null) {
            context = new AnnotationConfigApplicationContext(SpringContextConfiguration.class);
        }
    }

    public String getHello() {
        return "Hello World!";
    }
}
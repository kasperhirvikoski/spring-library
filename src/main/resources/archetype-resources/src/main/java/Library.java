#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.configuration.SpringContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Library {

    private static ApplicationContext context = null;

    public Library() {
        init();
    }

    private void init() {

        // Configure Spring Context
        if (context == null) {
            context = new AnnotationConfigApplicationContext(SpringContextConfiguration.class);
        }
    }

    public String getHello() {
        return "Hello World!";
    }
}
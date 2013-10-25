#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import ${package}.configuration.SpringContextConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public final class Library {

    private static final ApplicationContext CONTEXT = new AnnotationConfigApplicationContext(SpringContextConfiguration.class);

    private Library() {}

    public static String getHello() {

        return "Hello World!";
    }
}

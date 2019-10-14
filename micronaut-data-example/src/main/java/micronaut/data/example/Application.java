package micronaut.data.example;

import io.micronaut.core.annotation.TypeHint;
import io.micronaut.runtime.Micronaut;
import org.hibernate.boot.model.naming.ImplicitNamingStrategyJpaCompliantImpl;


public class Application {

    public static void main(String[] args) {
        Micronaut.run(Application.class);
    }
}
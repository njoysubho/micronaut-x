package micronaut.tracing.example;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class HelloController {

    @Get("/hello")
    public String hello(){
        log.info("calling HelloController");
        return "hello";
    }
}

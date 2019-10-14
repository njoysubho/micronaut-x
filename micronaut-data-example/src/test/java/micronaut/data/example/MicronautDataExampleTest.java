package micronaut.data.example;

import io.micronaut.test.annotation.MicronautTest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;
import java.util.UUID;


@MicronautTest(environments = "test",application = Application.class)
public class MicronautDataExampleTest {

    @Inject
    private BookRepository repository;

    @Test
    public void test(){
        repository.findById(UUID.randomUUID());
    }
}

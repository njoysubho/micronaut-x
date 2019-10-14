package micronaut.data.example;

import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

import java.util.UUID;

@Repository
public interface BookRepository extends CrudRepository<Book, UUID> {
}

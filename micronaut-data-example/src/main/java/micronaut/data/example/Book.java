package micronaut.data.example;

import lombok.Data;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(schema = "book",name = "book")
@Data
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    private String isbn;
    @OneToMany
    Set
    private String name;
}

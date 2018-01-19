package ml.ledv.library.modules.repository;

import ml.ledv.library.db.entity.impl.BookEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface BookRepository extends MongoRepository<BookEntity, String> {

    List<BookEntity> findByName(String name);
}

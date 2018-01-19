package ml.ledv.library.modules.repository;

import ml.ledv.library.db.entity.impl.BookEntity;
import ml.ledv.library.db.entity.impl.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends MongoRepository<UserEntity, String> {

    Optional<UserEntity> findByBooks(BookEntity bookEntity);

    List<UserEntity> findByLogin(String login);
}

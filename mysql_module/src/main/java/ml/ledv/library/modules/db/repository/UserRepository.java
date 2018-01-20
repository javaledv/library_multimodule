package ml.ledv.library.modules.db.repository;

import ml.ledv.library.modules.db.entity.impl.BookEntity;
import ml.ledv.library.modules.db.entity.impl.UserEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends PagingAndSortingRepository<UserEntity, String> {

    Optional<UserEntity> findByBooks(BookEntity bookEntity);

    List<UserEntity> findByLogin(String login);
}

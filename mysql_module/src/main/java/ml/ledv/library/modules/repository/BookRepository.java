package ml.ledv.library.modules.repository;

import ml.ledv.library.db.entity.impl.BookEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;

public interface BookRepository extends PagingAndSortingRepository<BookEntity, String> {

    List<BookEntity> findByName(String name);
}

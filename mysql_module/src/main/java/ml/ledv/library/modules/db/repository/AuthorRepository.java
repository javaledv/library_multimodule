package ml.ledv.library.modules.db.repository;

import ml.ledv.library.modules.db.entity.impl.AuthorEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface AuthorRepository extends PagingAndSortingRepository<AuthorEntity, String> {
}

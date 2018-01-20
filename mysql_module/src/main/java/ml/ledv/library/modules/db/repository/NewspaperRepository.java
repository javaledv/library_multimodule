package ml.ledv.library.modules.db.repository;

import ml.ledv.library.modules.db.entity.impl.NewspaperEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NewspaperRepository extends PagingAndSortingRepository<NewspaperEntity, String> {
}

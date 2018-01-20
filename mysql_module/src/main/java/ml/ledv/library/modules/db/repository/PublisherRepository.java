package ml.ledv.library.modules.db.repository;

import ml.ledv.library.modules.db.entity.impl.PublisherEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PublisherRepository extends PagingAndSortingRepository<PublisherEntity, String> {
}

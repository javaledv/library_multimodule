package ml.ledv.library.modules.repository;

import ml.ledv.library.db.entity.impl.PublisherEntity;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PublisherRepository extends PagingAndSortingRepository<PublisherEntity, String> {
}

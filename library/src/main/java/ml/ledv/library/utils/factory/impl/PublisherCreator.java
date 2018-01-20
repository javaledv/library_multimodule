package ml.ledv.library.utils.factory.impl;

import ml.ledv.library.modules.db.entity.BaseEntity;
import ml.ledv.library.modules.db.entity.impl.PublisherEntity;
import ml.ledv.library.utils.factory.EntityCreator;
import org.springframework.stereotype.Service;

@Service("publisherCreator")
public class PublisherCreator implements EntityCreator {

    @Override
    public BaseEntity createEntity() {
        return new PublisherEntity();
    }
}

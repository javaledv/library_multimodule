package ml.ledv.library.utils.factory.impl;

import ml.ledv.library.modules.db.entity.BaseEntity;
import ml.ledv.library.modules.db.entity.impl.ContentEntity;
import ml.ledv.library.utils.factory.EntityCreator;
import org.springframework.stereotype.Service;

@Service("contentCreator")
public class ContentCreator implements EntityCreator {

    @Override
    public BaseEntity createEntity() {
        return new ContentEntity();
    }
}

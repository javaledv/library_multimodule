package ml.ledv.library.utils.factory.impl;

import ml.ledv.library.modules.db.entity.BaseEntity;
import ml.ledv.library.modules.db.entity.impl.AuthorEntity;
import ml.ledv.library.utils.factory.EntityCreator;
import org.springframework.stereotype.Service;

@Service("authorCreator")
public class AuthorCreator implements EntityCreator {

    @Override
    public BaseEntity createEntity() {
        return new AuthorEntity();
    }
}

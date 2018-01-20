package ml.ledv.library.utils.factory.impl;

import ml.ledv.library.modules.db.entity.BaseEntity;
import ml.ledv.library.modules.db.entity.impl.UserEntity;
import ml.ledv.library.utils.factory.EntityCreator;
import org.springframework.stereotype.Service;

@Service("userCreator")
public class UserCreator implements EntityCreator {

    @Override
    public BaseEntity createEntity() {
        return new UserEntity();
    }
}

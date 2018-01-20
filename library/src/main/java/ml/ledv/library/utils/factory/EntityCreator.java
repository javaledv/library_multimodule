package ml.ledv.library.utils.factory;

import ml.ledv.library.modules.db.entity.BaseEntity;

public interface EntityCreator {

    BaseEntity createEntity();
}

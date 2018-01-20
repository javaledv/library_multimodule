package ml.ledv.library.utils.factory.impl;

import ml.ledv.library.modules.db.entity.BaseEntity;
import ml.ledv.library.modules.db.entity.impl.NewspaperEntity;
import ml.ledv.library.utils.factory.EntityCreator;
import org.springframework.stereotype.Service;

@Service("newsPaperCreator")
public class NewsPaperCreator implements EntityCreator {

    @Override
    public BaseEntity createEntity() {
        return new NewspaperEntity();
    }
}

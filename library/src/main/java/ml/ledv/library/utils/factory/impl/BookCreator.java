package ml.ledv.library.utils.factory.impl;

import ml.ledv.library.modules.db.entity.BaseEntity;
import ml.ledv.library.modules.db.entity.impl.BookEntity;
import ml.ledv.library.utils.factory.EntityCreator;
import org.springframework.stereotype.Service;

@Service("bookCreator")
public class BookCreator implements EntityCreator {

    @Override
    public BaseEntity createEntity() {
        return new BookEntity();
    }
}

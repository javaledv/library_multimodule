package ml.ledv.library.modules.db.entity.impl;

import ml.ledv.library.modules.db.entity.BaseEntity;

public class PublisherEntity extends BaseEntity {

    private String name;

    public PublisherEntity() {
    }

    public PublisherEntity(final String id) {
        super(id);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PublisherEntity{" +
                "name='" + name + '\'' +
                '}';
    }
}

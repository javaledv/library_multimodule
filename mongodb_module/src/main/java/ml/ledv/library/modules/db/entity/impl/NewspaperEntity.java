package ml.ledv.library.modules.db.entity.impl;

import ml.ledv.library.modules.db.entity.BaseEntity;

import java.util.Date;

public class NewspaperEntity extends BaseEntity {

    private String name;

    private Date date;

    private PublisherEntity publisher;

    public NewspaperEntity() {
    }

    public NewspaperEntity(final String id) {
        super(id);
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(final Date date) {
        this.date = date;
    }

    public PublisherEntity getPublisher() {
        return publisher;
    }

    public void setPublisher(final PublisherEntity publisher) {
        this.publisher = publisher;
    }

    @Override
    public String toString() {
        return "NewspaperEntity{" +
                "name='" + name + '\'' +
                ", date=" + date +
                ", publisher=" + publisher +
                '}';
    }
}

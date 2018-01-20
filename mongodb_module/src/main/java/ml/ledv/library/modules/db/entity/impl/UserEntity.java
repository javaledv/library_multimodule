package ml.ledv.library.modules.db.entity.impl;

import ml.ledv.library.modules.db.entity.BaseEntity;

import java.util.List;

public class UserEntity extends BaseEntity {

    private String login;

    private List<BookEntity> books;

    public UserEntity() {
    }

    public UserEntity(final String id) {
        super(id);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(final String login) {
        this.login = login;
    }

    public List<BookEntity> getBooks() {
        return books;
    }

    public void setBooks(final List<BookEntity> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "login='" + login + '\'' +
                ", books=" + books +
                '}';
    }
}

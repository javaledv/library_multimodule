package ml.ledv.library.modules.db.entity.impl;

import ml.ledv.library.modules.db.entity.BaseEntity;

public class AuthorEntity extends BaseEntity {

    private String firstName;

    private String lastName;

    public AuthorEntity() {
    }

    public AuthorEntity(final String id) {
        super(id);
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "AuthorEntity{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

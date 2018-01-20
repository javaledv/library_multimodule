package ml.ledv.library.modules.db.entity;

import org.springframework.data.annotation.Id;

import java.util.Objects;

public abstract class BaseEntity {

    @Id
    private String id;

    public BaseEntity() {
    }

    public BaseEntity(final String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(final String id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id='" + id + '\'' +
                '}';
    }
}

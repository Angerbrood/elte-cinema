package hu.elte.cinema.dao.interfaces;


import java.util.List;

public interface CrudDao<EntityType, IdType> {
    IdType createEntity(EntityType entity);
    void updateEntity(EntityType entity);
    void deleteEntity(EntityType entity);
    void deleteAllEntity();

    EntityType findById(IdType id);

    boolean exists(IdType id);

    List<EntityType> list();
}

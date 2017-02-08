package hu.elte.cinema.dao.impl;


import hu.elte.cinema.dao.interfaces.CrudDao;
import hu.elte.cinema.model.ModelInterface;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.io.Serializable;
import java.util.List;

public class CrudDaoImpl<EntityType extends ModelInterface<IdType>, IdType extends Serializable>
        implements CrudDao<EntityType, IdType>{

    private final MongoRepository<EntityType, IdType> repository;

    public CrudDaoImpl(MongoRepository<EntityType, IdType> repository) {
        this.repository = repository;
    }


    @Override
    public IdType createEntity(EntityType entity) {
        repository.save(entity);
        return entity.getId();
    }

    @Override
    public void updateEntity(EntityType entity) {
        repository.save(entity);
    }

    @Override
    public void deleteEntity(EntityType entity) {
        repository.delete(entity);
    }

    @Override
    public void deleteAllEntity() {
        repository.deleteAll();
    }

    @Override
    public EntityType findById(IdType id) {
        return repository.findOne(id);
    }

    @Override
    public boolean exists(IdType id) {
        return repository.exists(id);
    }

    @Override
    public List<EntityType> list() {
        return repository.findAll();
    }
}

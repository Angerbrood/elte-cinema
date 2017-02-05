package hu.elte.cinema.service.impl;


import hu.elte.cinema.dao.interfaces.CrudDao;
import hu.elte.cinema.dto.DtoInterface;
import hu.elte.cinema.model.ModelInterface;
import hu.elte.cinema.service.interfaces.CrudService;
import org.springframework.core.convert.ConversionService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CrudServiceImpl<EntityType extends ModelInterface<IdType>, DtoType extends DtoInterface<IdType>, IdType>
        implements CrudService<EntityType, DtoType, IdType>{

    private final CrudDao<EntityType, IdType> dao;
    private final ConversionService conversionService;
    private final Class<EntityType> entityTypeClass;
    private final Class<DtoType> dtoTypeClass;

    public CrudServiceImpl(CrudDao<EntityType, IdType> dao, ConversionService conversionService, Class<EntityType> entityTypeClass, Class<DtoType> dtoTypeClass) {
        this.dao = dao;
        this.conversionService = conversionService;
        this.entityTypeClass = entityTypeClass;
        this.dtoTypeClass = dtoTypeClass;
    }

    @Override
    public void create(DtoType dto) {
        EntityType entity = conversionService.convert(dto, entityTypeClass);
        dao.createEntity(entity);
    }

    @Override
    public void delete(DtoType dto) {
        EntityType entity = conversionService.convert(dto, entityTypeClass);
        dao.deleteEntity(entity);
    }

    @Override
    public void update(DtoType dto) {
        EntityType entity = conversionService.convert(dto, entityTypeClass);
        dao.updateEntity(entity);
    }

    @Override
    public void dropAll() {
        dao.deleteAllEntity();
    }

    @Override
    public DtoType findById(IdType id) {
        EntityType entity = dao.findById(id);
        DtoType result = conversionService.convert(entity, dtoTypeClass);
        return result;
    }

    @Override
    public boolean exists(IdType id) {
        return dao.exists(id);
    }

    @Override
    public List<DtoType> list() {
        List<EntityType> entityList = dao.list();
        List<DtoType> result = entityList.stream().map(entity -> conversionService.convert(entity, dtoTypeClass)).collect(Collectors.toList());
        return result;
    }
}

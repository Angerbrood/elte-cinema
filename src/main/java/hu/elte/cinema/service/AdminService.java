package hu.elte.cinema.service;


import hu.elte.cinema.dto.DtoInterface;
import hu.elte.cinema.service.interfaces.CrudService;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class AdminService {

    private final CrudService crudService;

    public AdminService(CrudService<?, DtoInterface, String> crudService) {
        this.crudService = crudService;
    }
}

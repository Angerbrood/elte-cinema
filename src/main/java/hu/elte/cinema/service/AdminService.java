package hu.elte.cinema.service;


import hu.elte.cinema.dto.DtoInterface;
import hu.elte.cinema.response.CustomResponse;
import hu.elte.cinema.response.CustomResponseFactory;
import hu.elte.cinema.service.interfaces.CrudService;
import hu.elte.cinema.util.Wrapper;

@SuppressWarnings({ "rawtypes", "unchecked" })
public class AdminService {

    private final CrudService crudService;
    private final CustomResponseFactory customResponseFactory;
    public AdminService(CrudService<?, DtoInterface, String> crudService, CustomResponseFactory customResponseFactory) {
        this.crudService = crudService;
        this.customResponseFactory = customResponseFactory;
    }

    public CustomResponse list() {
        CustomResponse response;
        try {
            response = customResponseFactory.successfullResponse(crudService.list());
        } catch (Exception ex) {
            response = customResponseFactory.errorResponse(ex);
        }
        return response;
    }
    public CustomResponse create(Wrapper<? extends DtoInterface> customRequest) {
        CustomResponse response;
        try {
            DtoInterface dtoObject = customRequest.getObject();
            crudService.create(dtoObject);
            response = customResponseFactory.successfullResponse();
        } catch (Exception ex) {
            response = customResponseFactory.errorResponse(ex);
        }
        return response;
    }
    public CustomResponse update(Wrapper<? extends DtoInterface> customRequest) {
        CustomResponse response;
        try {
            DtoInterface dtoObject = customRequest.getObject();
            crudService.update(dtoObject);
            response = customResponseFactory.successfullResponse();
        } catch (Exception ex) {
            response = customResponseFactory.errorResponse(ex);
        }
        return response;
    }
    public CustomResponse delete(Wrapper<? extends DtoInterface> customRequest) {
        CustomResponse response;
        try {
            DtoInterface dtoObject = customRequest.getObject();
            crudService.delete(dtoObject);
            response = customResponseFactory.successfullResponse();
        } catch (Exception ex) {
            response = customResponseFactory.errorResponse(ex);
        }
        return response;
    }
    public CustomResponse findById(Wrapper<String> customRequest) {
        CustomResponse response;
        try {
            String id = customRequest.getObject();
            DtoInterface dtoObject = (DtoInterface) crudService.findById(id);
            response = customResponseFactory.successfullResponse(dtoObject);
        } catch (Exception ex) {
            response = customResponseFactory.errorResponse(ex);
        }
        return response;
    }
    public CustomResponse exists(Wrapper<String> customRequest) {
        CustomResponse response;
        try {
            String id = customRequest.getObject();
            Boolean result = crudService.exists(id);
            response = customResponseFactory.successfullResponse(result);
        } catch (Exception ex) {
            response = customResponseFactory.errorResponse(ex);
        }
        return response;
    }

}

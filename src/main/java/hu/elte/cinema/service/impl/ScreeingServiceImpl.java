package hu.elte.cinema.service.impl;



import hu.elte.cinema.dao.interfaces.ScreeningDao;
import hu.elte.cinema.dto.ScreeningDto;
import hu.elte.cinema.model.Screening;
import hu.elte.cinema.service.interfaces.ScreeningService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScreeingServiceImpl extends AbstractCrudServiceImpl<Screening, ScreeningDto, Integer>
    implements ScreeningService {

    @Autowired
    public ScreeingServiceImpl(ScreeningDao dao) {
        super(Screening.class, ScreeningDto.class, dao);
    }
}

package hu.elte.cinema.service.impl;



import hu.elte.cinema.dao.interfaces.PersonDao;
import hu.elte.cinema.dto.PersonDto;
import hu.elte.cinema.model.Person;
import hu.elte.cinema.service.interfaces.PersonService;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl extends AbstractCrudServiceImpl<Person, PersonDto, Integer>
    implements PersonService{


    public PersonServiceImpl(PersonDao dao) {
        super(Person.class, PersonDto.class, dao);
    }
}

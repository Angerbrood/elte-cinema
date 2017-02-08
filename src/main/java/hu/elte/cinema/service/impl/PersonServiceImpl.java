package hu.elte.cinema.service.impl;


import hu.elte.cinema.dto.PersonDto;
import hu.elte.cinema.model.Person;
import hu.elte.cinema.service.interfaces.PersonService;
import org.springframework.data.mongodb.repository.MongoRepository;

public class PersonServiceImpl extends AbstractCrudServiceImpl<Person, PersonDto, String>
    implements PersonService{


    public PersonServiceImpl(MongoRepository<Person, String> repository) {
        super(repository, Person.class, PersonDto.class);
    }
}

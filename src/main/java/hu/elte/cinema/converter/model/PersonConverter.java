package hu.elte.cinema.converter.model;


import hu.elte.cinema.dto.PersonDto;
import hu.elte.cinema.dto.TicketDto;
import hu.elte.cinema.model.Person;
import hu.elte.cinema.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PersonConverter implements Converter<PersonDto, Person> {

    @Autowired
    private ConversionService conversionService;

    @Override
    public Person convert(PersonDto personDto) {
        Person person = new Person();
        person.setId(personDto.getId());
        person.setAge(personDto.getAge());
        person.setName(personDto.getName());
        person.setTicket(conversionService.convert(personDto.getTicketDto(), Ticket.class));
        return person;
    }
}

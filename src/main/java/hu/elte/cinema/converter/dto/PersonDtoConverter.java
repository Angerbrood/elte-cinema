package hu.elte.cinema.converter.dto;

import hu.elte.cinema.dto.PersonDto;
import hu.elte.cinema.dto.TicketDto;
import hu.elte.cinema.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class PersonDtoConverter implements Converter<Person, PersonDto> {

    @Autowired
    private ConversionService conversionService;

    @Override
    public PersonDto convert(Person person) {
        PersonDto personDto = new PersonDto();
        personDto.setId(person.getId());
        personDto.setAge(person.getAge());
        personDto.setName(person.getName());
        personDto.setTicketDto(conversionService.convert(person.getTicket(), TicketDto.class));
        return personDto;
    }
}

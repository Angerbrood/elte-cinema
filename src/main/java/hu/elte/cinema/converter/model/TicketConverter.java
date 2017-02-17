package hu.elte.cinema.converter.model;

import hu.elte.cinema.dto.TicketDto;
import hu.elte.cinema.model.Movie;
import hu.elte.cinema.model.Person;
import hu.elte.cinema.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TicketConverter implements Converter<TicketDto, Ticket> {

    @Autowired
    private ConversionService conversionService;

    @Override
    public Ticket convert(TicketDto ticketDto) {
        Ticket ticket = new Ticket();
        ticket.setId(ticketDto.getId());
        ticket.setMovie(conversionService.convert(ticketDto.getMovie(), Movie.class));
        ticket.setPerson(conversionService.convert(ticketDto.getPerson(), Person.class));
        ticket.setSeatX(ticketDto.getSeatX());
        ticket.setSeatY(ticketDto.getSeatY());
        ticket.setStartDate(ticketDto.getStartDate());
        return ticket;
    }
}

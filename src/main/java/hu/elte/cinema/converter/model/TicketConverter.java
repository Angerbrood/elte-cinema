package hu.elte.cinema.converter.model;

import hu.elte.cinema.dto.TicketDto;
import hu.elte.cinema.model.Ticket;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TicketConverter implements Converter<TicketDto, Ticket> {
    @Override
    public Ticket convert(TicketDto ticketDto) {
        Ticket ticket = new Ticket();
        ticket.setId(ticketDto.getId());
        ticket.setMovieId(ticketDto.getMovieId());
        ticket.setPersonId(ticketDto.getPersonId());
        ticket.setSeatX(ticketDto.getSeatX());
        ticket.setSeatY(ticketDto.getSeatY());
        ticket.setStartDate(ticketDto.getStartDate());
        return ticket;
    }
}

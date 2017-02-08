package hu.elte.cinema.converter.dto;

import hu.elte.cinema.dto.TicketDto;
import hu.elte.cinema.model.Ticket;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TicketDtoConverter implements Converter<Ticket, TicketDto> {

    @Override
    public TicketDto convert(Ticket ticket) {
        TicketDto ticketDto = new TicketDto();
        ticketDto.setId(ticket.getId());
        ticketDto.setMovieId(ticket.getMovieId());
        ticketDto.setPersonId(ticket.getPersonId());
        ticketDto.setSeatX(ticket.getSeatX());
        ticketDto.setSeatY(ticket.getSeatY());
        ticketDto.setStartDate(ticket.getStartDate());
        return ticketDto;
    }
}

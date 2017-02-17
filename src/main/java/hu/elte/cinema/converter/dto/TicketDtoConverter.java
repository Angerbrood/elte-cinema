package hu.elte.cinema.converter.dto;

import hu.elte.cinema.dto.MovieDto;
import hu.elte.cinema.dto.PersonDto;
import hu.elte.cinema.dto.TicketDto;
import hu.elte.cinema.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class TicketDtoConverter implements Converter<Ticket, TicketDto> {

    @Autowired
    private ConversionService conversionService;

    @Override
    public TicketDto convert(Ticket ticket) {
        TicketDto ticketDto = new TicketDto();
        ticketDto.setId(ticket.getId());
        ticketDto.setMovie(conversionService.convert(ticket.getMovie(), MovieDto.class));
        ticketDto.setPerson(conversionService.convert(ticket.getPerson(), PersonDto.class));
        ticketDto.setSeatX(ticket.getSeatX());
        ticketDto.setSeatY(ticket.getSeatY());
        ticketDto.setStartDate(ticket.getStartDate());
        return ticketDto;
    }
}

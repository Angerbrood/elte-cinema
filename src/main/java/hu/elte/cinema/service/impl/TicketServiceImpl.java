package hu.elte.cinema.service.impl;


import hu.elte.cinema.dto.TicketDto;
import hu.elte.cinema.model.Ticket;
import hu.elte.cinema.service.interfaces.TicketService;
import org.springframework.data.mongodb.repository.MongoRepository;

public class TicketServiceImpl extends AbstractCrudServiceImpl<Ticket, TicketDto, String>
    implements TicketService{


    public TicketServiceImpl(MongoRepository<Ticket, String> repository) {
        super(repository, Ticket.class, TicketDto.class);
    }
}

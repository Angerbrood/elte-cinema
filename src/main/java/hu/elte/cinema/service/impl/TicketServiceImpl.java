package hu.elte.cinema.service.impl;


import hu.elte.cinema.dao.interfaces.TicketDao;
import hu.elte.cinema.dto.TicketDto;
import hu.elte.cinema.model.Ticket;
import hu.elte.cinema.service.interfaces.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketServiceImpl extends AbstractCrudServiceImpl<Ticket, TicketDto, Integer>
    implements TicketService{

    @Autowired
    public TicketServiceImpl(TicketDao dao) {
        super(Ticket.class, TicketDto.class, dao);
    }
}

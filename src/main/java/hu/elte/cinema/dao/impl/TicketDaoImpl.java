package hu.elte.cinema.dao.impl;


import hu.elte.cinema.dao.interfaces.TicketDao;
import hu.elte.cinema.model.Ticket;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class TicketDaoImpl extends CrudDaoImpl<Ticket, Integer>
    implements TicketDao {

    @Autowired
    public TicketDaoImpl(SessionFactory sessionFactory) {
        super(Ticket.class, sessionFactory);
    }
}

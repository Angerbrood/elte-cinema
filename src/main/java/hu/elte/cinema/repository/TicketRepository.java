package hu.elte.cinema.repository;


import hu.elte.cinema.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket, String>{
}

package hu.elte.cinema.configuration;


import hu.elte.cinema.model.Movie;
import hu.elte.cinema.model.Person;
import hu.elte.cinema.model.Room;
import hu.elte.cinema.model.Ticket;
import hu.elte.cinema.repository.MovieRepository;
import hu.elte.cinema.repository.PersonRepository;
import hu.elte.cinema.repository.RoomRepository;
import hu.elte.cinema.repository.TicketRepository;
import hu.elte.cinema.response.CustomResponseFactory;
import hu.elte.cinema.service.impl.MovieServiceImpl;
import hu.elte.cinema.service.impl.PersonServiceImpl;
import hu.elte.cinema.service.impl.RoomServiceImpl;
import hu.elte.cinema.service.impl.TicketServiceImpl;
import hu.elte.cinema.service.interfaces.MovieService;
import hu.elte.cinema.service.interfaces.PersonService;
import hu.elte.cinema.service.interfaces.RoomService;
import hu.elte.cinema.service.interfaces.TicketService;
import hu.elte.cinema.util.ServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@Import(DatabaseConfig.class)
@EnableMongoRepositories(basePackages = "hu.elte.cinema.repository")
public class ServiceConfig {

    @Autowired
    private ConversionService conversionService;
    @Autowired
    private MovieRepository movieRepository;
    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private RoomRepository roomRepository;
    @Autowired
    private TicketRepository ticketRepository;


    @Bean
    CustomResponseFactory customResponseFactory() {
        return new CustomResponseFactory();
    }
    @Bean
    MovieService movieService() {
        return new MovieServiceImpl(movieRepository);
    }
    @Bean
    PersonService personService() {
        return new PersonServiceImpl(personRepository);
    }
    @Bean
    RoomService roomService() {
        return new RoomServiceImpl(roomRepository);
    }
    @Bean
    TicketService ticketService() {
        return new TicketServiceImpl(ticketRepository);
    }

    @Bean
    ServiceProvider serviceProvider() {
        ServiceProvider serviceProvider = new ServiceProvider(customResponseFactory());
        serviceProvider.registerService(Movie.class, movieService());
        serviceProvider.registerService(Person.class, personService());
        serviceProvider.registerService(Room.class, roomService());
        serviceProvider.registerService(Ticket.class, ticketService());
        return serviceProvider;
    }

}

package hu.elte.cinema.factory;


import hu.elte.cinema.dto.MovieDto;
import hu.elte.cinema.dto.PersonDto;
import hu.elte.cinema.dto.RoomDto;
import hu.elte.cinema.dto.TicketDto;
import hu.elte.cinema.model.Movie;
import hu.elte.cinema.model.Person;
import hu.elte.cinema.model.Room;
import hu.elte.cinema.model.Ticket;
import hu.elte.cinema.repository.MovieRepository;
import hu.elte.cinema.repository.PersonRepository;
import hu.elte.cinema.repository.RoomRepository;
import hu.elte.cinema.repository.TicketRepository;
import hu.elte.cinema.service.impl.CrudServiceImpl;
import hu.elte.cinema.service.interfaces.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;

import javax.annotation.PostConstruct;

public final class CrudFactory {

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

    private CrudService<Movie, MovieDto, String> movieCrudService;
    private CrudService<Person, PersonDto, String> personCrudService;
    private CrudService<Room, RoomDto, String> roomCrudService;
    private CrudService<Ticket, TicketDto, String> ticketCrudService;


    @PostConstruct
    private void init() {
        movieCrudService = new CrudServiceImpl<>(movieRepository, conversionService, Movie.class, MovieDto.class);
        personCrudService = new CrudServiceImpl<>(personRepository, conversionService, Person.class, PersonDto.class);
        roomCrudService = new CrudServiceImpl<>(roomRepository, conversionService, Room.class, RoomDto.class);
        ticketCrudService = new CrudServiceImpl<>(ticketRepository, conversionService, Ticket.class, TicketDto.class);
    }


    public CrudService<Movie, MovieDto, String> getMovieCrudService() {
        return movieCrudService;
    }

    public CrudService<Person, PersonDto, String> getPersonCrudService() {
        return personCrudService;
    }

    public CrudService<Room, RoomDto, String> getRoomCrudService() {
        return roomCrudService;
    }

    public CrudService<Ticket, TicketDto, String> getTicketCrudService() {
        return ticketCrudService;
    }
}

package hu.elte.cinema.service.impl;


import hu.elte.cinema.dto.RoomDto;
import hu.elte.cinema.model.Room;
import hu.elte.cinema.service.interfaces.RoomService;
import org.springframework.data.mongodb.repository.MongoRepository;

public class RoomServiceImpl extends AbstractCrudServiceImpl<Room, RoomDto, String>
    implements RoomService{


    public RoomServiceImpl(MongoRepository<Room, String> repository) {
        super(repository, Room.class, RoomDto.class);
    }
}

package hu.elte.cinema.repository;


import hu.elte.cinema.model.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomRepository extends MongoRepository<Room, String>{
}

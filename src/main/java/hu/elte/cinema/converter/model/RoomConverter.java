package hu.elte.cinema.converter.model;

import hu.elte.cinema.dto.RoomDto;
import hu.elte.cinema.model.Room;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RoomConverter implements Converter<RoomDto, Room> {

    @Override
    public Room convert(RoomDto roomDto) {
        Room room = new Room();
        room.setId(roomDto.getId());
        room.setRoomName(roomDto.getRoomName());
        room.setMaxColumnNumber(roomDto.getMaxColumnNumber());
        room.setMaxRowNumber(roomDto.getMaxRowNumber());
        room.setSeatsArray(roomDto.getSeatsArray());
        return room;
    }
}

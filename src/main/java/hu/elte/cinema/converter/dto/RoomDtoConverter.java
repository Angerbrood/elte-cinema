package hu.elte.cinema.converter.dto;

import hu.elte.cinema.dto.RoomDto;
import hu.elte.cinema.model.Room;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

@Component
public class RoomDtoConverter implements Converter<Room, RoomDto> {

    @Override
    public RoomDto convert(Room room) {
        RoomDto roomDto = new RoomDto();
        roomDto.setId(room.getId());
        roomDto.setRoomName(room.getRoomName());
        roomDto.setMaxColumnNumber(room.getMaxColumnNumber());
        roomDto.setMaxRowNumber(room.getMaxRowNumber());
        roomDto.setSeatsArray(room.getSeatsArray());
        return roomDto;
    }
}

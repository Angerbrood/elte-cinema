package hu.elte.cinema.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Room")
public class Room implements ModelInterface<String>{
    @Id
    private String id;
    private String roomName;
    private Integer maxRowNumber;
    private Integer maxColumnNumber;
    private Boolean[][] seatsArray;

    public Room() {
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public Integer getMaxRowNumber() {
        return maxRowNumber;
    }

    public void setMaxRowNumber(Integer maxRowNumber) {
        this.maxRowNumber = maxRowNumber;
    }

    public Integer getMaxColumnNumber() {
        return maxColumnNumber;
    }

    public void setMaxColumnNumber(Integer maxColumnNumber) {
        this.maxColumnNumber = maxColumnNumber;
    }

    public Boolean[][] getSeatsArray() {
        return seatsArray;
    }

    public void setSeatsArray(Boolean[][] seatsArray) {
        this.seatsArray = seatsArray;
    }
}

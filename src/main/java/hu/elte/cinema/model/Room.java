package hu.elte.cinema.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Room")
public class Room implements ModelInterface<Integer>{
    @Id
    @Column(name = "ROOM_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "ROOM_NAME", nullable = false)
    private String roomName;
    @Column(name = "MAX_ROW", nullable = false)
    private Integer maxRowNumber;
    @Column(name = "MAX_COL", nullable = false)
    private Integer maxColumnNumber;
    @Column(name = "SEATS", nullable = false)
    private Boolean[][] seatsArray;

    public Room() {
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
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

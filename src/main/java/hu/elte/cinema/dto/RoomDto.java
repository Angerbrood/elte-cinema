package hu.elte.cinema.dto;


public class RoomDto implements DtoInterface<String> {
    private String id;
    private String roomName;
    private Integer maxRowNumber;
    private Integer maxColumnNumber;
    private Boolean[][] seatsArray;

    public RoomDto() {}

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

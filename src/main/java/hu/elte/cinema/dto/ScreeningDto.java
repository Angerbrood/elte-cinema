package hu.elte.cinema.dto;


import java.util.Date;

public class ScreeningDto implements DtoInterface<Integer>{

    private Integer id;
    private MovieDto movie;
    private RoomDto room;
    private Date date;

    public ScreeningDto() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public MovieDto getMovie() {
        return movie;
    }

    public void setMovie(MovieDto movie) {
        this.movie = movie;
    }

    public RoomDto getRoom() {
        return room;
    }

    public void setRoom(RoomDto room) {
        this.room = room;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

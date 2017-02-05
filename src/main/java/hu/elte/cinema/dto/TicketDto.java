package hu.elte.cinema.dto;


import java.util.Date;

public class TicketDto implements DtoInterface<String>{

    private String id;
    private Date startDate;
    private String personId;
    private String movieId;
    private String seatX;
    private String seatY;

    public TicketDto() {}

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getPersonId() {
        return personId;
    }

    public void setPersonId(String personId) {
        this.personId = personId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getSeatX() {
        return seatX;
    }

    public void setSeatX(String seatX) {
        this.seatX = seatX;
    }

    public String getSeatY() {
        return seatY;
    }

    public void setSeatY(String seatY) {
        this.seatY = seatY;
    }
}

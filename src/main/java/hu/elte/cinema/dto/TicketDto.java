package hu.elte.cinema.dto;


import java.util.Date;

public class TicketDto implements DtoInterface<Integer>{

    private Integer id;
    private Date startDate;
    private PersonDto person;
    private MovieDto movie;
    private Integer seatX;
    private Integer seatY;

    public TicketDto() {}

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public void setId(Integer id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public PersonDto getPerson() {
        return person;
    }

    public void setPerson(PersonDto person) {
        this.person = person;
    }

    public MovieDto getMovie() {
        return movie;
    }

    public void setMovie(MovieDto movie) {
        this.movie = movie;
    }

    public Integer getSeatX() {
        return seatX;
    }

    public void setSeatX(Integer seatX) {
        this.seatX = seatX;
    }

    public Integer getSeatY() {
        return seatY;
    }

    public void setSeatY(Integer seatY) {
        this.seatY = seatY;
    }
}

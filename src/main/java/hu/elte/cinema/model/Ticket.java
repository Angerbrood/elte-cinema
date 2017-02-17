package hu.elte.cinema.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import java.util.Date;

@Entity
@Table(name = "Ticket")
public class Ticket implements ModelInterface<Integer>{

    @Id
    @Column(name = "TICKE_ID")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "START_DATE", nullable = false)
    private Date startDate;
    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private Person person;
    @OneToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH})
    private Movie movie;
    @Column(name = "SEAT_ROW_NUMBER", nullable = false)
    private Integer seatX;
    @Column(name = "SEAT_COLUMN_NUMBER", nullable = false)
    private Integer seatY;

    public Ticket() {}

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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
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

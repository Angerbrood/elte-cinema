package hu.elte.cinema.service.interfaces;


import hu.elte.cinema.dto.MovieDto;
import hu.elte.cinema.model.Movie;

public interface MovieService extends CrudService<Movie, MovieDto, String> {
}

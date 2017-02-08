package hu.elte.cinema.service.impl;


import hu.elte.cinema.dto.MovieDto;
import hu.elte.cinema.model.Movie;
import hu.elte.cinema.service.interfaces.MovieService;
import org.springframework.data.mongodb.repository.MongoRepository;

public class MovieServiceImpl extends AbstractCrudServiceImpl<Movie, MovieDto, String>
    implements MovieService{

    public MovieServiceImpl(MongoRepository<Movie, String> repository) {
        super(repository, Movie.class, MovieDto.class);
    }


}

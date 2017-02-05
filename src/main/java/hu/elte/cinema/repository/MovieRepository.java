package hu.elte.cinema.repository;


import hu.elte.cinema.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie, String>{
}

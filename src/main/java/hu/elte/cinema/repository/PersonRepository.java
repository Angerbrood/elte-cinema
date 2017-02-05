package hu.elte.cinema.repository;

import hu.elte.cinema.model.Person;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PersonRepository extends MongoRepository<Person, String> {
}

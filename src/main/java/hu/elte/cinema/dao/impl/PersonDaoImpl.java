package hu.elte.cinema.dao.impl;


import hu.elte.cinema.dao.interfaces.PersonDao;
import hu.elte.cinema.model.Person;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class PersonDaoImpl extends CrudDaoImpl<Person, Integer>
    implements PersonDao {

    @Autowired
    public PersonDaoImpl(SessionFactory sessionFactory) {
        super(Person.class, sessionFactory);
    }
}

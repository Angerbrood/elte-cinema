package hu.elte.cinema.dao.impl;


import hu.elte.cinema.dao.interfaces.ScreeningDao;
import hu.elte.cinema.model.Screening;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class ScreeningDaoImpl extends CrudDaoImpl<Screening, Integer>
    implements ScreeningDao {

    @Autowired
    public ScreeningDaoImpl(SessionFactory sessionFactory) {
        super(Screening.class, sessionFactory);
    }
}

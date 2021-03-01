package ru.sapteh.service;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import ru.sapteh.entity.Gender;

public class GenderDaoImp {
    private final SessionFactory factory;

    public GenderDaoImp(SessionFactory factory) {
        this.factory = factory;
    }



    public Gender findById(char code) {
        try(Session session = factory.openSession()){
            Gender entity = session.get(Gender.class, code);
            return entity;
        }
    }


}

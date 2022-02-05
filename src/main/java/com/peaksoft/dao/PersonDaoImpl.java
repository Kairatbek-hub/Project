package com.peaksoft.dao;

import com.peaksoft.entity.Car;
import com.peaksoft.entity.Company;
import com.peaksoft.entity.Person;
import com.peaksoft.entity.SocialMedia;
import com.peaksoft.util.HibernateUtil;
import org.hibernate.Session;

import java.util.List;

public class PersonDaoImpl implements PersonDao{

    @Override

    public void createPerson(Person person){
        try{
            Session session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(person);
            session.getTransaction().commit();
        } finally {
            HibernateUtil.shutDown();
        }
    }

    @Override
    public void deleteById() {

    }
}

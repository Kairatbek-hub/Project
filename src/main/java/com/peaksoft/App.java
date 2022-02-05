package com.peaksoft;

import com.peaksoft.dao.PersonDao;
import com.peaksoft.dao.PersonDaoImpl;
import com.peaksoft.entity.Car;
import com.peaksoft.entity.Company;
import com.peaksoft.entity.Person;
import com.peaksoft.entity.SocialMedia;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        PersonDao personDao = new PersonDaoImpl();

        Car car = new Car("Honda","Japan");
        Car car2 = new Car("Lexus","Japan");
        List<Car> carList = new ArrayList<>();
        carList.add(car);
        carList.add(car2);
        SocialMedia socialMedia = new SocialMedia("Sputnik+");
        SocialMedia socialMedia2 = new SocialMedia("Azattyk+");
        List<SocialMedia> socialMediaList = new ArrayList<>();
        socialMediaList.add(socialMedia);
        socialMediaList.add(socialMedia2);
        Company company = new Company("Sputnik", "Chui125");
        Person person = new Person("Asan", 24,"asan@gmail.com", "Male");
        person.setCarList(carList);
        person.setSocialMediaList(socialMediaList);
        person.setCompany(company);

        personDao.createPerson(person);
    }
}

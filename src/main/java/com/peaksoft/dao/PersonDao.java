package com.peaksoft.dao;

import com.peaksoft.entity.Car;
import com.peaksoft.entity.Company;
import com.peaksoft.entity.Person;
import com.peaksoft.entity.SocialMedia;

public interface PersonDao {
    void createPerson(Person person);
    void deleteById();
}

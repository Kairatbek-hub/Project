package com.peaksoft.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Table(name = "companies")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "company_name")
    private String companyName;
    private String location;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "company")
    private List<Person> personList;

    public Company() {
    }

    public Company(String companyName, String location) {
        this.companyName = companyName;
        this.location = location;
    }
    public void  addPersonToCompany(Person person){
        if (personList == null) {
            personList = new ArrayList<>();
        }
        personList.add(person);
        person.setCompany(this);
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", companyName='" + companyName + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

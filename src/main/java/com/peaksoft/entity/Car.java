package com.peaksoft.entity;

import javax.persistence.*;

@Entity
@Table(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String mark;
    @Column(name = "produced_country")
    private String producedCountry;

    @ManyToOne(cascade = {CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH})
    @JoinColumn(name = "person_id")
    private Person person;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "garage_id")
    private Garage garage;

    public Car() {
    }

    public Car(String mark, String producedCountry) {
        this.mark = mark;
        this.producedCountry = producedCountry;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", producedCountry='" + producedCountry + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getProducedCountry() {
        return producedCountry;
    }

    public void setProducedCountry(String producedCountry) {
        this.producedCountry = producedCountry;
    }
}

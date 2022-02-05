package com.peaksoft.entity;

import javax.persistence.*;

@Entity
@Table(name = "garages")
public class Garage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Column(name = "is_empty")
    private boolean isEmpty;

    @OneToOne(cascade = CascadeType.ALL,mappedBy = "garage")
    private Car car;

    public Garage() {
    }

    public Garage(String name, boolean isEmpty) {
        this.name = name;
        this.isEmpty = isEmpty;
    }

    @Override
    public String toString() {
        return "Garage{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", isEmpty=" + isEmpty +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}

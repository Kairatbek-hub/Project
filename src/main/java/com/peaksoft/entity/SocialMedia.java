package com.peaksoft.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "social_medias")
public class SocialMedia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String socialMedia;

    @ManyToMany(cascade = {CascadeType.DETACH,CascadeType.MERGE,
            CascadeType.PERSIST,CascadeType.REFRESH})
    private List<Person> personList;

    public SocialMedia() {
    }

    public SocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }
    public void addPersonToMedia(Person person){
        if (personList == null) {
            personList = new ArrayList<>();
        }
        personList.add(person);
    }

    public List<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    @Override
    public String toString() {
        return "SocialMedia{" +
                "id=" + id +
                ", socialMedia='" + socialMedia + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSocialMedia() {
        return socialMedia;
    }

    public void setSocialMedia(String socialMedia) {
        this.socialMedia = socialMedia;
    }
}

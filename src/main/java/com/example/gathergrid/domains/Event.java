package com.example.gathergrid.domains;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;
import java.util.List;

@Entity
public class Event {
    @Id @GeneratedValue
    private long id;
    private String name;
    private Date date;
    private Time hour;
    private String location;
    private String description;
    @OneToOne
    private EventCategory category;
    @OneToOne
    private User organizer;
    @ManyToMany
    private List<User> participants;
}

package com.jarekjal.endo2.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "trainings")
public class Training {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "start")
    private LocalDateTime start;

    @Column(name = "activity", nullable = false)
    private String activity;

    @Column(name = "distance")
    private Integer distance;

    @Column(name = "duration", nullable = false)
    private Integer duration;

    @Column(name = "description")
    private String description;

    public Training() {
    }

    public Training(LocalDateTime start, String activity, Integer distance, Integer duration, String description) {
        this.start = start;
        this.activity = activity;
        this.distance = distance;
        this.duration = duration;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getStart() {
        return start;
    }

    public void setStart(LocalDateTime start) {
        this.start = start;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

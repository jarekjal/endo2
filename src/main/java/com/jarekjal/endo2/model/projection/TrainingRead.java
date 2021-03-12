package com.jarekjal.endo2.model.projection;

import com.jarekjal.endo2.model.Training;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class TrainingRead {

    private Integer id;
    private LocalDateTime start;
    private String activity;
    private Integer distance;
    private LocalTime duration;
    private String description;

    public TrainingRead(Training source) {
        this.id = source.getId();
        this.start = source.getStart();
        this.activity = source.getActivity();
        this.distance = source.getDistance();
        this.duration = LocalTime.ofSecondOfDay(source.getDuration());
        this.description = source.getDescription();
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

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package com.jarekjal.endo2.model.projection;

import com.jarekjal.endo2.model.Training;

import java.time.LocalDateTime;

public class TrainingRead {

    private Integer id;
    private LocalDateTime start;
    private String activity;
    private Integer distance;
    private Integer duration;
    private String description;

    public TrainingRead(Training source) {
        this.id = source.getId();
        this.start = source.getStart();
        this.activity = source.getActivity();
        this.distance = source.getDistance();
        this.duration = source.getDuration();
        this.description = source.getDescription();
    }
}

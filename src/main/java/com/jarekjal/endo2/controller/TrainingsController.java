package com.jarekjal.endo2.controller;

import com.jarekjal.endo2.model.projection.TrainingRead;
import com.jarekjal.endo2.model.projection.TrainingWrite;
import com.jarekjal.endo2.repository.TrainingRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping(path = "/trainings")
public class TrainingsController {

    TrainingRepository trainingRepository;

    public TrainingsController(TrainingRepository trainingRepository) {
        this.trainingRepository = trainingRepository;
    }

    @RequestMapping(method = RequestMethod.POST)
    ResponseEntity<?> createTraining(@RequestBody TrainingWrite source){
        var saved = trainingRepository.save(source.toTraining());
        return ResponseEntity.created(URI.create("/trainings/" + saved.getId())).build();
    }

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<?> readAllTrainings(){
        return ResponseEntity.ok(trainingRepository.findAll().stream().map(TrainingRead::new));
    }

}

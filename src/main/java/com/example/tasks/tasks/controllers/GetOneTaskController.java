package com.example.tasks.tasks.controllers;

import com.example.tasks.tasks.models.TaskModel;
import com.example.tasks.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
public class GetOneTaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("tasks/{taskId}")
    public ResponseEntity<Object> getOneTaskController(@PathVariable(value = "taskId")UUID taskId) {
        Optional<TaskModel> task = taskService.getOneTask(taskId);

        if(!task.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task Not Found");
        } else {
            return ResponseEntity.status(HttpStatus.OK).body(task.get());
        }
    }
}

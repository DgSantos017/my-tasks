package com.example.tasks.tasks.controllers;

import com.example.tasks.tasks.models.TaskModel;
import com.example.tasks.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class GetAllTasksController {

    @Autowired
    TaskService taskService;

    @GetMapping("/tasks")
    public ResponseEntity<List<TaskModel>> getAllTasks () {
        return ResponseEntity.status(HttpStatus.OK).body(taskService.getAllTasks());
    }
}

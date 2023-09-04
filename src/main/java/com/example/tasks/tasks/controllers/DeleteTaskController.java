package com.example.tasks.tasks.controllers;

import com.example.tasks.tasks.models.TaskModel;
import com.example.tasks.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;
import java.util.UUID;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class DeleteTaskController {
    @Autowired
    TaskService taskService;

    @DeleteMapping("/tasks/{taskId}")
    public ResponseEntity<Object> deleteTask (@PathVariable(value = "taskId")UUID taskId) {
        Optional<TaskModel> task = taskService.getOneTask(taskId);

        if(!task.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task Not Found");
        } else {
            taskService.deleteTask(task.get());
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("");
        }
    }
}

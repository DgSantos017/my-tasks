package com.example.tasks.tasks.controllers;

import com.example.tasks.tasks.models.TaskModel;
import com.example.tasks.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
import java.util.UUID;

@RestController
@CrossOrigin(origins = "*")
public class UpdateTaskController {
    @Autowired
    TaskService taskService;

    @PutMapping("tasks/{taskId}")
    public ResponseEntity<Object> updateTaskController(@PathVariable(value = "taskId") UUID taskId,
                                                       @RequestBody TaskModel taskModel) {
        Optional<TaskModel> task = taskService.getOneTask(taskId);

        if(!task.isPresent()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Task Not Found");
        } else {
            taskService.updateTask(taskModel, taskId);
            return ResponseEntity.status(HttpStatus.OK).body(task.get());
        }
    }
}

package com.example.tasks.tasks.services;

import com.example.tasks.tasks.models.TaskModel;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TaskService {
    TaskModel createTask(TaskModel taskModel);
    List<TaskModel> getAllTasks();
    Optional<TaskModel> getOneTask(UUID taskId);
    Optional<TaskModel> updateTask(TaskModel taskModel, UUID taskId);
    void deleteTask(TaskModel taskModel);
}

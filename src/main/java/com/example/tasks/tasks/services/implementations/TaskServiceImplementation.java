package com.example.tasks.tasks.services.implementations;

import com.example.tasks.tasks.models.TaskModel;

import com.example.tasks.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import com.example.tasks.tasks.repositories.TaskRepository;

@Service
public class TaskServiceImplementation implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public TaskModel createTask(TaskModel taskModel) {
        return taskRepository.save(taskModel);
    }

    @Override
    public List<TaskModel> getAllTasks() {
        return taskRepository.findAll();
    }

    @Override
    public Optional<TaskModel> getOneTask(UUID taskId) {
        return taskRepository.findById(taskId);
    }

    @Override
    public Optional<TaskModel> updateTask(TaskModel taskModel, UUID taskId) {
        Optional<TaskModel> existingTaskOptional = taskRepository.findById(taskId);
        TaskModel existingTask = existingTaskOptional.get();

        existingTask.setName(taskModel.getName());
        existingTask.setDescription(taskModel.getDescription());

        taskRepository.save(existingTask);
        return Optional.of(existingTask);
    }

    @Override
    public void deleteTask(TaskModel taskModel) {
        taskRepository.delete(taskModel);
    }
}

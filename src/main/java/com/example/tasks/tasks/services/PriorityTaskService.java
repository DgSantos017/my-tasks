package com.example.tasks.tasks.services;

import com.example.tasks.tasks.models.TaskModel;

public interface PriorityTaskService extends TaskService {
    TaskModel setPriority(TaskModel taskModel, int priority);
}

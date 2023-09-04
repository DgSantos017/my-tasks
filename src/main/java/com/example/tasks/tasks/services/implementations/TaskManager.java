package com.example.tasks.tasks.services.implementations;

import com.example.tasks.tasks.services.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

public class TaskManager {
    @Autowired
    private TaskService taskService;

    // O Spring injetará automaticamente a implementação adequada
    // ( TaskServiceImplementation ou PriorityTaskServiceImplemenatation )

}

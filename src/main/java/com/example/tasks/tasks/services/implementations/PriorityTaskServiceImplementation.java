package com.example.tasks.tasks.services.implementations;

import com.example.tasks.tasks.models.TaskModel;
import com.example.tasks.tasks.services.PriorityTaskService;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class PriorityTaskServiceImplementation implements PriorityTaskService {
    @Override
    public TaskModel setPriority(TaskModel taskModel, int priority) {
        // Implementação para adicionar uma tarefa prioritária
        return null;
    }

    @Override
    public TaskModel createTask(TaskModel taskModel) {
        // Implementação para listar tarefas prioritárias
        return null;
    }

    @Override
    public List<TaskModel> getAllTasks() {
        // Implementação para obter uma tarefa prioritária
        return null;
    }

    @Override
    public Optional<TaskModel> getOneTask(UUID taskId) {
        // Implementação para atualizar uma tarefa prioritária
        return Optional.empty();
    }

    @Override
    public Optional<TaskModel> updateTask(TaskModel taskModel, UUID taskId) {
        // Implementação para excluir uma tarefa prioritária
        return Optional.empty();
    }

    @Override
    public void deleteTask(TaskModel taskModel) {
        // Implementação para definir a prioridade de uma tarefa
    }
}

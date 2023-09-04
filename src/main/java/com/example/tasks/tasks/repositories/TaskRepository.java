package com.example.tasks.tasks.repositories;

import com.example.tasks.tasks.models.TaskModel;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.UUID;

public interface TaskRepository extends JpaRepository<TaskModel, UUID> {
}

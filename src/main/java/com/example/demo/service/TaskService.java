package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.stereotype.Service;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Optional<Task> findTask(Long id) {
        return taskRepository.findById(id);
    }

    public String deleteTask(Long id) {
        Optional<Task> task = findTask(id);
        if (task.isPresent()) {
            taskRepository.deleteById(id);
            return "Task deleted successfully";
        } else {
            return "Task with ID " + id + " not found";
        }
    }
}

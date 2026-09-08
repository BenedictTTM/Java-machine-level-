package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.service.TaskService;
import com.example.demo.model.Task;
import java.util.*;

@RestController 
@RequestMapping("/tasks")
public class TaskController {
   public final TaskService taskService;
   public TaskController(TaskService taskService){
     this.taskService = taskService;
   }

    @GetMapping
    public List <Task> getAllTask(){
        return taskService.getAllTasks();
    }
    
}

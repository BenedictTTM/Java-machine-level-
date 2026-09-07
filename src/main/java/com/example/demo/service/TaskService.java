package com.example.demo.service;
import com.example.demo.repository.TaskRepository;
import com.example.demo.model.Task;
import org.springframework.stereotype.Service;
import java.util.*;


@Service
public class TaskService {
    private      final TaskRepository taskRepository ;

    public TaskService(TaskRepository taskRepository ){
     this.taskRepository = taskRepository;
    }

    public Task createTask(Task task){
    Task singletask = taskRepository.save(task);
     return  singletask;
    }

    public List<Task> getAllTasks(){
    List<Task> allTask = taskRepository.findAll();
    return allTask;
    }

    public Optional getTaskById(Long id){
        return taskRepository.findById(id);
    }

    public String deleteTask(Long id){
        Optional<Task> findtask = getTaskById(id);
        if(findtask.isPresent()){
            taskRepository.deleteById(id);
            return "task found";
        }else {
        return "task not found";
        }
    }

    public String updateTask(Long id , Task updatedTask){
    Optional<Task> findtask = getTaskById(id);
    if(findtask.isPresent()){
       Task existingTask = findtask.get();
       existingTask.setTitle(updatedTask.getTitle());
        return "Updated";
    }else{
        return "failed";
    }
    }
}   

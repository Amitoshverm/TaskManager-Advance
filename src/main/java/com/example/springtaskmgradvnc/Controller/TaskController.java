package com.example.springtaskmgradvnc.Controller;

import com.example.springtaskmgradvnc.Services.TaskService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tasks")
public class TaskController {

    final TaskService taskService;
    public TaskController(TaskService taskService){
        this.taskService = taskService ;
    }
}

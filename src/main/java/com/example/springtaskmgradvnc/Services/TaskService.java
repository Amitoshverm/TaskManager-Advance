package com.example.springtaskmgradvnc.Services;

import com.example.springtaskmgradvnc.Repository.NotesRepository;
import com.example.springtaskmgradvnc.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService {


    final TaskRepository taskRepository;
    final NotesRepository notesRepository;

    public TaskService(TaskRepository taskRepository, NotesRepository notesRepository){
        this.taskRepository = taskRepository;
        this.notesRepository = notesRepository;
    }

}

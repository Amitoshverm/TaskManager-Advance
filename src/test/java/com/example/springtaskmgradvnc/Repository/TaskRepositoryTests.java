package com.example.springtaskmgradvnc.Repository;

import com.example.springtaskmgradvnc.Entities.TaskEntity;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class TaskRepositoryTests {
    @Autowired TaskRepository taskRepository;

    @Test
    public void testCreateTask(){
        TaskEntity task = new TaskEntity();
        task.setTitle("Test task");
        task.setDescription("Test Description");
        task.setCompleted(false);
        var savedTask = taskRepository.save(task);
        assertNotNull(savedTask);
    }
    @Test
    public void taskWorks(){
        TaskEntity task = new TaskEntity();
        task.setTitle("Test task");
        task.setDescription("Test Description");
        task.setCompleted(false);
        TaskEntity task1 = new TaskEntity();
        task1.setTitle("Test task1 ");
        task1.setDescription("Test Description1 ");
        task1.setCompleted(false);
        taskRepository.save(task);
        taskRepository.save(task1);
        var tasks = taskRepository.findAll();
        assertNotNull(tasks);
        assertEquals(2, tasks.size());
    }
    @Test
    public void testFind(){
        TaskEntity task = new TaskEntity();
        task.setTitle("Test task");
        task.setDescription("Test Description");
        task.setCompleted(false);
        TaskEntity task1 = new TaskEntity();
        task1.setTitle("Test task1 ");
        task1.setDescription("Test Description1 ");
        task1.setCompleted(true);
        taskRepository.save(task);
        taskRepository.save(task1);
        var taskCompleted = taskRepository.findAllByCompleted(true);
        var taskInCompleted = taskRepository.findAllByCompleted(false);
        assertEquals(1, taskCompleted.size());
        assertEquals(1, taskInCompleted.size());

    }

}

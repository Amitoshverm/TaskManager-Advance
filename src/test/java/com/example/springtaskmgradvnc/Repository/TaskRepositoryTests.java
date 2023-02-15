package com.example.springtaskmgradvnc.Repository;

import com.example.springtaskmgradvnc.Entities.TaskEntity;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
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

}

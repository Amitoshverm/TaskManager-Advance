package com.example.springtaskmgradvnc.Repository;

import com.example.springtaskmgradvnc.Entities.TaskEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<TaskEntity, Integer> {
    List<TaskEntity> findAllByCompleted(Boolean completed);
}

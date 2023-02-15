package com.example.springtaskmgradvnc.Repository;

import com.example.springtaskmgradvnc.Entities.NoteEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesRepository extends JpaRepository<NoteEntity, Integer> {
}

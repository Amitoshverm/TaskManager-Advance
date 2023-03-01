package com.example.springtaskmgradvnc.dto;

import com.example.springtaskmgradvnc.Entities.TaskEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Request {
    private TaskEntity taskEntity;

}

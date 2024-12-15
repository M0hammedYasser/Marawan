package com.spring.model.dto;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class AssessmentDto {

    private int assessmentId;
    private int courseId;
    private String title;
    private String type;
    private String dueDate;
}

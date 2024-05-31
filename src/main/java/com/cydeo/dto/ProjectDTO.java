package com.cydeo.dto;

import com.cydeo.enums.Status;

import java.time.LocalDate;

public class ProjectDTO {
    private String projectName;
    private String projectCode;
    private UserDTO assignedManager;
    private LocalDate startDate;
    private LocalDate endDate;
    private String projectDetail;
    private Status projectStatus;


}

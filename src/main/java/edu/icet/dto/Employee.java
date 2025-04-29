package edu.icet.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

import java.time.LocalDateTime;

public class Employee {
    private Integer id;

    @NotBlank(message = "Name must not be empty")
    @Pattern(regexp = "^[A-Za-z ]+$", message = "Name must contain only alphabetic characters and spaces")
    @Size(max = 100, message = "Name must not exceed 100 characters")
    private String name;

    @NotBlank(message = "Email must not be empty")
    @Email(message = "Email must be a valid format")
    private String email;

    @NotBlank(message = "Department must not be empty")
    @Pattern(regexp = "HR|IT|Finance|Operations", message = "Department must be one of: HR, IT, Finance, Operations")
    private  String department;

    private LocalDateTime createAt;
    private LocalDateTime updateAt;
}

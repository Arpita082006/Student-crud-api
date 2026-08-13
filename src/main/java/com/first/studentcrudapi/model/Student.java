package com.first.studentcrudapi.model;

import jakarta.persistence.*;
import lombok.Data;

import jakarta.validation.constraints.*;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Name is required")
    private String name;

    @Email(message = "Invalid email format")
    @NotBlank(message = "Email is required")
    private String email;

    @Min(value = 15, message = "Age must be at least 15")
    private int age;

    @NotBlank(message = "Department is required")
    private String department;
}
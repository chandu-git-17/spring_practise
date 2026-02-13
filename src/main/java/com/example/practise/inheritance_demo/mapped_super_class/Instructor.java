package com.example.practise.inheritance_demo.mapped_super_class;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "mapped_instructor")
public class Instructor extends MappedUser{
    private String specialization;
}

package com.example.practise.inheritance_demo.single;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@DiscriminatorValue(value = "2")
public class SingleInstructor extends SingleBaseModel{
    private String specialization;
}

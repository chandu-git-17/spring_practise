package com.example.practise.inheritance_demo.tpc;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class TpcInstructor extends TpcBaseModel{

    private String specialization;

}

package com.example.practise.inheritance_demo.mapped_super_class;

import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class MappedUser {

    @Id
    private Long id;
    private String name;

}

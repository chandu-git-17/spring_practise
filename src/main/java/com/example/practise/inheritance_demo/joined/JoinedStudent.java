package com.example.practise.inheritance_demo.joined;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@PrimaryKeyJoinColumn(name = "user_id")
public class JoinedStudent extends JoinedUser{
    private String batch;
}

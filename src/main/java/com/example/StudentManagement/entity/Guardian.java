package com.example.StudentManagement.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Guardian {

    @Column(name = "guardian_name")
    private String name;
    @Column(name = "guardian_email")
    private String email;
    @Column(name = "guardian_mobile")
    private String mobile;
}

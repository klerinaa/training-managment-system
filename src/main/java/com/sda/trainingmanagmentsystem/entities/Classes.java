package com.sda.trainingmanagmentsystem.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Classes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long classesId;
    private String className;
    @ManyToOne
    @JoinColumn(name = "groupClassesId")
    private GroupClasses group;

}

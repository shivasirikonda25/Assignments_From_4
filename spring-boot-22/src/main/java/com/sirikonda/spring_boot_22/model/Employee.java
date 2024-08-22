package com.sirikonda.spring_boot_22.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Employee")
public class Employee
{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String firstname;
    private String lastname;
    private String email;
    private String department;
    private long salary;
}

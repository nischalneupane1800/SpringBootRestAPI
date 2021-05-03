package com.springRest.SpringRestAPI.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Entity
public class Course {
    @Id
    private long id;
    private String title;
    private String description;
}

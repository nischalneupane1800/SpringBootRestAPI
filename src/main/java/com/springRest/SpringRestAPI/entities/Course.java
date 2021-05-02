package com.springRest.SpringRestAPI.entities;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Course {
    private long id;
    private String title;
    private String description;
}

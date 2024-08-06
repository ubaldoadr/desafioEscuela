package cl.praxis.EscuelaRural_JPA.model.entity;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "student")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="student_id")
    private int id;
    private String name;


    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(
            name = "student_course",
            joinColumns = @JoinColumn(name="student_id", referencedColumnName = "student_id"),
            inverseJoinColumns = @JoinColumn(name="course_id", referencedColumnName = "course_id")


    )
    private Set<Course> courses;

}

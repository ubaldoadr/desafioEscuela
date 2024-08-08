package cl.praxis.EscuelaRural_JPA.model.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Table(name = "course")
@Setter
@Getter

@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="course_id")
    private int id;
    private String title;

    @ManyToMany(mappedBy = "courses")
    private Set<Student> students;
}

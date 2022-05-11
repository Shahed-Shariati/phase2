package ir.maktab.phase2.model;

import ir.maktab.phase2.model.enumeration.TechnicianStatus;
import org.hibernate.annotations.Formula;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

@Entity
@PrimaryKeyJoinColumn(name = "user_id")
@Inheritance(strategy = InheritanceType.JOINED)
public class Technician extends Person {

    @Formula("select avg(c.score) from Comment c where c.technician_id = id")
    private Double score;

    @OneToMany(mappedBy = "technician",cascade = CascadeType.ALL)
    private Set<Comment> comments;

    @ManyToMany(cascade = { CascadeType.ALL })
    @JoinTable(
            name = "Service_Technician",
            joinColumns = { @JoinColumn(name = "technician_id") },
           inverseJoinColumns = { @JoinColumn(name = "sub_service_id") }
    )
    private List<SubSpecialist> services;

    @Lob
    private byte[] image;

    @Enumerated(EnumType.STRING)
    private TechnicianStatus technicianStatus;

 public Technician(Integer integer, String firstName, String lastName, String email, String passWord, Role role, LocalDateTime creationTime, Double score, Set<Comment> comments, List<SubSpecialist> services, byte[] image, TechnicianStatus technicianStatus) {
  super(integer, firstName, lastName, email, passWord, role, creationTime);
  this.score = score;
  this.comments = comments;
  this.services = services;
  this.image = image;
  this.technicianStatus = technicianStatus;
 }

 public Technician() {
 }
}

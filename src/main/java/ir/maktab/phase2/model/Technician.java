package ir.maktab.phase2.model;

import ir.maktab.phase2.model.enumeration.TechnicianStatus;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Formula;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;

@Entity
//@PrimaryKeyJoinColumn(name = "user_id")
@Getter
@Setter
//@Inheritance(strategy = InheritanceType.JOINED)
public class Technician extends Person implements Comparator<Technician> {

  /*  @Formula("select avg(c.score) from Comment c where c.technician_id = id")

*/


    private Double score;

    @OneToMany(mappedBy = "technician",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private Set<Comment> comments;

    @ManyToMany(cascade = { CascadeType.ALL },fetch = FetchType.EAGER)
    @JoinTable(
            name = "Service_Technician",
            joinColumns = { @JoinColumn(name = "technician_id") },
           inverseJoinColumns = { @JoinColumn(name = "sub_service_id") }
    )
    private List<SubSpecialist> subSpecialists;

    @Lob
    @Type(type = "org.hibernate.type.ImageType")
    private byte[] image;

    @Enumerated(EnumType.STRING)
    private TechnicianStatus technicianStatus;

    public Technician(Integer integer, String firstName, String lastName, String email, String passWord, Role role, LocalDateTime creationTime, Set<Comment> comments, List<SubSpecialist> subSpecialists, byte[] image, TechnicianStatus technicianStatus) {
        super(integer, firstName, lastName, email, passWord, role, creationTime);
        this.comments = comments;
        this.subSpecialists = subSpecialists;
        this.image = image;
        this.technicianStatus = technicianStatus;
    }

    public Technician() {
 }

    @Override
    public String toString() {
        return "Technician{" +
                "score=" + "" +
                ", comments=" + comments +
                ", subSpecialists=" + subSpecialists +

                ", technicianStatus=" + technicianStatus +
                '}';
    }

    @Override
    public int compare(Technician o1, Technician o2) {
        if(o1.getScore() == o2.getScore())
            return 0;
        if(o1.getScore() > o2.getScore())
            return 1;
        return -1;
    }
}

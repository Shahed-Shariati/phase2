package ir.maktab.phase2.model;

import ir.maktab.phase2.model.base.BaseEntity;
import lombok.*;


import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import java.util.Set;

@Entity
@Data
@Setter
@Getter
public class Specialist extends BaseEntity<Integer> {
    private String name;


    public Specialist(Integer integer, String name) {
        super(integer);
        this.name = name;
    }

    public Specialist() {
    }
}

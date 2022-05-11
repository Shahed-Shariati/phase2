package ir.maktab.phase2.model;




import ir.maktab.phase2.model.base.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@Getter
@Setter
public class Role extends BaseEntity<Integer> {

    private String role;

    public Role() {
    }

    public Role(Integer integer, String role) {
        super(integer);
        this.role = role;
    }


}


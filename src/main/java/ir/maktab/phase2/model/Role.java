package ir.maktab.phase2.model;




import ir.maktab.phase2.model.base.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Role extends BaseEntity<Integer> {

    private String role;

    public Role() {
    }

}


package ir.maktab.phase2.model;




import ir.maktab.phase2.model.base.BaseEntity;

import javax.persistence.Entity;

@Entity
public class Role extends BaseEntity<Integer> {

    private String role;

    public Role() {
    }

    public Role(Integer integer, String role) {
        super(integer);
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}


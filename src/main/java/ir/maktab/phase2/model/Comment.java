package ir.maktab.phase2.model;

import ir.maktab.phase2.model.base.BaseEntity;


import javax.persistence.*;

@Entity
public class Comment extends BaseEntity<Integer> {
    private String comment;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "technician_id")
    private Technician technician;

    @OneToOne
    private Offer offer;

    private Integer score;


    public Comment(Integer integer, String comment, Technician technician, Integer score,Offer offer) {
        super(integer);
        this.comment = comment;
        this.technician = technician;
       this.offer = offer;
        this.score = score;
    }

    public Comment() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

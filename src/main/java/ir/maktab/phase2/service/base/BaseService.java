package ir.maktab.phase2.service.base;


import ir.maktab.phase2.model.base.BaseEntity;

import java.io.Serializable;
import java.util.List;

public interface BaseService<E extends BaseEntity<ID>, ID extends Serializable> {


    void save(E e);

    void delete(E e);

    List<E> findAll();

    E findById(ID id);


}

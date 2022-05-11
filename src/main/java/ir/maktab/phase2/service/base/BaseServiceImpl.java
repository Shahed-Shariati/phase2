package ir.maktab.phase2.service.base;

import ir.maktab.phase2.model.base.BaseEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;


import java.io.Serializable;
import java.util.List;

public class BaseServiceImpl<R extends JpaRepository<E,ID>,E extends BaseEntity<ID> , ID extends Serializable> implements BaseService<E,ID>{

    private R repository;

    public BaseServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    @Transactional
    public void save(E e) {
      repository.save(e);
    }

    @Override
    @Transactional
    public void delete(E e) {
     repository.delete(e);
    }

    @Override
    @Transactional
    public void update(E e) {

    }

    @Override
    public E findById(ID id) {
        return repository.findById(id).get();
    }

    @Override
    public List<E> findAll() {
        return repository.findAll();
    }
}

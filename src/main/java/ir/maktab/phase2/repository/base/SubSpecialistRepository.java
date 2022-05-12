package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.SubSpecialist;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SubSpecialistRepository extends JpaRepository<SubSpecialist,Integer> {
    List<SubSpecialist> findByParentSpecialistId(Integer id);
}

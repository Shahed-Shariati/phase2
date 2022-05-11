package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Technician;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TechnicianRepository extends JpaRepository<Technician,Integer> {
}

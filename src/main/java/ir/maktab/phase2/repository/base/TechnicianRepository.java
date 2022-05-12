package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TechnicianRepository extends JpaRepository<Technician,Integer> {


}

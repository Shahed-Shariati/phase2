package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TechnicianRepository extends JpaRepository<Technician,Integer> {

    @Modifying
    @Query("update Technician t set t.email = :email where t.id = :id")
    Integer upDatePassword(@Param("email") String email,@Param("id") Integer id);

}

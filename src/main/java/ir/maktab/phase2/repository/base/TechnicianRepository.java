package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Technician;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface TechnicianRepository extends JpaRepository<Technician,Integer> {

    @Override
    @Query(value = "select * , 0 As Clazz from person p " +
            "inner join technician t on t.user_id = p.id " +
            "inner join service_technician st on st.technician_id=t.user_id " +
            "inner join sub_specialist sp on sp.id = st.sub_service_id" +
            " where t.user_id = :id",nativeQuery = true)
    Optional<Technician> findById(@Param("id") Integer integer);
}

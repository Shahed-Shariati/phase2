package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface CustomerRepository extends JpaRepository<Customer,Integer> , JpaSpecificationExecutor<Customer> {
    @Modifying
    @Query("update Customer c set c.email = :email where c.id = :id")
    Integer upDatePassword(@Param("email") String email, @Param("id") Integer id);

}

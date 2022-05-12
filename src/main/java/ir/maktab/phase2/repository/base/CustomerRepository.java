package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Customer;
import org.hibernate.criterion.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer,Integer> , JpaSpecificationExecutor<Customer> , QueryByExampleExecutor<Customer> {
    @Modifying
    @Query("update Customer c set c.email = :email where c.id = :id")
    Integer upDatePassword(@Param("email") String email, @Param("id") Integer id);

}

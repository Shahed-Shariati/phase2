package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CustomerRepository extends JpaRepository<Customer,Integer> , JpaSpecificationExecutor<Customer> {

}

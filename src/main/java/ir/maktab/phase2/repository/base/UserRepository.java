package ir.maktab.phase2.repository.base;

import ir.maktab.phase2.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface UserRepository extends JpaRepository<Person,Integer> {




   /* @Query(value = "SELECT * , 0 AS clazz_ FROM person p WHERE p.email = :email",nativeQuery = true)
    Person login(@Param("email") String email);
*/

    /*@Modifying
    @Query("update Person p set p.email = :email where p.id = :id")
    Integer upDatePassword(@Param("email") String email,@Param("id") Integer id);
*/

}

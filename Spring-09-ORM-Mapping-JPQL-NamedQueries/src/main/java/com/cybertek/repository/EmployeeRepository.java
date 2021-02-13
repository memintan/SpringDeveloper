package com.cybertek.repository;

import com.cybertek.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    @Query("SELECT e FROM Employee e WHERE e.email='dtrail8@tamu.edu'")
    Employee getEmployeeDetail();

    @Query("SELECT e.salary FROM Employee e WHERE e.email='dtrail8@tamu.edu'")
    Integer getEmployeeSalary();

    //single bind parameter
    @Query("SELECT e FROM Employee e WHERE e.email=?1")
    Optional<Employee> getEmployeeByEmail(String email);

    //multiple bind parameter
    @Query("SELECT e FROM Employee e WHERE e.email=?1 AND e.salary=?2")
    Optional<Employee> getEmployeeByEmailAndSalary(String email, Integer salary);

    //single bind parameter
    @Query("SELECT e FROM Employee e WHERE e.salary=:salary")
    Employee getEmployeeBySalary(@Param("salary") int salary);

    //multiple bind parameter
    @Query("SELECT e FROM Employee e WHERE e.firstName=:name OR e.salary=:salary")
    List<Employee> getEmployeeByByFirstNameOrSalary(@Param("name") String name, @Param("salary") int salary);
}

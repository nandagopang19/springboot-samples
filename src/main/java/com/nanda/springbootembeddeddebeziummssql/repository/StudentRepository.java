package com.nanda.springbootembeddeddebeziummssql.repository;


import com.nanda.springbootembeddeddebeziummssql.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

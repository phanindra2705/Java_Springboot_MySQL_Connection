package io.avien.spting.mysql.demo_mysql;

import io.avien.spting.mysql.demo_mysql.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}


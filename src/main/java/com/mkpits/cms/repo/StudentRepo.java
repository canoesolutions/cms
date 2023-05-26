package com.mkpits.cms.repo;

import com.mkpits.cms.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student, Long> {
}

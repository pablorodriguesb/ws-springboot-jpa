package com.devspringpablo.course.repositories;

import com.devspringpablo.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}

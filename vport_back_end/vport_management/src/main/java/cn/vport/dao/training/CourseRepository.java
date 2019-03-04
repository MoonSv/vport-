package cn.vport.dao.training;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.vport.domain.training.base.Course;

public interface CourseRepository extends JpaRepository<Course, Integer>{

}

package cn.vport.service.courseAndTraining;

import java.util.List;

import cn.vport.domain.courseAndTraining.base.Course;

public interface CourseService {
	List<Course> findAll();

	void save(Course course);
}

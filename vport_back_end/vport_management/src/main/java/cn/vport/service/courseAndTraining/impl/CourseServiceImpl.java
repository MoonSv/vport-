package cn.vport.service.courseAndTraining.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.vport.domain.courseAndTraining.base.Course;
import cn.vport.mapper.courseAndTraining.base.CourseMapper;
import cn.vport.service.courseAndTraining.CourseService;
@Service
public class CourseServiceImpl implements CourseService{
	@Autowired
	private CourseMapper courseMapper;

	@Override
	public List<Course> findAll() {
		return courseMapper.selectByExample(null);
	}

	@Override
	public void save(Course course) {
		courseMapper.insert(course);
		
	}
	
}

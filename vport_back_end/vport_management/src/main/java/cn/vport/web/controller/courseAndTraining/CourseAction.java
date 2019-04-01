package cn.vport.web.controller.courseAndTraining;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import cn.vport.domain.courseAndTraining.base.Course;
import cn.vport.service.courseAndTraining.CourseService;
/**
 * 
 *@description 处理与课程相关的请求 
 *@author Wang Siyu
 *
 */

@RestController
@RequestMapping("course")
public class CourseAction {
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/list")
	public List<Course> list(){
		List<Course> list = courseService.findAll();
		return list;
		
	}
	
	@RequestMapping("/save")
	public String save(Course course){
		System.out.println(course);
		//courseService.save(course);
		return "SUCCESS";
	}
}

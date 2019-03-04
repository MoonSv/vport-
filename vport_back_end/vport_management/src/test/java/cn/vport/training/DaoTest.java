package cn.vport.training;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.vport.dao.training.CourseRepository;
import cn.vport.dao.training.TrainingClassRepository;
import cn.vport.dao.training.TrainingContentRepository;
import cn.vport.dao.training.TrainingPlanRepository;
import cn.vport.domain.training.PhysicalPlan;
import cn.vport.domain.training.TrainingClass;
import cn.vport.domain.training.TrainingPlan;
import cn.vport.domain.training.base.Course;
import cn.vport.domain.training.base.TrainingContent;
import cn.vport.service.training.TrainingPlanService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class DaoTest {
	@Autowired
	private CourseRepository courseRepository;
	@Autowired
	private TrainingContentRepository trainingContentRepository;
	@Autowired
	private TrainingClassRepository trainingClassRepository;
	@Autowired
	private TrainingPlanRepository trainingPlanRepository;
	@Autowired
	private TrainingPlanService trainingPlanService;
	@Test
	public void saveCourse() {
		Course course = new Course();
		course.setLevel("S");
		course.setBeginAge(12);
		course.setEndAge(14);
		course.setFee(2000d);
		course.setTrainingPeriod("3月");
		course.setPicUrl("www.baidu.com");
		courseRepository.save(course);
		
	}
	@Test
	public void saveTrainingContent() {
		TrainingContent content = new TrainingContent();
		content.setName("底线正拍");
		content.setDescription("安达市");
		trainingContentRepository.save(content);
	}
	@Test
	public void saveClass(){
		TrainingClass trainingClass = new TrainingClass();
		Course course = courseRepository.findOne(1);
		trainingClass.setCourse(course);
		trainingClass.setId("S001");
		trainingClass.setDeadLine(new Date());
		trainingClass.setStartTime(new Date());
		trainingClass.setStatus(1);
		trainingClass.setTrainingFrequent("1-3-5");
		trainingClass.setTrainingTime("16:00");
		trainingClassRepository.save(trainingClass);
	}
	@Test
	public void savePlan(){
		TrainingClass trainingClass = trainingClassRepository.findOne("S001");
		TrainingContent content = trainingContentRepository.findOne(2);
		TrainingPlan trainingPlan = new TrainingPlan();
		trainingPlan.setTrainingClass(trainingClass);
		trainingPlan.setCreateTime(new Date());
		trainingPlan.setStatus(1);
		trainingPlan.setTrainingDate(new Date());
		trainingPlan.setTrainingLocation("龙泉路");
		PhysicalPlan physicalPlan = new PhysicalPlan();
		physicalPlan.setNumOfGroup(2);
		physicalPlan.setCountForEachGroup(20);
		physicalPlan.setTrainingContent(content);
		physicalPlan.setTrainingPlan(trainingPlan);

		trainingPlan.getPhysicalPlans().add(physicalPlan);
		trainingPlanService.save(trainingPlan);
	}
	@Test
	public void find(){
		List<TrainingPlan> list = trainingPlanRepository.findAll();
		for (TrainingPlan trainingPlan : list) {
			Set<PhysicalPlan> physicalPlans = trainingPlan.getPhysicalPlans();
			for (PhysicalPlan physicalPlan : physicalPlans) {
				physicalPlan.getCountForEachGroup();
			}
		}
	}
}

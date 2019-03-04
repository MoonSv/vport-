package cn.vport.service.training.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.vport.dao.training.TrainingPlanRepository;
import cn.vport.domain.training.TrainingPlan;
import cn.vport.service.training.TrainingPlanService;

@Service
@Transactional
public class TrainingPlanServiceImpl implements TrainingPlanService{
	@Autowired
	private TrainingPlanRepository trainingPlanRepository;
	@Override
	public void save(TrainingPlan trainingPlan) {
		trainingPlanRepository.save(trainingPlan);
		
	}

}

package cn.vport.dao.training;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.vport.domain.training.TrainingPlan;

public interface TrainingPlanRepository extends JpaRepository<TrainingPlan, String>{

}

package cn.vport.dao.training;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.vport.domain.training.PhysicalPlan;

public interface PhysicalPlanRepository extends JpaRepository<PhysicalPlan, String>{

}

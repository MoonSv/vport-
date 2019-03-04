package cn.vport.dao.training;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.vport.domain.training.TrainingClass;

public interface TrainingClassRepository extends JpaRepository<TrainingClass, String>{

}

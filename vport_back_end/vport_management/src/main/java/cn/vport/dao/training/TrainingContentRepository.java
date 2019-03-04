package cn.vport.dao.training;

import org.springframework.data.jpa.repository.JpaRepository;

import cn.vport.domain.training.base.TrainingContent;

public interface TrainingContentRepository extends JpaRepository<TrainingContent, Integer>{

}

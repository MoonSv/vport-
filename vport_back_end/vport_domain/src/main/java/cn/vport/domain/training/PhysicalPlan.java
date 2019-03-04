package cn.vport.domain.training;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import cn.vport.domain.training.base.TrainingContent;

/**
 * 
 * @description 体能训练计划条目类
 * @author Wang Siyu
 *
 */
@Entity
@Table(name = "T_PYHSICAL_PLAN")
public class PhysicalPlan {
	@Id
	@GenericGenerator(name = "myuuid", strategy = "uuid")
	@GeneratedValue(generator = "myuuid")
	@Column(name = "C_ID")
	private String id;// 主键
	@Column(name = "C_NUM_OF_GROUP")
	private Integer numOfGroup;// 组数
	@Column(name = "C_COUNT_FOR_EACH_GROUP")
	private Integer countForEachGroup;// 每组数量
	@ManyToOne
	@JoinColumn(name = "C_TRAINING_CONTENT_ID")
	private TrainingContent trainingContent;// 训练内容
	@ManyToOne
	@JoinColumn(name="C_TRAINING_PLAN_ID")
	private TrainingPlan trainingPlan;//属于哪个训练计划

	public TrainingPlan getTrainingPlan() {
		return trainingPlan;
	}

	public void setTrainingPlan(TrainingPlan trainingPlan) {
		this.trainingPlan = trainingPlan;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getNumOfGroup() {
		return numOfGroup;
	}

	public void setNumOfGroup(Integer numOfGroup) {
		this.numOfGroup = numOfGroup;
	}

	public Integer getCountForEachGroup() {
		return countForEachGroup;
	}

	public void setCountForEachGroup(Integer countForEachGroup) {
		this.countForEachGroup = countForEachGroup;
	}

	public TrainingContent getTrainingContent() {
		return trainingContent;
	}

	public void setTrainingContent(TrainingContent trainingContent) {
		this.trainingContent = trainingContent;
	}

}

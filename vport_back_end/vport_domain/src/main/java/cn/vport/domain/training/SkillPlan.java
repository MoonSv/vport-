package cn.vport.domain.training;

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
 * @description 技能训练计划条目类
 * @author Wang Siyu
 *
 */
@Entity
@Table(name = "T_SKILL_PLAN")
public class SkillPlan {
	@Id
	@GenericGenerator(name = "myuuid", strategy = "uuid")
	@GeneratedValue(generator = "myuuid")
	@Column(name = "C_ID")
	private String id;
	@Column(name = "C_IS_CONTINUOUS")
	private String isContinuous;// 是都连续：连续；不连续
	@Column(name = "C_IS_LIMITEDTIME")
	private String isLimitedTime;// 是否限时：限时；不限时
	@Column(name = "C_IS_MOVED")
	private String isMoved;// 是否移动：移动；定点
	@Column(name = "C_IS_MULTIPLE")
	private String isMultiple;// 多球；来回
	@Column(name = "C_IS_TARGET")
	private String isTarget;// 有无目标
	@Column(name = "C_SKILL_TYPE")
	private String skillType;// 训练类型：正手、反手、组合
	@Column(name = "C_NUM_OF_GROUP")
	private Integer numOfGroup;// 组数
	@Column(name = "C_COUNT_FOR_EACH_GROUP")
	private Integer countForEachGroup;// 每组数量
	@Column(name = "C_NUM_OF_SUCCESS")
	private Integer numOfSuccess;// 成功数
	@Column(name = "c_REQUIREDTIME")
	private Integer requiredTime;// 完成时间
	@ManyToOne
	@JoinColumn(name = "C_TRAINING_CONTENT_ID")
	private TrainingContent trainingContent;// 训练内容
	@ManyToOne
	@JoinColumn(name = "C_TRAINING_PLAN_ID")
	private TrainingPlan trainingPlan;// 属于哪个训练计划

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getIsContinuous() {
		return isContinuous;
	}

	public void setIsContinuous(String isContinuous) {
		this.isContinuous = isContinuous;
	}

	public String getIsLimitedTime() {
		return isLimitedTime;
	}

	public void setIsLimitedTime(String isLimitedTime) {
		this.isLimitedTime = isLimitedTime;
	}

	public String getIsMoved() {
		return isMoved;
	}

	public void setIsMoved(String isMoved) {
		this.isMoved = isMoved;
	}

	public String getIsMultiple() {
		return isMultiple;
	}

	public void setIsMultiple(String isMultiple) {
		this.isMultiple = isMultiple;
	}

	public String getIsTarget() {
		return isTarget;
	}

	public void setIsTarget(String isTarget) {
		this.isTarget = isTarget;
	}

	public String getSkillType() {
		return skillType;
	}

	public void setSkillType(String skillType) {
		this.skillType = skillType;
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

	public Integer getNumOfSuccess() {
		return numOfSuccess;
	}

	public void setNumOfSuccess(Integer numOfSuccess) {
		this.numOfSuccess = numOfSuccess;
	}

	public Integer getRequiredTime() {
		return requiredTime;
	}

	public void setRequiredTime(Integer requiredTime) {
		this.requiredTime = requiredTime;
	}

	public TrainingContent getTrainingContent() {
		return trainingContent;
	}

	public void setTrainingContent(TrainingContent trainingContent) {
		this.trainingContent = trainingContent;
	}

	public TrainingPlan getTrainingPlan() {
		return trainingPlan;
	}

	public void setTrainingPlan(TrainingPlan trainingPlan) {
		this.trainingPlan = trainingPlan;
	}

}

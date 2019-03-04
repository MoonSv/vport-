package cn.vport.domain.training.base;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import cn.vport.domain.training.PhysicalPlan;
import cn.vport.domain.training.SkillPlan;

/**
 * 
 * @description 训练内容明细类
 * @author Wang Siyu 自关联，形成树状结构
 */
@Entity
@Table(name = "T_TRAINING_CONTENT")
public class TrainingContent {
	@Id
	@GeneratedValue
	@Column(name = "C_ID")
	private Integer id;// 主键
	@Column(name = "C_NAME")
	private String name;// 内容名称
	@Column(name = "C_DESCRIPTION")
	private String description; // 内容描述

	@OneToMany(mappedBy = "parentContent")
	private Set<TrainingContent> childrenContent = new HashSet<TrainingContent>();

	@ManyToOne
	@JoinColumn(name = "C_PID")
	private TrainingContent parentContent;

	@OneToMany(mappedBy = "trainingContent")
	private Set<PhysicalPlan> physicalPlans = new HashSet<PhysicalPlan>();// 体能训练计划

	@OneToMany(mappedBy = "trainingContent")
	private Set<SkillPlan> skillPlans = new HashSet<SkillPlan>();// 技术训练计划

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<TrainingContent> getChildrenContent() {
		return childrenContent;
	}

	public void setChildrenContent(Set<TrainingContent> childrenContent) {
		this.childrenContent = childrenContent;
	}

	public TrainingContent getParentContent() {
		return parentContent;
	}

	public void setParentContent(TrainingContent parentContent) {
		this.parentContent = parentContent;
	}

	public Set<PhysicalPlan> getPhysicalPlans() {
		return physicalPlans;
	}

	public void setPhysicalPlans(Set<PhysicalPlan> physicalPlans) {
		this.physicalPlans = physicalPlans;
	}

	public Set<SkillPlan> getSkillPlans() {
		return skillPlans;
	}

	public void setSkillPlans(Set<SkillPlan> skillPlans) {
		this.skillPlans = skillPlans;
	}

}

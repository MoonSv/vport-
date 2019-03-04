package cn.vport.domain.user;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import cn.vport.domain.training.TrainingClass;

/**
 * 
 *@description 教练后台实体类  
 *@author Wang Siyu
 *
 */
@Entity
@Table(name="T_TRAINER")
public class Trainer {
	@Id
	@Column(name="C_ID")
	private String id;//员工号
	@Column(name="C_NAME")
	private String name;//姓名
	@Column(name="C_AGE")
	private Integer age;//年龄
	@Column(name="C_GENDER")
	private String gender;//性别
	@Column(name="C_LEVEL")
	private String level;//岗级
	@ManyToMany(mappedBy="chiefTrainer")
	private Set<TrainingClass> mainClasses;//担任主教练的班
	@ManyToMany(mappedBy="assistants")
	private Set<TrainingClass> assistClasses;//担任助理的班
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Set<TrainingClass> getMainClasses() {
		return mainClasses;
	}
	public void setMainClasses(Set<TrainingClass> mainClasses) {
		this.mainClasses = mainClasses;
	}
	public Set<TrainingClass> getAssistClasses() {
		return assistClasses;
	}
	public void setAssistClasses(Set<TrainingClass> assistClasses) {
		this.assistClasses = assistClasses;
	}
	
}

package cn.vport.domain.training.base;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import cn.vport.domain.training.TrainingClass;

/**
 * @description 训练课程类
 * @author Wang Siyu
 *
 */
@Entity
@Table(name="T_COURSE")
public class Course {
	@Id
	@GeneratedValue
	@Column(name="C_ID")
	private Integer id;//主键
	@Column(name="C_COURSE_NAME")
	private String courseName;//课程名字
	@Column(name="C_LEVEL")
	private String level;//级别
	@Column(name="C_BEGIN_AGE")
	private Integer beginAge;//这个字段与下面的endAge字段共同形成年龄要求
	@Column(name="C_END_AGE")
	private Integer endAge;
	@Column(name="C_PIC_URL")
	private String picUrl;//宣传图片或视频路径
	@Column(name="C_FEE")
	private Double fee;//收费标准
	@Column(name="C_TRAINING_PERIOD")
	private String trainingPeriod;//培训周期
	
	@OneToMany(mappedBy="course")
	private Set<TrainingClass> trainingClasses = new HashSet<TrainingClass>();//对应的训练班
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public Integer getBeginAge() {
		return beginAge;
	}
	public void setBeginAge(Integer beginAge) {
		this.beginAge = beginAge;
	}
	public Integer getEndAge() {
		return endAge;
	}
	public void setEndAge(Integer endAge) {
		this.endAge = endAge;
	}
	public String getPicUrl() {
		return picUrl;
	}
	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}
	public Double getFee() {
		return fee;
	}
	public void setFee(Double fee) {
		this.fee = fee;
	}
	public String getTrainingPeriod() {
		return trainingPeriod;
	}
	public void setTrainingPeriod(String trainingPeriod) {
		this.trainingPeriod = trainingPeriod;
	}
	@Override
	public String toString() {
		return "Course [id=" + id + ", level=" + level + ", beginAge="
				+ beginAge + ", endAge=" + endAge + ", picUrl=" + picUrl
				+ ", fee=" + fee + ", trainingPeriod=" + trainingPeriod + "]";
	}
	
	
}

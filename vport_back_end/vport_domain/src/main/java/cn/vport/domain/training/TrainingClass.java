package cn.vport.domain.training;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import cn.vport.domain.training.base.Course;
import cn.vport.domain.user.Player;
import cn.vport.domain.user.Trainer;

/**
 * 
 * @description 训练班实体类，描述训练班级信息
 * @author Wang Siyu
 *
 */
@Entity
@Table(name = "T_TRAINING_CLASS")
public class TrainingClass {
	@Id
	@Column(name = "C_ID")
	private String id;// 班号，主键
	@Column(name = "C_START_TIME")
	@Temporal(TemporalType.DATE)
	private Date startTime;// 开班时间
	@Column(name = "C_TRAINING_TIME")
	private String trainingTime;// 训练时间
	@Column(name = "C_TRAINING_FREQUENT")
	private String trainingFrequent;// 训练频率，eg.每周哪天训练
	@Column(name = "C_DEADLINE")
	@Temporal(TemporalType.DATE)
	private Date deadLine;// 报名截止时间
	@Column(name = "C_STATUS")
	private Integer status;// 状态：1.报名阶段；2.报名截止，还未开班；3.已开班；4.训练结束
	@ManyToMany
	@JoinTable(name = "T_CLASS_CHIEF", joinColumns = { 
			@JoinColumn(name = "C_CLASS_ID", referencedColumnName = "C_ID") }, 
			inverseJoinColumns = { @JoinColumn(name = "C_CHIEF_ID", referencedColumnName = "C_ID") })
	private Set<Trainer> chiefTrainer;// 主教练
	@ManyToMany
	@JoinTable(name = "T_CLASS_ASSIST", joinColumns = { 
			@JoinColumn(name = "C_CLASS_ID", referencedColumnName = "C_ID") }, 
			inverseJoinColumns = { @JoinColumn(name = "C_ASSIST_ID", referencedColumnName = "C_ID") })
	private Set<Trainer> assistants;// 助理教练
	@ManyToMany
	@JoinTable(name="T_CLASS_PLAYER",joinColumns={
			@JoinColumn(name="C_CLASS_ID",referencedColumnName="C_ID")},
			inverseJoinColumns={@JoinColumn(name="C_PLAYER_ID",referencedColumnName="C_ID")})
	private Set<Player> players = new HashSet<Player>();//该班球员
	

	@ManyToOne
	@JoinColumn(name = "C_COURSE_ID")
	private Course course;// 属于哪个课程
	@OneToMany(mappedBy = "trainingClass")
	private Set<TrainingPlan> trainingPlans = new HashSet<TrainingPlan>();// 训练计划

	public Set<Player> getPlayers() {
		return players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}
	public Set<TrainingPlan> getTrainingPlans() {
		return trainingPlans;
	}

	public void setTrainingPlans(Set<TrainingPlan> trainingPlans) {
		this.trainingPlans = trainingPlans;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public String getTrainingTime() {
		return trainingTime;
	}

	public void setTrainingTime(String trainingTime) {
		this.trainingTime = trainingTime;
	}

	public String getTrainingFrequent() {
		return trainingFrequent;
	}

	public void setTrainingFrequent(String trainingFrequent) {
		this.trainingFrequent = trainingFrequent;
	}

	public Date getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(Date deadLine) {
		this.deadLine = deadLine;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	public Set<Trainer> getChiefTrainer() {
		return chiefTrainer;
	}

	public void setChiefTrainer(Set<Trainer> chiefTrainer) {
		this.chiefTrainer = chiefTrainer;
	}

	public Set<Trainer> getAssistants() {
		return assistants;
	}

	public void setAssistants(Set<Trainer> assistants) {
		this.assistants = assistants;
	}

}

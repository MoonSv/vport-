package cn.vport.domain.training;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

/**
 * 
 * @description 训练计划实体类
 * @author Wang Siyu
 *
 */
@Entity
@Table(name = "T_TRAINING_PLAN")
public class TrainingPlan {
	@Id
	@GenericGenerator(name = "myuuid", strategy = "uuid")
	@GeneratedValue(generator = "myuuid")
	@Column(name = "C_ID")
	private String id;// 主键
	@Column(name = "C_TRAINING_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date trainingDate;// 训练日期
	@Column(name = "C_CREATE_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;// 创建时间
	@Column(name = "C_UPDATE_TIME")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTime;// 更新时间
	@Column(name = "C_TRAINING_LOCATION")
	private String trainingLocation;// 训练地点
	@Column(name = "C_STATUS")
	private Integer status;// 状态：1.未提交审批；2.提交审批；3.驳回；4.发布
	@ManyToOne
	@JoinColumn(name = "C_TRAINING_CLASS_ID")
	private TrainingClass trainingClass;// 属于哪个训练班
	@OneToMany(mappedBy = "trainingPlan",cascade=CascadeType.PERSIST,fetch=FetchType.LAZY)
	private Set<PhysicalPlan> physicalPlans = new HashSet<PhysicalPlan>();//体能训练条目
	@OneToMany(mappedBy = "trainingPlan",cascade=CascadeType.PERSIST,fetch=FetchType.LAZY)
	private Set<SkillPlan> skillPlans = new HashSet<SkillPlan>();//技术训练条目

	public Set<SkillPlan> getSkillPlans() {
		return skillPlans;
	}

	public void setSkillPlans(Set<SkillPlan> skillPlans) {
		this.skillPlans = skillPlans;
	}

	

	public Set<PhysicalPlan> getPhysicalPlans() {
		return physicalPlans;
	}

	public void setPhysicalPlans(Set<PhysicalPlan> physicalPlans) {
		this.physicalPlans = physicalPlans;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getTrainingDate() {
		return trainingDate;
	}

	public void setTrainingDate(Date trainingDate) {
		this.trainingDate = trainingDate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getTrainingLocation() {
		return trainingLocation;
	}

	public void setTrainingLocation(String trainingLocation) {
		this.trainingLocation = trainingLocation;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public TrainingClass getTrainingClass() {
		return trainingClass;
	}

	public void setTrainingClass(TrainingClass trainingClass) {
		this.trainingClass = trainingClass;
	}

}

package cn.vport.domain.user;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import cn.vport.domain.training.TrainingClass;

/**
 * 
 * @description 球员实体类
 * @author Wang Siyu
 *
 */
@Entity
@Table(name = "T_PLAYER")
public class Player {
	@Id
	@GeneratedValue
	@Column(name = "C_ID")
	private Integer id;// 主键
	@Column(name = "C_NAME")
	private String name;// 姓名
	@Column(name = "C_GENDER")
	private String gender;// 性别
	@Column(name = "C_BIRTHDAY")
	@Temporal(TemporalType.DATE)
	private Date birthday;// 生日
	@Transient
	private Integer age;
	@ManyToMany(mappedBy="players")
	private Set<TrainingClass> classes = new HashSet<TrainingClass>();
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	public Integer getAge() {
		Calendar now = Calendar.getInstance();
		now.setTime(new Date());
		Calendar birth = Calendar.getInstance();
		birth.setTime(birthday);
		if (birth.after(now)) {// 如果传入的时间，在当前时间的后面，返回0岁
			age = 0;
		} else {
			age = now.get(Calendar.YEAR) - birth.get(Calendar.YEAR);
			if (now.get(Calendar.DAY_OF_YEAR) > birth.get(Calendar.DAY_OF_YEAR)) {
				age += 1;
			}
		}
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Set<TrainingClass> getClasses() {
		return classes;
	}
	public void setClasses(Set<TrainingClass> classes) {
		this.classes = classes;
	}
	
}

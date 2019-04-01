package cn.vport.domain.courseAndTraining.base;

public class Course {
    @Override
	public String toString() {
		return "Course [id=" + id + ", courseName=" + courseName + ", level="
				+ level + ", beginAge=" + beginAge + ", endAge=" + endAge
				+ ", picUrl=" + picUrl + ", fee=" + fee + ", trainingPeriod="
				+ trainingPeriod + "]";
	}

	private Integer id;

    private String courseName;

    private String level;

    private Integer beginAge;

    private Integer endAge;

    private String picUrl;

    private Double fee;

    private String trainingPeriod;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level == null ? null : level.trim();
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
        this.picUrl = picUrl == null ? null : picUrl.trim();
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
        this.trainingPeriod = trainingPeriod == null ? null : trainingPeriod.trim();
    }
}
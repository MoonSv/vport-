package cn.vport.domain.courseAndTraining.base;

import java.util.Date;

public class TrainingClass {
    private String id;

    private Date startTime;

    private String traingTime;

    private String trainingFrequent;

    private Date deadLine;

    private Integer status;

    private Integer course;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getTraingTime() {
        return traingTime;
    }

    public void setTraingTime(String traingTime) {
        this.traingTime = traingTime == null ? null : traingTime.trim();
    }

    public String getTrainingFrequent() {
        return trainingFrequent;
    }

    public void setTrainingFrequent(String trainingFrequent) {
        this.trainingFrequent = trainingFrequent == null ? null : trainingFrequent.trim();
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

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }
}
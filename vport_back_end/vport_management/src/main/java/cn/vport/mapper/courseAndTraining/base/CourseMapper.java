package cn.vport.mapper.courseAndTraining.base;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import cn.vport.domain.courseAndTraining.base.Course;
import cn.vport.domain.courseAndTraining.base.CourseExample;

public interface CourseMapper {
    int countByExample(CourseExample example);

    int deleteByExample(CourseExample example);
	
    int deleteByPrimaryKey(Integer id);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}
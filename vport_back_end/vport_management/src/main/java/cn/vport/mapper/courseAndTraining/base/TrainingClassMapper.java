package cn.vport.mapper.courseAndTraining.base;

import cn.vport.domain.courseAndTraining.base.TrainingClass;
import cn.vport.domain.courseAndTraining.base.TrainingClassExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TrainingClassMapper {
    int countByExample(TrainingClassExample example);

    int deleteByExample(TrainingClassExample example);

    int insert(TrainingClass record);

    int insertSelective(TrainingClass record);

    List<TrainingClass> selectByExample(TrainingClassExample example);

    int updateByExampleSelective(@Param("record") TrainingClass record, @Param("example") TrainingClassExample example);

    int updateByExample(@Param("record") TrainingClass record, @Param("example") TrainingClassExample example);
}
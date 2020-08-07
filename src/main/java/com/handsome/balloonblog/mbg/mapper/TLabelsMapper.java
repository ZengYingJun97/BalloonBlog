package com.handsome.balloonblog.mbg.mapper;

import com.handsome.balloonblog.mbg.model.TLabels;
import com.handsome.balloonblog.mbg.model.TLabelsExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TLabelsMapper {
    long countByExample(TLabelsExample example);

    int deleteByExample(TLabelsExample example);

    int deleteByPrimaryKey(Long labelId);

    int insert(TLabels record);

    int insertSelective(TLabels record);

    List<TLabels> selectByExampleWithBLOBs(TLabelsExample example);

    List<TLabels> selectByExample(TLabelsExample example);

    TLabels selectByPrimaryKey(Long labelId);

    int updateByExampleSelective(@Param("record") TLabels record, @Param("example") TLabelsExample example);

    int updateByExampleWithBLOBs(@Param("record") TLabels record, @Param("example") TLabelsExample example);

    int updateByExample(@Param("record") TLabels record, @Param("example") TLabelsExample example);

    int updateByPrimaryKeySelective(TLabels record);

    int updateByPrimaryKeyWithBLOBs(TLabels record);

    int updateByPrimaryKey(TLabels record);
}
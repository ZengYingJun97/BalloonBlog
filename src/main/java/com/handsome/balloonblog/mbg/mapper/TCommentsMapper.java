package com.handsome.balloonblog.mbg.mapper;

import com.handsome.balloonblog.mbg.model.TComments;
import com.handsome.balloonblog.mbg.model.TCommentsExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TCommentsMapper {
    long countByExample(TCommentsExample example);

    int deleteByExample(TCommentsExample example);

    int deleteByPrimaryKey(Long commentId);

    int insert(TComments record);

    int insertSelective(TComments record);

    List<TComments> selectByExampleWithBLOBs(TCommentsExample example);

    List<TComments> selectByExample(TCommentsExample example);

    TComments selectByPrimaryKey(Long commentId);

    int updateByExampleSelective(@Param("record") TComments record, @Param("example") TCommentsExample example);

    int updateByExampleWithBLOBs(@Param("record") TComments record, @Param("example") TCommentsExample example);

    int updateByExample(@Param("record") TComments record, @Param("example") TCommentsExample example);

    int updateByPrimaryKeySelective(TComments record);

    int updateByPrimaryKeyWithBLOBs(TComments record);

    int updateByPrimaryKey(TComments record);
}
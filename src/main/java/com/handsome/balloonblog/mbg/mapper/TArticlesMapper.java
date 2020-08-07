package com.handsome.balloonblog.mbg.mapper;

import com.handsome.balloonblog.mbg.model.TArticles;
import com.handsome.balloonblog.mbg.model.TArticlesExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TArticlesMapper {
    long countByExample(TArticlesExample example);

    int deleteByExample(TArticlesExample example);

    int deleteByPrimaryKey(Long articleId);

    int insert(TArticles record);

    int insertSelective(TArticles record);

    List<TArticles> selectByExampleWithBLOBs(TArticlesExample example);

    List<TArticles> selectByExample(TArticlesExample example);

    TArticles selectByPrimaryKey(Long articleId);

    int updateByExampleSelective(@Param("record") TArticles record, @Param("example") TArticlesExample example);

    int updateByExampleWithBLOBs(@Param("record") TArticles record, @Param("example") TArticlesExample example);

    int updateByExample(@Param("record") TArticles record, @Param("example") TArticlesExample example);

    int updateByPrimaryKeySelective(TArticles record);

    int updateByPrimaryKeyWithBLOBs(TArticles record);

    int updateByPrimaryKey(TArticles record);
}
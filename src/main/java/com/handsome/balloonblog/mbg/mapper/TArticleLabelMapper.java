package com.handsome.balloonblog.mbg.mapper;

import com.handsome.balloonblog.mbg.model.TArticleLabel;
import com.handsome.balloonblog.mbg.model.TArticleLabelExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TArticleLabelMapper {
    long countByExample(TArticleLabelExample example);

    int deleteByExample(TArticleLabelExample example);

    int deleteByPrimaryKey(@Param("articleId") Long articleId, @Param("labelId") Long labelId);

    int insert(TArticleLabel record);

    int insertSelective(TArticleLabel record);

    List<TArticleLabel> selectByExample(TArticleLabelExample example);

    TArticleLabel selectByPrimaryKey(@Param("articleId") Long articleId, @Param("labelId") Long labelId);

    int updateByExampleSelective(@Param("record") TArticleLabel record, @Param("example") TArticleLabelExample example);

    int updateByExample(@Param("record") TArticleLabel record, @Param("example") TArticleLabelExample example);

    int updateByPrimaryKeySelective(TArticleLabel record);

    int updateByPrimaryKey(TArticleLabel record);
}
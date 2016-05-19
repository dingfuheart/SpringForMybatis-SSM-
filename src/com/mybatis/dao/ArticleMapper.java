package com.mybatis.dao;

import com.mybatis.model.Article;

public interface ArticleMapper {
    int deleteByPrimaryKey(Integer aId);

    int insert(Article record);

    int insertSelective(Article record);

    Article selectByPrimaryKey(Integer aId);

    int updateByPrimaryKeySelective(Article record);

    int updateByPrimaryKeyWithBLOBs(Article record);

    int updateByPrimaryKey(Article record);
}
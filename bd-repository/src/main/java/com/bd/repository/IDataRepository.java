package com.bd.repository;

import com.bd.model.entity.ContentEntity;
import com.bd.model.entity.SiteEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IDataRepository {
    @Select("SELECT * FROM d_content")
    List<ContentEntity> getContents();
    @Select("SELECT * FROM d_content where id=#{id}")
    ContentEntity getContentById(int id);
    @Select("SELECT * FROM d_site")
    List<SiteEntity> getSites();
    @Select("SELECT * FROM d_site WHERE id=#{id}")
    SiteEntity getSite(int id);
}

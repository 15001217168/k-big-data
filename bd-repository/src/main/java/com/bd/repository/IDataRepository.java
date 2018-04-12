package com.bd.repository;

import com.bd.model.entity.DataEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface IDataRepository {
    @Select("SELECT * FROM bd_data")
    List<DataEntity> getAll();
    @Select("SELECT * FROM bd_data WHERE id=#{id}")
    DataEntity getById(int id);
}

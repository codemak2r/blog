package com.example.blog.mappers;

import com.example.blog.models.Repo;
import org.apache.ibatis.annotations.Param;

public interface RepoMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Repo record);

    int insertSelective(Repo record);

    Repo selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Repo record);

    int updateByPrimaryKey(Repo record);

    int batchInsert(@Param("list") java.util.List<Repo> list);

    int batchInsertSelective(@Param("list") java.util.List<Repo> list, @Param("selective") Repo.Column ... selective);
}
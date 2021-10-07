package com.example.blog.mappers;

import com.example.blog.models.Post;
import org.apache.ibatis.annotations.Param;

public interface PostMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Post record);

    int insertSelective(Post record);

    Post selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Post record);

    int updateByPrimaryKeyWithBLOBs(Post record);

    int updateByPrimaryKey(Post record);

    int batchInsert(@Param("list") java.util.List<Post> list);

    int batchInsertSelective(@Param("list") java.util.List<Post> list, @Param("selective") Post.Column ... selective);
}
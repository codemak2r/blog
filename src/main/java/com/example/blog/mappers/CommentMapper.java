package com.example.blog.mappers;

import com.example.blog.models.Comment;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Comment record);

    int insertSelective(Comment record);

    Comment selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Comment record);

    int updateByPrimaryKeyWithBLOBs(Comment record);

    int updateByPrimaryKey(Comment record);

    int batchInsert(@Param("list") java.util.List<Comment> list);

    int batchInsertSelective(@Param("list") java.util.List<Comment> list, @Param("selective") Comment.Column ... selective);
}
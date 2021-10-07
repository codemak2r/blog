package com.example.blog.mappers;

import com.example.blog.models.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    int batchInsert(@Param("list") java.util.List<User> list);

    int batchInsertSelective(@Param("list") java.util.List<User> list, @Param("selective") User.Column ... selective);
}
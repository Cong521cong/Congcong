package com.qf.dao;

import com.qf.domain.User;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    //验证登陆
    User selectByName(@Param("loginName") String loginName);
    //增加
    Integer insert(User user);
    //删除
    Integer delete(@Param("userid") int userid);
    //修改
    Integer update(User user);
    //查全部
    List<User> selectAll();
    //查一个
    User selectOne(@Param("userid") int userid);
    //查询总行数
    public Integer count();

    //分页查询  @Param把参数转为map
    public List<User> selectByPage(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);
}
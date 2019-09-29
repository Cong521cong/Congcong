package com.qf.service;

import com.qf.domain.User;
import com.qf.pojo.PageBean;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserService {
    //验证
    boolean judge(String name,String qqEmail);
    //增加
    boolean insert(User user,String qqEmail,String code);
    //删除
    Integer delete(@Param("userid") int userid);
    //修改
    Integer update(User user);
    //查全部
    PageBean selectAll(Integer page, Integer size);
    //查一个
    User selectOne(@Param("userid") int userid);
}

package com.qf.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserRoleMapper {
    int addUserRole(int userId,int roleId);
}

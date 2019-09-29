package com.qf.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private Integer userid;

    private String loginName;

    private String password;

    private Byte state;

    private Date createTime;

    private String realname;

    private UserCode userCode;
}
package com.qf.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "tb_sys_role")
@Data
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "role_name")
    private String roleName;

    @Column(name = "role_deso")
    private String roleDeso;

    @Column(name = "if_vilid")
    private String ifVilid;
}

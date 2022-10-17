package com.veggiecastle.domain;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User extends BaseDomain {

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Column(name = "title")
    private String title;

    @Column(name = "branch_id")
    private String branchId;

    @Column(name = "profile_image")
    private String profileImage;

    @Column(name = "role")
    private String role;

}

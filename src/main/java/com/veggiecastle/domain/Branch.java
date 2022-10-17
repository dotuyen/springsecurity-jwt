package com.veggiecastle.domain;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "branch")
public class Branch extends BaseDomain {
    @Column(name = "name")
    private String name;

    @Column(name = "address")
    private String address;

    @Column(name = "contact_phone")
    private String contactPhone;

    @Column(name = "avatar_branch")
    private String avatarBranch;

    @Column(name = "owner_id")
    private String ownerId;

    @Column(name = "latitude")
    private String latitude;

    @Column(name = "longitude ")
    private String longitude ;

}

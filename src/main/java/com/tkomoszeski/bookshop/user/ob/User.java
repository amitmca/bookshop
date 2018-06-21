package com.tkomoszeski.bookshop.user.ob;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.tkomoszeski.bookshop.base.ob.BaseOb;

import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User extends BaseOb{

	private static final long serialVersionUID = 747455698650057491L;

    private String eamil;
    private String password;
    private String userName;
    private String firstName;
    private String lastName;
}
package com.tkomoszeski.bookshop.user.ob;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.tkomoszeski.bookshop.base.ob.BaseOb;

import lombok.Data;

@Entity
@Data
@Table(name="users")
public class User extends BaseOb{

    private static final long serialVersionUID = 8870469385772054342L;
	private String eamil;
    private String password;
    private String username;
    private String fullName;
}
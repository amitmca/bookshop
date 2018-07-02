package com.tkomoszeski.bookshop.user.dto;

import java.util.ArrayList;
import java.util.Collection;

import com.tkomoszeski.bookshop.user.ob.User;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Setter;

@Setter
public class BookShopUserPrincipal implements UserDetails {

    private static final long serialVersionUID = 7461359703825435274L;
	private String role;
    private String username;
    private String password;
    private String fullName;
    private boolean active;
    private boolean expired;
    private boolean locked;
    private boolean credentialExpired;

    public BookShopUserPrincipal(String username,String password,String fullName){
        this.username = username;
        this.password = password;
        this.fullName = fullName;
    }

    public BookShopUserPrincipal(User user)
    {
		this.username = user.getUsername();
		this.password = user.getPassword();
		this.fullName = user.getFullName();
		
    }

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		authorities.add(new SimpleGrantedAuthority(role));
		return authorities;
	}

	@Override
	public String getPassword() {
		return this.password;
	}

	@Override
	public String getUsername() {
		return this.username;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
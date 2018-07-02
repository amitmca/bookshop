package com.tkomoszeski.bookshop.user.service;

import com.tkomoszeski.bookshop.user.dto.BookShopUserPrincipal;
import com.tkomoszeski.bookshop.user.dto.UserDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;


@Service
public class AppUserDetailsService implements UserDetailsService {

    private final UserService userService;

	@Autowired
    public AppUserDetailsService(UserService userService){
        this.userService = userService;
    }

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        BookShopUserPrincipal user = userService.find(username);
        if(user == null){
            UsernameNotFoundException usernameNotFoundException = new UsernameNotFoundException("User with that name not found: " + "\nusername: " + username);
			throw usernameNotFoundException;
        }
		return user;
	}

}
package com.tkomoszeski.bookshop.user.service;

import com.tkomoszeski.bookshop.user.dto.BookShopUserPrincipal;
import com.tkomoszeski.bookshop.user.ob.User;
import com.tkomoszeski.bookshop.user.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository)
    {
        this.userRepository = userRepository;
    }

	@Override
	public BookShopUserPrincipal find(String userName) {
        User user = this.userRepository.findUserByUsername(userName);

        BookShopUserPrincipal bUser = new BookShopUserPrincipal(user);

		return bUser;
	}
    
}
package com.tkomoszeski.bookshop.user.service;

import com.tkomoszeski.bookshop.user.dto.BookShopUserPrincipal;

public interface UserService {
  
	public BookShopUserPrincipal find(String userName);
	

}
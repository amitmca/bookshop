package com.tkomoszeski.bookshop.user.repository;


import com.tkomoszeski.bookshop.user.ob.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

    @Query("SELECT u FROM User As u Where u.username=?1")
    User  findUserByUsername(String username);

}
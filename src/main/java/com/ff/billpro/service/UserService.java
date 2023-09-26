package com.ff.billpro.service;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ff.billpro.repo.User;

@Repository
public interface UserService extends JpaRepository<User,Integer>{
    
}

package com.olx.login.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.olx.login.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}

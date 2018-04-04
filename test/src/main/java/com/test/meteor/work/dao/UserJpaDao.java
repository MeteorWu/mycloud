package com.test.meteor.work.dao;

import com.test.meteor.work.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserJpaDao extends JpaRepository<User, String> {

}

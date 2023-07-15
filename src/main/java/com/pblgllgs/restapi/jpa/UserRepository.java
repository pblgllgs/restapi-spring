package com.pblgllgs.restapi.jpa;

import com.pblgllgs.restapi.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}

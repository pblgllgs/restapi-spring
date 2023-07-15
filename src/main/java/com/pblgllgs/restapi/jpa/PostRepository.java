package com.pblgllgs.restapi.jpa;

import com.pblgllgs.restapi.user.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}

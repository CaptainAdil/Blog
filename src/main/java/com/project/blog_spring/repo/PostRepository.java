package com.project.blog_spring.repo;

import com.project.blog_spring.entities.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository <Post,Long>{

}

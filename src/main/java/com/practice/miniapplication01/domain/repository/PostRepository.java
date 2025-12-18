package com.practice.miniapplication01.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.practice.miniapplication01.domain.model.entity.Post;

public interface PostRepository extends JpaRepository<Post,Long> {
}

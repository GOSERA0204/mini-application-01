package com.practice.miniapplication01.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.practice.miniapplication01.domain.model.dto.PostResponse;
import com.practice.miniapplication01.domain.model.dto.RegisterPostRequest;
import com.practice.miniapplication01.domain.model.entity.Post;
import com.practice.miniapplication01.domain.repository.PostRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class PostService {
	private final PostRepository postRepo;

	@Transactional
	public void create(RegisterPostRequest request) {
		Post post = request.toEntity();
		postRepo.save(post);
	}

	public PostResponse getPost(Long id) {
		Post post = postRepo.findById(id)
			.orElseThrow(() -> new IllegalArgumentException("post not found: " + id));
		return PostResponse.of(post);
	}
}

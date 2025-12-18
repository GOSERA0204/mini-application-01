package com.practice.miniapplication01.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.miniapplication01.domain.model.dto.PostResponse;
import com.practice.miniapplication01.domain.model.dto.RegisterPostRequest;
import com.practice.miniapplication01.service.PostService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/post")
@RequiredArgsConstructor
public class PostController {
	private final PostService postService;

	@PostMapping
	ResponseEntity<Void> register(@RequestBody RegisterPostRequest request) {
		postService.create(request);
		return ResponseEntity.ok().build();
	}

	@GetMapping
	ResponseEntity<PostResponse> getPost(@PathVariable Long id) {
		PostResponse response = postService.getPost(id);
		return ResponseEntity.ok().body(response);
	}
}

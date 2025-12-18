package com.practice.miniapplication01.domain.model.dto;

import com.practice.miniapplication01.domain.model.entity.Post;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class PostResponse {
	private Long id;
	private String title;
	private String content;

	public static PostResponse of(Post post) {
		return PostResponse.builder()
			.id(post.getId())
			.title(post.getTitle())
			.content(post.getContent())
			.build();
	}
}

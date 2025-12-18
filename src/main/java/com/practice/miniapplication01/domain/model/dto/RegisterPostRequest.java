package com.practice.miniapplication01.domain.model.dto;

import com.practice.miniapplication01.domain.model.entity.Post;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class RegisterPostRequest {
	private String title;
	private String content;

	public Post toEntity(){
		return Post.builder()
			.title(title)
			.content(content)
			.build();
	}
}

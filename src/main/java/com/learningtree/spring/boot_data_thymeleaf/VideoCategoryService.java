package com.learningtree.spring.boot_data_thymeleaf;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class VideoCategoryService {
	private VideoCategoryJpaRepository repo;

	public VideoCategoryService(VideoCategoryJpaRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<VideoCategory> getAllCategories() {
		return repo.findAll();
	}
}

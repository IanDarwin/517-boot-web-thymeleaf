package com.learningtree.spring.boot_data_thymeleaf;

import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoCategoryJpaRepository 
	extends JpaRepository<VideoCategory, Integer> {
	VideoCategory findByName(String name);
}

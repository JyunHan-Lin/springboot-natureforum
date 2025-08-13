package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.dto.ArticleDTO;
import com.example.demo.model.entity.Article;




@Component
public class ArticleMapper {
	
	@Autowired ModelMapper modelMapper;
	
	public ArticleDTO toDTO(Article article) {
		// Entity 轉 DTO
		return modelMapper.map(article, ArticleDTO.class);
	}
	
	public Article toEntity(ArticleDTO articleDTO) {
		// DTO 轉 Entity
		return modelMapper.map(articleDTO, Article.class);
	}
}

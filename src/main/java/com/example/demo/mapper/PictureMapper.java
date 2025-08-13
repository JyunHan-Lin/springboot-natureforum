package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.dto.PictureDTO;
import com.example.demo.model.entity.Picture;



@Component
public class PictureMapper {
	
	@Autowired ModelMapper modelMapper;
	
	public PictureDTO toDTO(Picture picture) {
		// Entity 轉 DTO
		return modelMapper.map(picture, PictureDTO.class);
	}
	
	public Picture toEntity(PictureDTO pictureDTO) {
		// DTO 轉 Entity
		return modelMapper.map(pictureDTO, Picture.class);
	}
}

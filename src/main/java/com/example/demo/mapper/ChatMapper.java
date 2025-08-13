package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.dto.ChatDTO;
import com.example.demo.model.entity.Chat;




@Component
public class ChatMapper {
	
	@Autowired ModelMapper modelMapper;
	
	public ChatDTO toDTO(Chat chat) {
		// Entity 轉 DTO
		return modelMapper.map(chat, ChatDTO.class);
	}
	
	public Chat toEntity(ChatDTO chatDTO) {
		// DTO 轉 Entity
		return modelMapper.map(chatDTO, Chat.class);
	}
}

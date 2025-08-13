package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.dto.BoardDTO;
import com.example.demo.model.entity.Board;




@Component
public class BoardMapper {
	
	@Autowired ModelMapper modelMapper;
	
	public BoardDTO toDTO(Board board) {
		// Entity 轉 DTO
		return modelMapper.map(board, BoardDTO.class);
	}
	
	public Board toEntity(BoardDTO boardDTO) {
		// DTO 轉 Entity
		return modelMapper.map(boardDTO, Board.class);
	}
}

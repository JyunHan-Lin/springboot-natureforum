package com.example.demo.mapper;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.model.dto.RoleDTO;
import com.example.demo.model.entity.Role;


@Component
public class RoleMapper {
	
	@Autowired ModelMapper modelMapper;
	
	public RoleDTO toDTO(Role role) {
		// Entity 轉 DTO
		return modelMapper.map(role, RoleDTO.class);
	}
	
	public Role toEntity(RoleDTO roleDTO) {
		// DTO 轉 Entity
		return modelMapper.map(roleDTO, Role.class);
	}
}

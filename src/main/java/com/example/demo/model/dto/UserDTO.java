package com.example.demo.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private Integer id;
    private String username;
    private String gender;
    private LocalDate birthday;
    private String email;
    private Boolean verify;
    private LocalDateTime createTime;
}

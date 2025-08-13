package com.example.demo.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ChatDTO {
    private Integer id;
    private String content;
    private LocalDateTime createTime;
    private Integer userId;
    private Integer boardId;
}

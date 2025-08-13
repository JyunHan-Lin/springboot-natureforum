package com.example.demo.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {
    private Integer id;
    private String topic;
    private String contents;
    private LocalDateTime createTime;
    private Integer userId;
}

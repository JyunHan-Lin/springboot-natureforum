package com.example.demo.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {
    private Integer id;
    private Boolean like;
    private Boolean dislike;
    private LocalDateTime createTime;
    private Integer userId;
    private Integer articleId;
}

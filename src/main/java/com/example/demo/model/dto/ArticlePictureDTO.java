package com.example.demo.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticlePictureDTO {
    private Integer id;
    private Integer articleId;
    private Integer pictureId;
}

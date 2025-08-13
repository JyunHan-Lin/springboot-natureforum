package com.example.demo.model.dto;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BoardPictureDTO {
    private Integer id;
    private Integer boardId;
    private Integer pictureId;
}

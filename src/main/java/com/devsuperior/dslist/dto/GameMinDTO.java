package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GameMinDTO {

        private Long id;
        private String title;
        private Integer year;
        private String imgUrl;
        private String shortDescription;

    public GameMinDTO(Game entity) {
        id = entity.getId();
        title = entity.getTitle();
        year = entity.getYear();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }
}

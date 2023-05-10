package com.devsuperior.dslist.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projects.GameMinProjection;

public class GameMinDTO {

	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;

	public GameMinDTO() {

	}

	public GameMinDTO(Game entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}

	public GameMinDTO(GameMinProjection entity) {
		this.id = entity.getId();
		this.title = entity.getTitle();
		this.year = entity.getYear();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShortDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public static List<GameMinDTO> converte(List<Game> result) {
		return result.stream().map(GameMinDTO::new).collect(Collectors.toList());
	}

	public static List<GameMinDTO> converteProjectionList(List<GameMinProjection> result) {
		return result.stream().map(GameMinDTO::new).collect(Collectors.toList());
	}

}

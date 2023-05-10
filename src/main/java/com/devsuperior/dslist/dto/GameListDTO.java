package com.devsuperior.dslist.dto;

import java.util.List;
import java.util.stream.Collectors;

import com.devsuperior.dslist.entities.GameList;

public class GameListDTO {

	private Long id;
	private String name;

	public GameListDTO() {

	}

	public GameListDTO(GameList list) {
		this.id = list.getId();
		this.name = list.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public static List<GameListDTO> converte(List<GameList> result) {
		return result.stream().map(GameListDTO::new).collect(Collectors.toList());
	}

}

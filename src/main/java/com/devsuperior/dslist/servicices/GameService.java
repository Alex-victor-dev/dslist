package com.devsuperior.dslist.servicices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired

	private GameRepository gameRepository;

	public List<GameMinDTO> findAll() {
		var result = gameRepository.findAll();
		return GameMinDTO.converte(result);
	}

}

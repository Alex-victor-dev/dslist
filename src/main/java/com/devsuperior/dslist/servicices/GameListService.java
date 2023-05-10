package com.devsuperior.dslist.servicices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dslist.dto.GameListDTO;
import com.devsuperior.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired

	private GameListRepository gameListRepository;

	public List<GameListDTO> findAll() {
		var result = gameListRepository.findAll();
		return GameListDTO.converte(result);
	}


}

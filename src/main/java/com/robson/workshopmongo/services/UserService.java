package com.robson.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robson.workshopmongo.domain.User;
import com.robson.workshopmongo.repository.UserRepository;
import com.robson.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {

	@Autowired // Mecanismo de injeção de dependência automática
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}

	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}
	
	
}

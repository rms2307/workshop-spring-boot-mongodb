package com.robson.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robson.workshopmongo.domain.User;
import com.robson.workshopmongo.repository.UserRepository;

@Service
public class UserService {

	@Autowired // Mecanismo de injeção de dependência automática
	private UserRepository repo;

	public List<User> findAll() {
		return repo.findAll();
	}
}

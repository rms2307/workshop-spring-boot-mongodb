package com.robson.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.robson.workshopmongo.domain.Post;
import com.robson.workshopmongo.repository.PostRepository;
import com.robson.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired // Mecanismo de injeção de dependência automática
	private PostRepository repo;

	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
	}

}

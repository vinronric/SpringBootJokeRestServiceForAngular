package com.techgatha.JokeRestServiceSpringBoot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techgatha.JokeRestServiceSpringBoot.database.JokeRepository;
import com.techgatha.JokeRestServiceSpringBoot.model.Joke;


@Service
public class JokeService {

	@Autowired
	private JokeRepository jokerepository;
	
	public List<Joke> getAllJokes()
	{
		
		List<Joke> Jokes = new ArrayList<>();
		jokerepository.findAll()
		.forEach(Jokes::add);
		return Jokes;
		
	}
	public Joke getJoke(int id) {
		return jokerepository.findById(id).get();
	}
	
	public void addJoke(Joke joke)
	{
		jokerepository.save(joke);
	}
	public void updateJoke(Joke joke)
	{
		//updates the topic if it exists else it does an insert
		jokerepository.save(joke);

	}
	public void deleteJoke(int id)
	{
		jokerepository.deleteById(id);
	}

}

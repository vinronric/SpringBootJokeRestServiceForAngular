package com.techgatha.JokeRestServiceSpringBoot.database;

import org.springframework.data.repository.CrudRepository;

import com.techgatha.JokeRestServiceSpringBoot.model.Joke;

public interface JokeRepository extends CrudRepository<Joke	, Integer>{

}

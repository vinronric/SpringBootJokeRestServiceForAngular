package com.techgatha.JokeRestServiceSpringBoot.controller;

import java.util.List;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.techgatha.JokeRestServiceSpringBoot.model.Joke;
import com.techgatha.JokeRestServiceSpringBoot.service.JokeService;



@RestController
@CrossOrigin
public class JokeRestConttroller {

	@Autowired
	private JokeService jokeService;
	
	@RequestMapping("/Jokes")
	public List<Joke> getAllJokes() {
		System.out.println("get all");
		return jokeService.getAllJokes();
	}
	
	@RequestMapping("/Jokes/{id}")
	//@Produces(MediaType.APPLICATION_JSON)
	//if {id} and parameter are same name no need to provide @PathVariable("id")
	//public Joke getJoke(@PathVariable("id") String id)
	public Joke getJoke(@PathVariable int id)
	
	{
		return jokeService.getJoke(id);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/Jokes")
	//@RequestBody this tells pring framework that theres a payload with post request.
	public String addJoke(@RequestBody Joke joke)
	{
		System.out.println("add joke "+joke);
		jokeService.addJoke(joke);	
		return "Success";
	}
	@RequestMapping(method=RequestMethod.PUT,value="/Jokes")
	//@RequestBody this tells pring framework that theres a payload with post request.
	public String updateJoke(@RequestBody Joke joke)
	{
		jokeService.updateJoke(joke);	
		System.out.println(jokeService.getAllJokes());
		return "Updated";
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/Jokes/{id}")
	@CrossOrigin
	//@RequestBody this tells pring framework that theres a payload with post request.
	public String deleteJoke(@PathVariable int id)
	{
		jokeService.deleteJoke(id);	
		System.out.println(jokeService.getAllJokes());
		return "deleted";
	}
}

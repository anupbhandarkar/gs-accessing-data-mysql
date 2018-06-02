package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Document;
import com.app.DocumentRepository;
import com.app.OrderRepository;
import com.app.RequestRepository;




@RestController
@RequestMapping(path="/demo") 
public class MainController {

	@Autowired 
	private DocumentRepository documentRepository;
	@Autowired
	private RequestRepository requestRepository;
	@Autowired
	private OrderRepository orderRepository;
	
	/*@GetMapping(path="/all")
	public @ResponseBody Iterable<Document> getAllUsers() {
		// This returns a JSON or XML with the users
		System.out.println(documentRepository.findAll());
		return documentRepository.findAll();
	}*/
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<Document> getAllUsers() {
		// This returns a JSON or XML with the users
		return documentRepository.findAll();
	}
	
	@GetMapping(path="/hi")
	public String gethi() {
		// This returns a JSON or XML with the users
		return "hi";
	}
	
	
	
	@GetMapping(path="document/{id}")
	public Optional<Document>  getUsers(@PathVariable(value ="id") Integer id) {
		// This returns a JSON or XML with the users
		System.out.println( documentRepository.findById(id) + "output");
		return documentRepository.findById(id);
	}
	
	@PostMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestBody Document d
			) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request
		
	/*	Documents d = new Documents();
	d.setDocumentnumber(documentnumber);
	d.setDocumentyear(documentyear);*/
		//documentRepository.save(d);
		return "Saved";
	}
		

	}


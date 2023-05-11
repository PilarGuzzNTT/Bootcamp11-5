package com.nnttdata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.nnttdata.Person;
import com.nnttdata.service.PersonService;

import reactor.core.publisher.Flux;

@Controller
public class PersonListController {
	
	@Autowired
	PersonService personService;
	
	@GetMapping("/person-list-1")
	public String personList1(final Model model){
		
		final Flux<Person> personList = personService.allPersons();
		model.addAttribute("personList", personList);
		
		return "personList";
	}

}

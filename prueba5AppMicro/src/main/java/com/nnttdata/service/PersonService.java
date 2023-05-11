package com.nnttdata.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.nnttdata.Person;

import reactor.core.publisher.Flux;

@Service
public class PersonService {
	
public Flux<Person> allPersons(){
		
		Flux<Person> p=WebClient.create("http://localhost:8080/person-list-1").get().retrieve().bodyToFlux(Person.class);
		Flux<Person> p1=WebClient.create("http://localhost:8080/person-list-2").get().retrieve().bodyToFlux(Person.class);
		Flux<Person> p2=WebClient.create("http://localhost:8080/person-list-3").get().retrieve().bodyToFlux(Person.class);
		Flux<Person> p3=WebClient.create("http://localhost:8080/person-list-4").get().retrieve().bodyToFlux(Person.class);
		
		return Flux.merge(p,p1,p2,p3);
}

}

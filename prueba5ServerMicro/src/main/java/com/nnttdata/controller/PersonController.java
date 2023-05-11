package com.nnttdata.controller;

import java.time.Duration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nnttdata.Person;

import reactor.core.publisher.Flux;

@RestController
public class PersonController {

	@GetMapping("/person-list-1")
	public Flux<Person> personList1() {
		Flux<Person> lista = Flux.just(new Person("Pepe", "Ruiz", 25), new Person("Lolo", "Ruiz", 25))
				.delaySequence(Duration.ofSeconds(2));

		return lista;
	}

	@GetMapping("/person-list-2")
	public Flux<Person> personList2() {
		Flux<Person> lista = Flux.just(new Person("LAura", "Tete", 25), new Person("Pepi", "Ruiz", 25))
				.delaySequence(Duration.ofSeconds(2));

		return lista;

	}

	@GetMapping("/person-list-3")
	public Flux<Person> personList3() {
		Flux<Person> lista = Flux.just(new Person("Sandra", "Ruiz", 25), new Person("Jose", "Ruiz", 25))
				.delaySequence(Duration.ofSeconds(2));

		return lista;
	}

	@GetMapping("/person-list-4")
	public Flux<Person> personList4() {
		Flux<Person> lista = Flux.just(new Person("Juan", "Ruiz", 25), new Person("Antonio", "Aguila", 25))
				.delaySequence(Duration.ofSeconds(2));

		return lista;
	}

}

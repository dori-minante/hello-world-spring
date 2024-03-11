package com.generation.helloworld.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloWorld() {
		return "Hello World!!!";
	}
	
	@GetMapping("/lista-bsm")
    public List<String> listaBsm() {
        return Arrays.asList("Comunicação", "Proatividade", "Orientação ao detalhe", "Trabalho em Equipe", 
        		"Persistência", "Responsabilidade social", "Orientação ao futuro", "Mentalidade de crescimento");
    }

    @GetMapping("/lista-objetivos")
    public List<String> listaObjetivos() {
        return Arrays.asList("Compreender", "Praticar Java e Spring", "Preparar o Pitch pessoal", "Ser persistente", "Cuidar da saúde");
    }
}

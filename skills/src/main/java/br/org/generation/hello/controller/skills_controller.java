package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class skills_controller 
{
	@GetMapping
	public String helloShow()
	{
		return " Persistência e Atenção ao detalhe. ";
	}
	

}

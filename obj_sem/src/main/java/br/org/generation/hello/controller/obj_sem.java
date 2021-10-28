package br.org.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class obj_sem 
{
	@GetMapping
	public String helloShow()
	{
		return " Focar em atenção ao detalhe e assimilar o vocábulario do SQL e STS";
	}
}

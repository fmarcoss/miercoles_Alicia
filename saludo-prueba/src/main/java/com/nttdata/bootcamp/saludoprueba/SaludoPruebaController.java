/**
 * 
 */
package com.nttdata.bootcamp.saludoprueba;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import nttdata_hibernate.saludo_idioma.Saludo;



/**
 * @author fmarcoss
 *
 */
@RestController
public class SaludoPruebaController {
	@Autowired
	private Saludo saludo;

	@GetMapping(path = "/prueba")
	public String pruebaSaludo() {
		return saludo.mensajeSaludo();
	}

}

package com.fragua.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;
import com.fragua.entity.Test;
import com.fragua.entity.Test.TestBuilder;
import com.fragua.repositories.TestCrud;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class WS_DemoSpringServices {
	@Autowired
	TestCrud testCrud;
	
	@PostMapping(value = "registerUser")
	public String registerUsers(@RequestParam String user, @RequestParam String password) {
		System.out.println("Usuario: " + user);
		System.out.println("Password: " + password);
		try {
			TestBuilder testb = Test.builder()
					.user(user)
					.password(password)
					;
			testCrud.save(testb.build());			
		}catch(Exception e) {
			log.error("Error to save in db");
			throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR,"Error al guardar");
		}
		return "c:";
	}
}
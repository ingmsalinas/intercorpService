package com.springboot.app.clientes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.springboot.app.clientes.controllers.ClienteController;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ClienteController.class)
public class ServicioClientesApplicationTests {
	
	@Test
	public void contextLoads() {
	}

}

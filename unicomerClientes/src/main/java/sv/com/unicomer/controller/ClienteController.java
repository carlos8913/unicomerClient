package sv.com.unicomer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.unicomer.models.entity.Cliente;
import sv.com.unicomer.models.service.ClienteServiceImpl;


@RestController
@RequestMapping("/api")
public class ClienteController {
	@Autowired
	private ClienteServiceImpl clienteService;
	
	
	@GetMapping("/clientlst")
	public List<Cliente> index() {
		System.out.println("emtro 1");
		return clienteService.findAll();
	}
}

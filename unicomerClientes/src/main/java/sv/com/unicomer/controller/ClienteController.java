package sv.com.unicomer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sv.com.unicomer.models.dao.ModelException;
import sv.com.unicomer.models.entity.Cliente;
import sv.com.unicomer.models.service.ClienteServiceImpl;

@RestController
@RequestMapping("/api/clientuni")
public class ClienteController {
	@Autowired
	private ClienteServiceImpl clienteService;
	
	
	@GetMapping("/lista")
	public ResponseEntity<List<Cliente>> findAll() {
		 if(clienteService.findAll() == null) {
	            throw new ModelException("No existen clientes en la base");
	        }
			return new ResponseEntity<>(clienteService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> get(@PathVariable Long id) {
		Cliente cliente = clienteService.findById(id);
	    if(cliente == null) {
	    	System.out.print("entra if");
	    	throw new ModelException("Cliente no encontrado");
	    }
			
	    return new ResponseEntity<Cliente>(cliente, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity<Object> update(@RequestBody Cliente cliente) {
		   
		Cliente clienteB = clienteService.findById(cliente.getId());
		if(clienteB == null) {
			System.out.print("entra if");
			throw new ModelException("Cliente no encontrado");
		}
		   
	    clienteService.update(cliente);
	    return new ResponseEntity<>(HttpStatus.OK);
	}
	
	 @PostMapping
	 public ResponseEntity<Cliente> post(@RequestBody Cliente cliente) {
		 return new ResponseEntity<>(clienteService.save(cliente), HttpStatus.CREATED);
	 }
	   
	 


}

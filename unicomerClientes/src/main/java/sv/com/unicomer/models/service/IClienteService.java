package sv.com.unicomer.models.service;

import java.util.List;

import sv.com.unicomer.models.entity.Cliente;

public interface IClienteService {
	public List<Cliente> findAll();

	public Cliente findById(Long id);

	public Cliente save(Cliente cliente);

	public void delete(Long id);
}

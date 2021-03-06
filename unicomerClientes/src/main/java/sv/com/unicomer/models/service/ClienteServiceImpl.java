package sv.com.unicomer.models.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sv.com.unicomer.models.dao.IClienteDao;
import sv.com.unicomer.models.entity.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService {
	@Autowired(required = false)
	private IClienteDao clienteDao;

	@Override
	@Transactional(readOnly = true)
	public List<Cliente> findAll() {
		System.out.println("emtro");
		return (List<Cliente>) clienteDao.findAll();
		
	}

	@Override
	@Transactional(readOnly = true)
	public Cliente findById(Long id) {
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	@Transactional()
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	@Transactional()
	public void delete(Long id) {
		clienteDao.deleteById(id);
	}
	
	@Override
	@Transactional()
    public Cliente update(Cliente cliente) {
        return clienteDao.save(cliente);
    }
	
	@Override
	@Transactional()
	public Cliente get(Long id) {
	     return clienteDao.findById(id).get();
	}

}

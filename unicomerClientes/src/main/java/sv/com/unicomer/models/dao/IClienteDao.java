package sv.com.unicomer.models.dao;

import org.springframework.data.repository.CrudRepository;

import sv.com.unicomer.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{}

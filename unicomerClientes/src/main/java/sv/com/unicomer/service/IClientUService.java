package sv.com.unicomer.service;

import org.springframework.data.jpa.repository.JpaRepository;

import sv.com.unicomer.dto.ClienteDTO;

public interface IClientUService extends JpaRepository<ClienteDTO, Integer>{

}

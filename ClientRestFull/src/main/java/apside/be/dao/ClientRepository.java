package apside.be.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import apside.be.entity.Client;

public interface ClientRepository extends JpaRepository<Client, Integer>{
	public Client findByName(String name);
	
}

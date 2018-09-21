package apside.be.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import apside.be.dao.ClientRepository;
import apside.be.entity.Client;

@RestController
@CrossOrigin("*")
public class ClientController {
	@Autowired
	private ClientRepository clientRepository;
	
	@GetMapping("/clients")
	public List<Client> getClients(){
		return clientRepository.findAll();
	}
	@GetMapping("/client/{id}")
	public Optional<Client> getClientById(@PathVariable int id){
		return clientRepository.findById(id);
		
	}
	@GetMapping("/clientByName/{name}")
	public Client getClientbyName(@PathVariable String name){
		return clientRepository.findByName(name);
		
	}
	
	

}

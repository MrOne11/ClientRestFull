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
	
	@GetMapping("/Allclients")
	public List<Client> getClients(){
		return clientRepository.findAll();
	}
	@GetMapping("/client/{id}")
	public Optional<Client> getClientById(@PathVariable int id){
		return clientRepository.findById(id);
		
	}
	@GetMapping("/clients/{id}")
	public Client getClientbyName(@PathVariable String id){
		return clientRepository.findByName(id);
		
	}
	
	

}

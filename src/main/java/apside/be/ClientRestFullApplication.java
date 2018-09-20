package apside.be;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import apside.be.dao.ClientRepository;
import apside.be.entity.Client;

@SpringBootApplication
public class ClientRestFullApplication extends SpringBootServletInitializer
		implements CommandLineRunner{


	@Autowired
	private ClientRepository clientRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ClientRestFullApplication.class, args);
	}
	
	@Override
	  protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	      return builder.sources(ClientRestFullApplication.class);
	  }

	@Override
	public void run(String... args) throws Exception {
		clientRepository.save(new Client("AXA"));
		clientRepository.save(new Client("ULB"));
		clientRepository.save(new Client("Manufast"));
		clientRepository.save(new Client("BNP PARIBAS ASSET MANAGEMENT"));
		clientRepository.save(new Client("APSIDE"));
		
	}
}

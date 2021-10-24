package org.ee;

import org.ee.dao.DomainRepository;
import org.ee.dao.FmklogRepository;
import org.ee.dao.UserRepository;
import org.ee.dao.FmkflowRepository;
import org.ee.entities.Domaine;
import org.ee.entities.Fmklog;
//import org.ee.entities.User;
import org.ee.entities.Fmkflow;   
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FmkMonitoringApplication implements CommandLineRunner{
	

	@Autowired
	//UserRepository userRepository;
	DomainRepository domainRepository;
	FmklogRepository fmklogRepository;
	//FmkflowRepository fmkflowRepository;
	
	//FmkhalfflowRepository fmkhalfflowRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(FmkMonitoringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//domainRepository.save(new Domaine("hi"));
		//userRepository.save(new User("hanaEL","coutcout","hana","elomari"));
		}

}

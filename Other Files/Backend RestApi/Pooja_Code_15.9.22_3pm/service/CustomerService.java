package project.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.entity.CustomerEntity;
import project.repository.CustomerRepository;
import project.response.credential.Credentials;

@Service
public class CustomerService 
{
	@Autowired
	private CustomerRepository repo;
	
    public Optional<CustomerEntity> signIn(Credentials credentials) 
    {
		return repo.findByMobileNumberAndPassword(credentials.getMobileNo(), credentials.getPassword());
	}
}

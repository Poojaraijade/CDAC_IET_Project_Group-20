package project.service;

import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import project.entity.Credentials;
import project.entity.CustomerEntity;
import project.repository.CustomerRepository;

@Service
public class CustomerService 
{
	@Autowired
	private CustomerRepository repo;
	
    public Optional<CustomerEntity> signin(Credentials credentials) 
    {
		return repo.findByMobileNumberAndPassword(credentials.getMobileNo(), credentials.getPassword());
	}
    
    public Optional<CustomerEntity> forgetPassword(Credentials credentials) 
    {
		return repo.findByMobileNumber(credentials.getMobileNo());
	}
}

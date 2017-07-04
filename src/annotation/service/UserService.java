package annotation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import annotation.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	@Qualifier("")
	private UserRepository userRepository;
	public void add(){
		System.out.println("UserServive.add()");
		userRepository.save();
	}

}

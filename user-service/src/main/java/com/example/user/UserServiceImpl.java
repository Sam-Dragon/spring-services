package com.example.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.dto.Department;
import com.example.dto.UserDepartment;
import com.example.entity.User;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class UserServiceImpl implements UserService {

	private static final String TOPIC = "message-topic";

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;

	@Autowired
	private UserRepository repository;

//	Gateway Service Url
//	private final String DEPARTMENT_SERVICE = "http://department-service/departments/";
	private final String DEPARTMENT_SERVICE = "http://localhost:9001/departments/";

	@Override
	public User saveUser(User user) {
		User registerUser = repository.save(user);

		log.info("Produced Request on Topic :: " + TOPIC + " for user :: " + registerUser.getEmailId());
		kafkaTemplate.send(TOPIC, registerUser.getEmailId() + " is registered successfully..");

		return registerUser;
	}

	@Override
	public UserDepartment getUserById(Long id) {

		User user = repository.findById(id)
				.orElseThrow(() -> new RuntimeException("No such user is present with id : " + id));

		Department department = restTemplate.getForObject(DEPARTMENT_SERVICE + user.getDepartmentId(),
				Department.class);

		return new UserDepartment(user, department);
	}
}

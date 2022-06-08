package com.neoleap.auth.repoistories;

import java.util.ArrayList;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.neoleap.auth.models.User;

@Component
public class UserIntializer implements CommandLineRunner {

	private final UserRepository userRepository;

	UserIntializer(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		ArrayList<User> users = new ArrayList<>();
		users.add(new User(0L, "username0", "username0@mail.com", "00000"));
		users.add(new User(1L, "username1", "username1@mail.com", "11111"));
		users.add(new User(2L, "username2", "username2@mail.com", "22222"));
		users.add(new User(3L, "username3", "username3@mail.com", "33333"));
		users.add(new User(4L, "username4", "username4@mail.com", "44444"));
		users.add(new User(5L, "username5", "username5@mail.com", "55555"));
		users.add(new User(6L, "username6", "username6@mail.com", "66666"));
		userRepository.saveAll(users);

		userRepository.findAll().forEach(System.out::println);
	}
}

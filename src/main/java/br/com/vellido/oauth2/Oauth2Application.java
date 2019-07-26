package br.com.vellido.oauth2;

import br.com.vellido.oauth2.domain.Category;
import br.com.vellido.oauth2.domain.User;
import br.com.vellido.oauth2.repository.CategoryRepository;
import br.com.vellido.oauth2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Oauth2Application implements CommandLineRunner {

	@Autowired
	private CategoryRepository repository;

	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(Oauth2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Category category1 = new Category(1L, "Informática");
		Category category2 = new Category(2L, "Escritório");

        repository.saveAll(Arrays.asList(category1, category2));

		User user = new User("user1", new BCryptPasswordEncoder().encode("321"));

		userRepository.save(user);
	}
}

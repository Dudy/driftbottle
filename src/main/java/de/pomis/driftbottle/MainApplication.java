package de.pomis.driftbottle;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.pomis.driftbottle.persistence.MessageEntity;
import de.pomis.driftbottle.persistence.MessageRepository;
import de.pomis.driftbottle.persistence.UserEntity;
import de.pomis.driftbottle.persistence.UserRepository;

@SpringBootApplication
public class MainApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(MainApplication.class);

	@Autowired
	private MessageRepository messageRepository;
	@Autowired
	private UserRepository userRepository;

	public static void main(String[] args) {
		SpringApplication.run(MainApplication.class, args);
	}

	@Override
	public void run(String... args) {
		log.info("Start Application...");

		userRepository.save(new UserEntity(1l));
		userRepository.save(new UserEntity(2l));
		userRepository.save(new UserEntity(3l));

		messageRepository.save(new MessageEntity(1l, 2l, "Guten Morgen"));
		messageRepository.save(new MessageEntity(1l, 3l, "Good morning"));
		messageRepository.save(new MessageEntity(3l, 2l,"Bonjour"));

		System.out.println("\nMessageEntity :: findAll()");
		messageRepository.findAll().forEach(System.out::println);

		System.out.println("\nMessageEntity :: findById(1L)");
		messageRepository.findById(1l).ifPresent(System.out::println);
	}

}

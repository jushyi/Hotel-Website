package edu.wgu.d387_sample_code;

import edu.wgu.d387_sample_code.translation.WelcomeMessage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Locale;

@SpringBootApplication
public class D387SampleCodeApplication {

	public static void main(String[] args) {
		SpringApplication.run(D387SampleCodeApplication.class, args);

		//Seperate threads for different language welcome messages
		WelcomeMessage welcomeMessageEN = new WelcomeMessage(Locale.US);
		Thread enWelcomeMessage = new Thread(welcomeMessageEN);
		enWelcomeMessage.start();

		WelcomeMessage welcomeMessageFR = new WelcomeMessage(Locale.CANADA_FRENCH);
		Thread frWelcomeMessage = new Thread(welcomeMessageFR);
		frWelcomeMessage.start();
	}
}

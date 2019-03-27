package com.madhu.javaMail.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class JavaMailTester {

	public static void main(String[] args) {
		System.out.println("Entering the main method and creating a spring container");
		ApplicationContext container = new ClassPathXmlApplicationContext("resource/spring/spring.xml");
		JavaMailSender mailSender = container.getBean(JavaMailSender.class);
		SimpleMailMessage mailMessage = container.getBean(SimpleMailMessage.class);

		try {

			System.out.println("Starting to send a mail");
			mailMessage.setTo("madhujbyouth@gmail.com");
			mailMessage.setBcc("madhujb2014@gmail.com");
			mailMessage.setSubject("Testing mail");
			mailMessage.setText(" hi send u a mail message");
			mailSender.send(mailMessage);
			System.out.println("mail sent successfully");
		} catch (Exception e) {

			System.err.println("exception created :\t"+e.getMessage());
			e.printStackTrace();
		}

		finally {

		}
	}

}

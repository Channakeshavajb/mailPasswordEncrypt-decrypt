package com.madhu.javaMail.beans;

import org.springframework.mail.javamail.JavaMailSenderImpl;

public class JavaMAilSenderImplement extends JavaMailSenderImpl {

	private Ecryption enc = new Ecryption();

	JavaMAilSenderImplement(String password) {
		super.setPassword(enc.decrypt(password));
	}

}

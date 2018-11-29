package com.example.activemqjta;

import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class ContactTransactionReceiver {

	@JmsListener(destination = "TestQueue")
	public void receiveMessageSendMessage(Message message) throws Exception {
		System.out.println("Received: " + ((TextMessage) message).getText());
	}

}
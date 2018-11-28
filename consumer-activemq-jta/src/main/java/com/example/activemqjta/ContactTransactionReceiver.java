package com.example.activemqjta;

import javax.jms.Message;
import javax.jms.TextMessage;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class ContactTransactionReceiver {

	private int mensajesConsumer2 = 0;

//	@Transactional(rollbackFor = Exception.class)
	@JmsListener(destination = "QueuePrueba")
	public void receiveMessageSendMessage(Message message) throws Exception {
		mensajesConsumer2++;
		System.out.println("Mensaje " + mensajesConsumer2 + ":" + ((TextMessage) message).getText());
	}

}
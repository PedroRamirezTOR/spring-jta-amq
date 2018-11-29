package com.example.activemqjta;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

	@Autowired
	private JmsTemplate jmsTemplate;

	@RequestMapping(value = "/sendMessages")
	@Transactional(rollbackFor=Exception.class)
	public String produce() throws Exception {
		for (int i = 0; i < 100; i++) {
			jmsTemplate.convertAndSend("TestQueue", "Message "+i);
		}
		return "Messages Inserted";
	}
}
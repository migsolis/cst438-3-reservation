package com.cst438.assignment_3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;

@RabbitListener(queues = "city-reservation-q1")
public class ReservationEventHandler {
	
	private static final Logger Log =
			LoggerFactory.getLogger(ReservationEventHandler.class);
	
	@RabbitHandler
	public void receive(String in) {
		System.out.println(in);
		Log.info("[ReservationEventHandler] Received '" + in + "'");
	}
}

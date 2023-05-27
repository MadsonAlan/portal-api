package com.portal.api.message;

import com.portal.api.dto.CarPostDTO;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class KafkaProucerMessage {
    private final KafkaTemplate<String, CarPostDTO> kafkaTemplate;

    public KafkaProucerMessage(KafkaTemplate<String, CarPostDTO> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    private final String KAFKA_TOPIC = "car-post-topic";

    public void sendMessage(CarPostDTO carPostDTO){
        kafkaTemplate.send(KAFKA_TOPIC, carPostDTO);
    }
}

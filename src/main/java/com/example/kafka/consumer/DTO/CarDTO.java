package com.example.kafka.consumer.DTO;

import lombok.Data;
import lombok.NoArgsConstructor;

// Com lombok nao precisamos escrever getters e setters
@Data   // Serializando um objeto com Lombok, no lugar de enviar como string
@NoArgsConstructor
public class CarDTO {

    private String id;
    private String model;
    private String color;
}
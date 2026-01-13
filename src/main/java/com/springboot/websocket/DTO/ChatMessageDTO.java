package com.springboot.websocket.DTO;

import com.springboot.websocket.Configuration.MessageType;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class ChatMessageDTO{
    private MessageType type;
    private String sender;
    private String content;
    private LocalDateTime timestamp;
}

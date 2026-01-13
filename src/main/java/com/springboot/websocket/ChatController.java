package com.springboot.websocket;

import com.springboot.websocket.DTO.ChatMessageDTO;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {
     private final SimpMessagingTemplate template;
     public ChatController(SimpMessagingTemplate template){
         this.template = template;
     }

    @MessageMapping("/chat.send")
    @SendTo("/topic/public")
    public ChatMessageDTO sendMessage(ChatMessageDTO message){
         message.setSender("Sandeep Mainali");
         message.setType(com.springboot.websocket.Configuration.MessageType.CHAT);
         message.setTimestamp(java.time.LocalDateTime.now());
         return message;
     }


}

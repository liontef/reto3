package com.example.reto3.reto3.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.reto3.reto3.model.Message;
import com.example.reto3.reto3.repository.MessageRepository;

@Service
public class MessageService {
    
    @Autowired
    private MessageRepository messageRepository;

    public List<Message> getAll(){

        return messageRepository.getAll();

    }

    public Optional<Message> getMessage(int id){

        return messageRepository.getMessage(id);
    }

    public Message save(Message msg){

        if(msg.getIdMessage()==null){

            return messageRepository.save(msg);
        }

        else{

            Optional<Message> msgaux=messageRepository.getMessage(msg.getIdMessage());
            if(msgaux.isEmpty()){

                return messageRepository.save(msg);
            }
            else{

                return msg;
            }
        }


    }

}

package com.wipro.Capstone.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Capstone.Model.Message;
import com.wipro.Capstone.Repository.MessageRepository;

@Service
public class MessageService {
	@Autowired
    MessageRepository messageRepository;
    
    public Optional<Message> findById(Long id) {
		return messageRepository.findById(id);
	}

	public List<Message> getAllMessage() {
		return (List<Message>) messageRepository.findAll();
	}

	public void addMessage(Message us) {
		messageRepository.save(us);
	}
}

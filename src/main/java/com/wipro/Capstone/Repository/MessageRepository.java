package com.wipro.Capstone.Repository;

import com.wipro.Capstone.Model.Message;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
public interface MessageRepository extends JpaRepository<Message,Long> {
	}
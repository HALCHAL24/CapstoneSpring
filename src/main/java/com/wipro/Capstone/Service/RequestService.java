package com.wipro.Capstone.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Capstone.Model.Request;
import com.wipro.Capstone.Repository.RequestRepository;

@Service
public class RequestService {
  @Autowired
  RequestRepository requestRepository;
  
  public Optional<Request> findById(Long id) {
		return requestRepository.findById(id);
	}

	public List<Request> getAllRequest() {
		return (List<Request>) requestRepository.findAll();
	}

	public void addRequest(Request us) {
		requestRepository.save(us);
	}

	public void deleteRequest(Long id) {
		requestRepository.deleteById(id);
	}
}

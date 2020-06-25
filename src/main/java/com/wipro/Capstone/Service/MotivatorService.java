package com.wipro.Capstone.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Capstone.Model.Motivator;
import com.wipro.Capstone.Repository.MotivatorRepository;

@Service
public class MotivatorService {
	@Autowired
	MotivatorRepository motivatorRepository;

	public Optional<Motivator> findById(Long id) {
		return motivatorRepository.findById(id);
	}
	public List<Motivator> getAllMotivator() {
		return (List<Motivator>) motivatorRepository.findAll();
	}

	public void addMotivator(Motivator mo) {
		motivatorRepository.save(mo);
	}

	public void deleteMotivator(Long id) {
		motivatorRepository.deleteById(id);
	}
}

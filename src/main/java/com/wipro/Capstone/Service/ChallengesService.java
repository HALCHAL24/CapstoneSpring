package com.wipro.Capstone.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Capstone.Model.Challenges;
import com.wipro.Capstone.Repository.ChallengesRepository;

@Service
public class ChallengesService {
	@Autowired
	ChallengesRepository challengesRepository;

	public Optional<Challenges> findById(Long id) {
		return challengesRepository.findById(id);
	}

	public List<Challenges> getAllChallenges() {
		return (List<Challenges>) challengesRepository.findAll();
	}

	public void addChallenges(Challenges mo) {
		challengesRepository.save(mo);
	}

	public void deleteChallenges(Long id) {
		challengesRepository.deleteById(id);
	}

}

package com.wipro.Capstone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.wipro.Capstone.Model.Challenges;
@CrossOrigin
public interface ChallengesRepository extends JpaRepository<Challenges,Long> {
}

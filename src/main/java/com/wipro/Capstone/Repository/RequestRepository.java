package com.wipro.Capstone.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.Capstone.Model.Request;

public interface RequestRepository extends JpaRepository<Request,Long> {

}

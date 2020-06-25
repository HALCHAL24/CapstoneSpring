package com.wipro.Capstone.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.wipro.Capstone.Model.Admin;
@CrossOrigin
public interface AdminRepository  extends JpaRepository<Admin,Long> {
	
}

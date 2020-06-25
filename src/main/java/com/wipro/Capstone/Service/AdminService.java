package com.wipro.Capstone.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.Capstone.Model.Admin;
import com.wipro.Capstone.Repository.AdminRepository;
import com.wipro.Capstone.Repository.MotivatorRepository;
import com.wipro.Capstone.Repository.UserRepository;

@Service
public class AdminService {
	@Autowired
	AdminRepository adminRepository;
	@Autowired
	MotivatorRepository motivatorRepository;
	@Autowired
	UserRepository userRepository;

	public Optional<Admin> findById(Long id) {
		return adminRepository.findById(id);
	}

	// read admin
	public List<Admin> getAllAdmin() {
		return (List<Admin>) adminRepository.findAll();
	}

	// save admin as Admin
	public void addAdmin(Admin admin) {
		adminRepository.save(admin);
	}

	// save admin as List ---- In memory
	public void saveAdmin(List<Admin> ad) {
		adminRepository.saveAll(ad);
	}

	// delete admin
	public void deleteAdmin(Long id) {
		adminRepository.deleteById(id);
	}
}

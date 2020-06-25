package com.wipro.Capstone;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.wipro.Capstone.Model.Admin;
import com.wipro.Capstone.Service.AdminService;
@SpringBootApplication
public class CapstoneApplication {
	@Autowired
	AdminService adminService;
	public static void main(String[] args) {
		SpringApplication.run(CapstoneApplication.class, args);
	}
	@PostConstruct
	public void  init()
	{
		Admin a1 = new Admin("Roger Kutcher","roger@gmail.com","987654321","wipro@123");
		Admin a2 = new Admin("Steve Martin","steve@gmail.com","987654321","wipro@123");
		List<Admin> admin = new ArrayList<Admin>();
		admin.add(a1);
		admin.add(a2);
		adminService.saveAdmin(admin);
	}
}

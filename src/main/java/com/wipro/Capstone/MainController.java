package com.wipro.Capstone;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.Capstone.Model.Admin;
import com.wipro.Capstone.Model.Message;
import com.wipro.Capstone.Model.Request;
import com.wipro.Capstone.Model.User;
import com.wipro.Capstone.Model.Challenges;
import com.wipro.Capstone.Model.Motivator;
import com.wipro.Capstone.Service.AdminService;
import com.wipro.Capstone.Service.MessageService;
import com.wipro.Capstone.Service.RequestService;
import com.wipro.Capstone.Service.UserService;
import com.wipro.Capstone.Service.ChallengesService;
import com.wipro.Capstone.Service.MotivatorService;

@Controller
@EnableAutoConfiguration
@RestController
@CrossOrigin
public class MainController {
	@Autowired
	AdminService adminService;
	
	@Autowired
	MotivatorService motivatorService;
	
	@Autowired
	UserService userService;
	
	@Autowired
	ChallengesService challengesService;
	
	@Autowired
	MessageService messageService;
	
	@Autowired
	RequestService requestService;
	
	//Admin
	@GetMapping("/getAdmin")
	public List<Admin> getAdmin()
	{
		System.out.println("get Admin");
		return adminService.getAllAdmin();
	}
	
	@PostMapping("/addAdmin")
	public void addAdmin(@RequestBody Admin ad)
	{  System.out.println("add Admin");
		adminService.addAdmin(new Admin(ad.getFname(),ad.getEmail(),ad.getMobile(),ad.getPassword()));
	}
	
	@PutMapping("/updateAdmin/{admin_id}")
	public void updateAdmin(@PathVariable("admin_id") long admin_id,@RequestBody Admin ad)
	{
		System.out.println("update Admin"+ admin_id);
		Optional<Admin> admin = adminService.findById(admin_id);
		Admin ad1 = admin.get();
		ad1.setFname(ad.getFname());
		ad1.setEmail(ad.getEmail());
		ad1.setMobile(ad.getMobile());
		ad1.setPassword(ad.getPassword());
		 adminService.addAdmin(ad1); 
	}
	@DeleteMapping("/deleteAdmin/{admin_id}")
	public void deleteAdmin(@PathVariable("admin_id")long admin_id)
	{
		System.out.println("delete Admin" + admin_id);
		adminService.deleteAdmin(admin_id);
	}
	
	
	//Motivator
			@GetMapping("/getMotivator")
			public List<Motivator> getMotivator()
			{
				System.out.println("get Motivator");
				return motivatorService.getAllMotivator();
			}
			
			@PostMapping("/addMotivator")
			public void addMotivator(@RequestBody Motivator ad)
			{  System.out.println("add Motivator");
				motivatorService.addMotivator(new Motivator(ad.getFname(),ad.getEmail(),ad.getMobile(),ad.getPassword()));
			}
			
			@PutMapping("/updateMotivator/{motivator_id}")
			public void updateMotivator(@PathVariable("motivator_id") long motivator_id,@RequestBody Motivator ad)
			{
				System.out.println("update Motivator"+ motivator_id);
				Optional<Motivator> motivator = motivatorService.findById(motivator_id);
				Motivator ad1 = motivator.get();
				ad1.setFname(ad.getFname());
				ad1.setEmail(ad.getEmail());
				ad1.setMobile(ad.getMobile());
				ad1.setPassword(ad.getPassword());
				 motivatorService.addMotivator(ad1); 
			}
			@DeleteMapping("/deleteMotivator/{motivator_id}")
			public void deleteMotivator(@PathVariable("motivator_id")long motivator_id)
			{
				System.out.println("delete Motivator" + motivator_id);
				motivatorService.deleteMotivator(motivator_id);
			}
			
			
			//User
			@GetMapping("/getUser")
			public List<User> getUser()
			{
				System.out.println("get User");
				return userService.getAllUser();
			}
			@PostMapping("/addUser")
			public void addUser(@RequestBody User ad)
			{  System.out.println("add User");
			 
			   ad.setPassword("wipro123");
				userService.addUser(new User(ad.getName(),ad.getGender(),ad.getEmail(),
						ad.getAddress(),ad.getCity(),ad.getState(),ad.getCountry()
						,ad.getReason(),ad.getExisting_Medical(),ad.getExisting_Diet()
						,ad.getPregnant(),ad.getPassword(),ad.getChallenge_name(),ad.getChallenge_batch(),ad.getChallenge_group(),ad.getAge(),ad.getMobile()
						,ad.getPincode(),ad.getHeight(),ad.getWeight(),ad.getU_BMI(),ad.getCode()));
			}
			@PutMapping("/updateUser/{user_id}")
			public void updateUser(@PathVariable("user_id") long user_id,@RequestBody User ad)
			{
				System.out.println("update User"+ user_id);
				Optional<User> user = userService.findById(user_id);
				User ad1 = user.get();
				ad1.setName(ad.getName());
				ad1.setEmail(ad.getEmail());
				ad1.setMobile(ad.getMobile());
				ad1.setPassword(ad.getPassword());
				 userService.addUser(ad1); 
			}
			@DeleteMapping("/deleteUser/{user_id}")
			public void deleteUser(@PathVariable("user_id")long user_id)
			{
				System.out.println("delete User" + user_id);
				userService.deleteUser(user_id);
			}
			
			//Challenges
			@GetMapping("/getChallenges")
			public List<Challenges> getChallenges()
			{
				System.out.println("get Challenges");
				return challengesService.getAllChallenges();
			}
			@PostMapping("/addChallenges")
			public void addChallenges(@RequestBody Challenges ad)
			{   System.out.println("add Challenges");
			System.out.println(ad.getMentorName());
				challengesService.addChallenges(new Challenges(ad.getName(),ad.getMentorName(),ad.getBatch(),ad.getQuarter(),ad.getGroupName()));
			}
			
			@PutMapping("/updateChallenges/{challenges_id}")
			public void updateChallenges(@PathVariable("challenges_id") long challenges_id,@RequestBody Challenges ad)
			{
				System.out.println("update Challenges"+ challenges_id);
				Optional<Challenges> challenges = challengesService.findById(challenges_id);
				Challenges ad1 = challenges.get();
				ad1.setName(ad.getName());
				ad1.setMentorName(ad1.getMentorName());
				ad1.setQuarter(ad.getQuarter()); 
				ad1.setBatch(ad.getBatch());
				ad1.setGroupName(ad.getGroupName());
				challengesService.addChallenges(ad1); 
			}
			@DeleteMapping("/deleteChallenges/{challenges_id}")
			public void deleteChallenges(@PathVariable("challenges_id")long challenges_id)
			{
				System.out.println("delete Challenges" + challenges_id);
				challengesService.deleteChallenges(challenges_id);
			}
			
			//message
			@GetMapping("/getMessage")
			public List<Message> getMessage()
			{
				System.out.println("get Message");
				return messageService.getAllMessage();
			}
			@PostMapping("/addMessage")
			public void addMessage(@RequestBody Message ad)
			{   System.out.println("add Challenges");
				messageService.addMessage(new Message(ad.getSender(),ad.getMsg_body(),ad.getAdmin(),ad.getMotivator(),ad.getUser()));
			}
		
			//request
			@GetMapping("/getRequest")
			public List<Request> getRequest()
			{
				System.out.println("get Message");
				return requestService.getAllRequest();
			}
			@PostMapping("/addRequest")
			public void addRequest(@RequestBody Request ad)
			{   System.out.println("add Request");
			    requestService.addRequest(new Request(ad.getUser_name(),ad.getUser_email(),ad.getStatus()));
			}
			
			
			
			
			
			
			
}

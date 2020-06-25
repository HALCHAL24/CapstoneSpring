package com.wipro.Capstone.Repository;

import com.wipro.Capstone.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
@CrossOrigin
public interface UserRepository extends JpaRepository<User,Long> {
}

package com.app.SpringSecjwtpostgredeploy.repository;

import java.util.Optional;

import com.app.SpringSecjwtpostgredeploy.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	Optional<User> findByUsername(String username);
	
	Boolean existsByUsername(String username);
	
	Boolean existsByEmail(String email);
	
}

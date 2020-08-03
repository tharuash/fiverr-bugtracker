package com.b127.bug;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.b127.bug.entity.Employee;
import com.b127.bug.entity.Project;
import com.b127.bug.repositories.EmployeeRepository;
import com.b127.bug.repositories.ProjectRepository;
import com.b127.bug.repositories.TicketCommentRepository;
import com.b127.bug.repositories.TicketRepository;

@SpringBootApplication
public class BugtrackerApplication {
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(BugtrackerApplication.class, args);
		
		
		
		
	}

}

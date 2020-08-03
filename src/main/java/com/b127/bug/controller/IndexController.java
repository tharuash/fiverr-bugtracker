package com.b127.bug.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.b127.bug.entity.Employee;
import com.b127.bug.entity.Project;
import com.b127.bug.entity.Ticket;
import com.b127.bug.entity.TicketComment;
import com.b127.bug.repositories.EmployeeRepository;
import com.b127.bug.repositories.ProjectRepository;
import com.b127.bug.repositories.TicketCommentRepository;
import com.b127.bug.repositories.TicketRepository;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class IndexController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ProjectRepository projectRepository;
	
	@Autowired
	private TicketRepository ticketRepository;
	
	@Autowired
	private TicketCommentRepository ticketCommentRepository;
	
	@GetMapping("/")
	public Object check() {
		/*Project p1 = new Project();
		p1.setId(1L);
		p1.setProjectName("project1");
		p1.setDescription("project1");
		p1.setStage("1");
		
		Project p2 = new Project();
		p2.setId(2L);
		p2.setProjectName("project2");
		p2.setDescription("project2");
		p2.setStage("2");
		
		Project p1Saved =  projectRepository.save(p1);
		Project p2Saved = projectRepository.save(p2);*/
		
		Project p1 = projectRepository.findById(1L).get();
		
		
		Project p2 = projectRepository.findById(2L).get();
		
		
		
		Set<Project> employeeProjects = new HashSet<>();
		employeeProjects.add(p1);
		employeeProjects.add(p2);
		
		Employee e = new Employee();
		e.setId(1L);
		e.setUserName("tharu");
		e.setEmail("tharu@gmail.com");
		e.setPassword("123456789");
		e.setProjects(employeeProjects);
		e.setRole("user");
		
		Employee e1Saved = employeeRepository.save(e);
		
		/*Project p3 = projectRepository.findById(3L).get();
		Employee e3 = employeeRepository.findById(3L).get();
		
		Ticket t1 = new Ticket();
		t1.setId(1L);
		t1.setTicketTitle("tic1");
		t1.setTicketDescription("tic des");
		t1.setTicketPriority("1");
		t1.setTicketStatus("st1");
		t1.setTicketType("tyty");
		t1.setCreated(new Timestamp(455212L));
		t1.setUpdated(new Timestamp(4521545l));
		t1.setSubmitter("sub1");
		t1.setEmployee(e3);
		t1.setProject(p3);
		
		Ticket t2 = new Ticket();
		t2.setId(2L);
		t2.setTicketTitle("tic2");
		t2.setTicketDescription("tic des");
		t2.setTicketPriority("2");
		t2.setTicketStatus("st2");
		t2.setTicketType("tyty");
		t2.setCreated(new Timestamp(455212L));
		t2.setUpdated(new Timestamp(4521545l));
		t2.setSubmitter("sub2");
		t2.setEmployee(e3);
		t2.setProject(p3);*/
		/*Ticket t1 = ticketRepository.findById(1L).get();
		
		
		
		TicketComment tc2 = new TicketComment();
		tc2.setCommenter("s2");
		tc2.setMessage("m2");
		tc2.setTicket(t1);
		
		TicketComment tc2Saved = ticketCommentRepository.save(tc2);
		/*Set<Ticket> tickets = new HashSet<>();
		tickets.add(savedT1);
		tickets.add(savedT2);
		
		
		p3.setTickets(tickets);
		
		
		e3.setTickets(tickets);
		
		Project p3Updated =  projectRepository.save(p3);
		Employee e3Updates = employeeRepository.save(e3);*/
		
		
		return e1Saved;
		
	}
	
	@GetMapping("/d")
	public void delete() {
		
		//employeeRepository.deleteById(1L);
		
		//ticketRepository.deleteById(1L);
		/*Project p3 = projectRepository.findById(3L).get();
		Set<Employee> employees = new HashSet<>();
		p3.setEmployees(employees);
		projectRepository.save(p3);*/
		
		//projectRepository.deleteById(3L);
		//ticketCommentRepository.deleteById(1L);
		
		//ticketRepository.deleteById(1L);
		
		projectRepository.deleteById(1L);
	}

}

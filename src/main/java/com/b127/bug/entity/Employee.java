package com.b127.bug.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@NotNull
	@NotEmpty
	@Column(name = "user_name")
	private String userName;

	@Column(name = "email")
	@Email
	@NotNull
	@NotEmpty
	private String email;

	@Column(name = "password", nullable = false, length = 60)
	@Size(min = 6, max = 100)
	private String password;

	@Column(name = "role")
	@NotNull
	@NotEmpty
	private String role;
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "project_employee", joinColumns = @JoinColumn(name = "employee_id", nullable = true), inverseJoinColumns = @JoinColumn(name = "project_id", nullable = true))
	private Set<Project> projects;

	@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.ALL}, mappedBy = "employee", orphanRemoval = true)
	private Set<Ticket> tickets;

}

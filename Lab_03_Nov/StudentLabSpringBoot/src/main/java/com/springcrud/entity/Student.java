package com.springcrud.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Student {
	
	@Id
	private int sid;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "please enter firstname")
	private String sfname;
	
	@Column(length = 30, nullable = false)
	@NotBlank(message = "please enter lastname")
	private String slname;
	
	@Column(length = 30, nullable = false, unique = true)
	@NotBlank(message = "please enter email id")
	@Email
	private String semail;
	
	@Column(length = 11, nullable = false, unique = true)
	@NotNull(message = "please enter phone number")
	private long sphone;
	
}

package com.onetomany.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class University {
	// Making uId as primary key and auto-increment
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int uId;
	@Column(length = 30, nullable = false)
	private String uName;
	@Column(length = 15, nullable = false)
	private String uState;
	@Column(length = 15, nullable = false)
	private String uCountry;

	// Using this annotation to establishing OneToMany relation between University
	// and Students
	@OneToMany(cascade = CascadeType.ALL)
	// it will join 2 table by uId attribute
	@JoinColumn(name = "uId")
	// creating List type Student attribute (aggregation concept HAS-A Relation)
	private List<Students> students;
}

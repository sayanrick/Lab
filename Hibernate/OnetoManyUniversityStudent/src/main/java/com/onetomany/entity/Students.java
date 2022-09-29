package com.onetomany.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
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

public class Students {
	// making sId as Primary Key
	@Id
	private long sId;
	@Column(length = 20, nullable = false)
	private String sFirstName;
	@Column(length = 20, nullable = false)
	private String sLastName;
	@Column(length = 12, nullable = false)
	private String sDept;
	@Column(length = 30, nullable = false)
	private String sEmail;

}

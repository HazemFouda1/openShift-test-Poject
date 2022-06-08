package com.neoleap.auth.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Login {

	@Id
	@GeneratedValue
	private Long id;

	String username;
	String password;

}

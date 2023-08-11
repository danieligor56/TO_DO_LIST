package com.taskmanager.taskmanagerapi.DTO;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class UserDTO implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	
	@Nonnull
	private String name;
	
}

package com.taskmanager.taskmanagerapi.DTO;

import com.taskmanager.taskmanagerapi.entity.User;
import com.taskmanager.taskmanagerapi.status.StatusTask;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter

public class TaskDTO {
	
	private String description;
	private String title;
	private StatusTask completed;
	private User userId;
}

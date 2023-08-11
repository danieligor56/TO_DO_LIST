package com.taskmanager.taskmanagerapi.entity;

import java.io.Serializable;
import com.taskmanager.taskmanagerapi.status.StatusTask;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name="Task")

public class TaskEntity implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID_TASK")
	private int id;
	
	@Column(nullable = false,name = "DESCRIPTION")
	private String description;
	
	@Column(nullable = false,name = "TITLE")
	private String title;
	
	@Column(nullable = false,name = "STATUS")
	private StatusTask completed;
	
	//CRIADOR DA TAREFA. 
	@Column(name = "ID_USER")
	private User userId;
	
	
	
}

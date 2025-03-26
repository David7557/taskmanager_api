package com.jspiders.taskmanager.service;

import java.util.ArrayList;
import java.util.Date;

import org.springframework.stereotype.Repository;

import com.jspiders.taskmanager.entity.TaskEntity;

@Repository
public class TaskService {
	private ArrayList<TaskEntity> tasks = new ArrayList<>();
	private int taskId = 1;
	
	public void addTask(String title, String description, String deadline) {
		TaskEntity task = new TaskEntity();
		task.setId(taskId);
		task.setTitle(title);
		task.setDescription(description);
		task.setDeadline(new Date(deadline));
		task.setCompleted(false);
		tasks.add(task);
		taskId++;
	}
}

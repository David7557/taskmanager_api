package com.jspiders.taskmanager.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jspiders.taskmanager.dto.CreateTaskDTO;
import com.jspiders.taskmanager.entity.TaskEntity;
import com.jspiders.taskmanager.service.TaskService;

@RestController
@RequestMapping("/tasks")
public class TaskController {
	private final TaskService taskService;
	
	public TaskController(TaskService taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping("")
	public  ResponseEntity<List<TaskEntity>> getTasks(){
		var tasks = taskService.getTasks();
		
		return ResponseEntity.ok(tasks);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TaskEntity> getTaskById(@PathVariable int id){
		var task = taskService.getTaskById(id);
		if (task == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(task);
	}
	
	public ResponseEntity<TaskEntity> addTask(@RequestBody CreateTaskDTO body){
		var task = taskService.addTask(body.getTitle(), body.getDescription(), body.getDeadline());
		
		return ResponseEntity.ok(task);
	}
	
	
}

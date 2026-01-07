package com.jahid.bootcamp_api.controller

import com.jahid.bootcamp_api.model.Task
import com.jahid.bootcamp_api.service.TaskService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/tasks")
class TaskController(private val taskService: TaskService) {
    @GetMapping
    fun getTasks(): List<Task> {
        return taskService.getAllTasks()
    }
}
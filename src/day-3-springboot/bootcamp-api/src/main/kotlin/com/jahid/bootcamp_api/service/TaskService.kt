package com.jahid.bootcamp_api.service

import com.jahid.bootcamp_api.model.Task
import org.springframework.stereotype.Service


@Service // We put service annotation here because Spring needs to know that it has to create task object
         // from this class. It's the service logic and Spring needs to create objects from it
         // and return to TaskController and TaskController will return it to the web client in JSON format
         // If we don't use @Service here, Spring will not know from where to create that object,
         // It comes here to the TaskService to look for the class, it finds nothing, so it shows error
         // Basically, wherever we use the main operation or business logic of an application, we use the @Service annotation.
class TaskService {
    fun getAllTasks(): List<Task> {
        return listOf(
            Task(1, "Learning Spring", false),
            Task(2, "It's fascinating that I'm a programmer", true),
        )
    }
}
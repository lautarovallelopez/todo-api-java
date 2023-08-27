package com.todolvl.app.rest.Controller;

import com.todolvl.app.rest.Model.Task;
import com.todolvl.app.rest.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TodoController {
    @Autowired
    private TodoRepository todoRepository;
    @GetMapping(value = "/")
    public String holaMundo() {
        return "Hola Mundo !!!";
    }
    @GetMapping(value="/tasks")
    public List<Task> getTasks() {
        return todoRepository.findAll();
    }

    @PostMapping(value="/savetask")
    public String saveTask(@RequestBody Task task) {
        todoRepository.save(task);
        return "saved task";
    }
    @PutMapping(value="/update/{id}")
    public String updateTask(@PathVariable long id, @RequestBody Task task) {
        Task updatedTask = todoRepository.findById(id).get();
        updatedTask.setTitle(task.getTitle());
        updatedTask.setDescription(task.getDescription());
        todoRepository.save(updatedTask);
        return "updated task";
    }
    @DeleteMapping(value="/deletetask/{id}")
    public String deleteTask(@PathVariable long id) {
        Task deletedTask = todoRepository.findById(id).get();
        todoRepository.delete(deletedTask);
        return "Deleted task";
    }
}

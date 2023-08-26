package com.todolvl.app.rest.Controller;

import com.todolvl.app.rest.Model.Task;
import com.todolvl.app.rest.Repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

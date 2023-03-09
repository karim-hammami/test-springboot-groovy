package com.example.test

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/todos")
class todoController {
    @Autowired
    private todoRepository repository


    @PostMapping
    public Todo create(@RequestBody Todo todo) {
        return repository.save(todo)
    }

    @GetMapping
    public List<Todo> findAll() {
        return repository.findAll()
    }
}

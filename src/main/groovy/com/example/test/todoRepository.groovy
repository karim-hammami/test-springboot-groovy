package com.example.test

import org.springframework.stereotype.Repository

@Repository
class todoRepository {


    final List<Todo> todoList = new ArrayList<>()

    public List<Todo> findAll() {
        return todoList
    }


    public Todo save(Todo todo) {
        todoList.add(todo)
        return todo
    }
}

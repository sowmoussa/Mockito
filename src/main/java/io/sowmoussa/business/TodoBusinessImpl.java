package io.sowmoussa.business;

import io.sowmoussa.data.api.TodoService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TodoBusinessImpl {
    private TodoService todoService;

    public TodoBusinessImpl(TodoService todoService) {
        this.todoService = todoService;
    }

    public List<String> retrieveTodosRelatedToSpring(String user) {
        List<String> filteredTodos = new ArrayList<String>();
        List<String> todos = todoService.retrieveTodos(user);
        filteredTodos = todos
            .stream()
            .filter(todo -> todo.contains("spring"))
            .collect(Collectors.toList());

        return filteredTodos;
    }
}

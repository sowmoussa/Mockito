package io.sowmoussa.data.api;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{

    @Override
    public List<String> retrieveTodos(String user) {
        if (user.equals("Doe"))
            return new ArrayList<String>();
        return Arrays.asList("Learn spring MVC", "spring Data", "Learn to Dance");
    }
}

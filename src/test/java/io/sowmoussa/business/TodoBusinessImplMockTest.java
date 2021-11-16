package io.sowmoussa.business;

import io.sowmoussa.data.api.TodoService;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class TodoBusinessImplMockTest {

    @Test
    public void testRetrieveTodosRelatedToSpring_usingMock() {
        TodoService todoServiceMock = mock(TodoService.class);
        // when is used to stub a method
        when(todoServiceMock.retrieveTodos("John"))
                .thenReturn(Arrays.asList("Learn spring MVC", "spring Data", "Learn to Dance"));
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("John");
        assertEquals(2, filteredTodos.size());
    }

    @Test
    public void testRetrieveTodosRelatedToSpring_usingMock_withEmptyList() {
        TodoService todoServiceMock = mock(TodoService.class);
        when(todoServiceMock.retrieveTodos("Doe"))
                .thenReturn(Arrays.asList());
        TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoServiceMock);

        List<String> filteredTodos = todoBusinessImpl.retrieveTodosRelatedToSpring("Doe");
        assertEquals(0, filteredTodos.size());
    }

}

package io.sowmoussa.business;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    public void ListMockTest() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2);
        assertEquals(2, listMock.size());
    }

    @Test
    public void ListMockTest_ReturnMultipleValues() {
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(2).thenReturn(3);
        assertEquals(2, listMock.size());
        assertEquals(3, listMock.size());
    }

    @Test
    public void ListMockGetTest() {
        List listMock = mock(List.class);
        // argument matcher
        when(listMock.get(anyInt())).thenReturn("moscar");
        assertEquals("moscar", listMock.get(0));
        assertEquals("moscar", listMock.get(2));
    }

    @Test(expected = RuntimeException.class)
    public void ListMockGetTest_throwException() {
        List listMock = mock(List.class);
        when(listMock.get(anyInt())).thenThrow(new RuntimeException());
        listMock.get(0);
    }
}

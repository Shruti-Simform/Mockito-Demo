package com.mockito.mockitodemo.list;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {
    @Test
    void simpleReturn(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(3);
        assertEquals(3,listMock.size());
    }
    @Test
    void multipleReturn(){
        List listMock = mock(List.class);
        when(listMock.size()).thenReturn(1).thenReturn(2);
        assertEquals(1,listMock.size());
        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());
        assertEquals(2,listMock.size());
    }
    @Test
    void specificParameters(){
        List listMock = mock(List.class);
        when(listMock.get(0)).thenReturn("First");
        assertEquals("First",listMock.get(0));
        assertEquals(null,listMock.get(1));
    }
    @Test
    void genericParameters(){
        List listMock = mock(List.class);
        when(listMock.get(Mockito.anyInt())).thenReturn("First");
        assertEquals("First",listMock.get(0));
        assertEquals("First",listMock.get(10));
        assertEquals("First",listMock.get(15));
    }
}

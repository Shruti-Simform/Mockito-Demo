package com.mockito.mockitodemo.business;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class SomeBusinessImplMockTest {
    @Mock
    DataService dataServiceMock;
    @InjectMocks
    SomeBusinessImpl someBusinessImpl;
    @Test
    void findGreatest1() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{10,15,20});
        assertEquals(20, someBusinessImpl.findGreatest());
    }
    @Test
    void findGreatest2() {
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{35});
        assertEquals(35, someBusinessImpl.findGreatest());
    }
}

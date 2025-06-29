package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {
        // Arrange
        ExternalApi mockApi = mock(ExternalApi.class);
        MyService service = new MyService(mockApi);

        // Act
        service.fetchData();         
        service.notifyUser("Hello");  

        // Assert
        verify(mockApi).getData();               
        verify(mockApi).sendMessage("Hello");    
    }
}


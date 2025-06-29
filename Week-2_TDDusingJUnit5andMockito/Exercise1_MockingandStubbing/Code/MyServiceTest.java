package com.example;

import static org.mockito.Mockito.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MyServiceTest {

    @Test
    public void testExternalApi() {
        // Arrange: Create a mock of the ExternalApi
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the method to return a predefined value
        when(mockApi.getData()).thenReturn("Mock Data");

        // Create the service instance with the mocked API
        MyService service = new MyService(mockApi);

        // Act: Call the method under test
        String result = service.fetchData();

        // Assert: Verify the behavior and expected result
        assertEquals("Mock Data", result);
    }
}

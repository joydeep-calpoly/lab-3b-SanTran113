package lab_3c;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TestService {
	@Test
	void testDatabaseUniqueId() {
		Database databaseMock = Mockito.mock(Database.class);
		when(databaseMock.getUniqueId()).thenReturn(42);
		
		int uniqueId = databaseMock.getUniqueId();
		assertEquals(uniqueId, 42);
	}

	@Test
	void testServiceDatabaseId() {
		Database databaseMock = Mockito.mock(Database.class);
		when(databaseMock.getUniqueId()).thenReturn(42);
		
		Service service = new Service(databaseMock);
		
		assertEquals("Using database with id: 42", service.getDatabaseID());
	}
	
}

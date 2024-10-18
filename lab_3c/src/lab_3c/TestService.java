package lab_3c;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class TestService {
	
	@Test
	void testDatabaseUniqueId() {
		Database databaseMock = mock(Database.class);
		when(databaseMock.getUniqueId()).thenReturn(42);
		
		int uniqueId = databaseMock.getUniqueId();
		assertEquals(uniqueId, 42);
	}

}

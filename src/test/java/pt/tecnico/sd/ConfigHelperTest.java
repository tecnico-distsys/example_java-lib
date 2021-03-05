package pt.tecnico.sd;

import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;


/**
 * Unit tests for ConfigHelper.
 */
public class ConfigHelperTest {

	@Test
	public void testPrintProperties() {
		ConfigHelper config = new ConfigHelper();
		config.printProperties();
		// no easy way to check output
		// assume it is OK if it does not throw an exception
	}

	@Test
	public void testGetExistingProperty() {
		ConfigHelper config = new ConfigHelper();
		String value = config.getValue("min");
		assertNotNull(value);
		/* expected value, actual value */
		assertEquals("7", value);
	}

	@Test
	public void testGetFilteredProperty() {
		ConfigHelper config = new ConfigHelper();
		String value = config.getValue("max");
		assertNotNull(value);
		/* expected value, actual value */
		assertEquals("22", value);
	}

	@Test
	public void testGetMissingProperty() {
		ConfigHelper config = new ConfigHelper();
		String value = config.getValue("not_there");
		assertNull(value);
	}

}

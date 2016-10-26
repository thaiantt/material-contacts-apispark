package net.apispark.webapi.db;

import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.CoreMatchers.is;
import net.apispark.webapi.representation.Contact;

public class ContactPersistenceTest {

	@Test
	public void addContact() {
		Contact myContact = ContactPersistence.INSTANCE.addContact(new Contact(
				null, "Thai-An", "ThanTrong", "svg-6", "female"));
		Assert.assertNotNull(myContact.getId());
	}

	@Test
	public void returnContact() {
		Contact myContact = ContactPersistence.INSTANCE.addContact(new Contact(
				null, "Thai-An", "ThanTrong", "svg-6", "female"));
		Contact retrieve = ContactPersistence.INSTANCE.getContact(myContact.getId());
		Assert.assertThat(myContact.getId(), is(retrieve.getId()));
	}
}

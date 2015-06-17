package tests;

import interfaces.Contact;
import interfaces.FutureMeeting;
import interfaces.ContactManager;
import logic.ContactManagerImpl;
import logic.ContactImpl;
import logic.FutureMeetingImpl;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Set;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import static org.testng.Assert.*;

public class ContactManagerImplTest {
    ContactManager manager = new ContactManagerImpl();
    Set<Contact> contacts;

    @BeforeMethod
    public void setUp() throws Exception {
        manager = new ContactManagerImpl();
        contacts = new HashSet<Contact>();
        Contact person1 = new ContactImpl("Bob", 1, "note about this person");
        contacts.add(person1);
    }

    @AfterMethod
    public void tearDown() throws Exception {
        manager = null;
    }

    @Test
    public void testAddFutureMeeting() throws Exception {
        int result = manager.addFutureMeeting(contacts, Calendar.getInstance());
        assertEquals(result, 1);
    }

    @Test
    public void testGetPastMeeting() throws Exception {

    }

    @Test
    public void testGetFutureMeeting() throws Exception {

    }

    @Test
    public void testGetMeeting() throws Exception {

    }

    @Test
    public void testGetFutureMeetingList() throws Exception {

    }

    @Test
    public void testGetFutureMeetingList1() throws Exception {

    }

    @Test
    public void testGetPastMeetingList() throws Exception {

    }

    @Test
    public void testAddNewPastMeeting() throws Exception {

    }

    @Test
    public void testAddMeetingNotes() throws Exception {

    }

    @Test
    public void testAddNewContact() throws Exception {

    }

    @Test
    public void testGetContacts() throws Exception {

    }

    @Test
    public void testGetContacts1() throws Exception {

    }

    @Test
    public void testFlush() throws Exception {

    }
}
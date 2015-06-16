package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import logic.ContactImpl;

import static org.testng.Assert.*;

/**
 * Tests for ContactImpl class
 */
public class ContactImplTest {
    ContactImpl contactNoNotes; //contact without notes
    ContactImpl contactWithNotes; //contact with notes


    @BeforeMethod
    public void setUp() throws Exception {
        contactNoNotes = new ContactImpl("Bob", 1, null);
        contactWithNotes = new ContactImpl("Bob", 2, "Initial notes.");
    }

    @Test
    public void testAddNotesInitial() throws Exception {
        String note = "New note";
        contactNoNotes.addNotes("New note");
        assertEquals(contactNoNotes.getNotes(),note);
    }

    @Test
    public void testAddNotesToExisting() throws Exception {
        String note = "New note";
        contactWithNotes.addNotes("New note");
        note = "Initial notes." + " " + note;
        assertEquals(contactWithNotes.getNotes(),note);
    }
}
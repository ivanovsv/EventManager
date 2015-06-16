package logic;

import interfaces.Contact;

/**
 * Implementation of Contact interface
 * Created by V Ivanovs on 16/06/2015.
 */
public class ContactImpl implements Contact {
    private String name;
    private String notes;
    private int id;


    public ContactImpl(String name, int id, String notes) {
        this.name = name;
        this.id = id;
        this.notes = notes;
    }

    /**
     * Returns the ID of the contact.
     *
     * @return the ID of the contact.
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * Returns the name of the contact.
     *
     * @return the name of the contact.
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Returns our notes about the contact, if any.
     * <p/>
     * If we have not written anything about the contact, the empty
     * string is returned.
     *
     * @return a string with notes about the contact, maybe empty.
     */
    @Override
    public String getNotes() {
        return notes;
    }

    /**
     * Add notes about the contact.
     *
     * @param note the notes to be added
     */
    @Override
    public void addNotes(String note) {
        StringBuilder bd = new StringBuilder();
        if (notes == null) {
            bd.append(note);
        } else {
            bd.append(this.notes);
            bd.append(" " + note);
        }
        this.notes = bd.toString();
    }
}


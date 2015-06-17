package logic;

import interfaces.Contact;
import interfaces.Meeting;

import java.util.Calendar;
import java.util.Set;

/**
 * Created by V Ivanovs on 16/06/2015.
 */
public class MeetingImpl implements Meeting {
    private static int count = 0;
    private int id;
    private Calendar date;
    private Set<Contact> contacts;

    public MeetingImpl(Calendar date, Set<Contact> contacts){
        this.date = date;
        this.contacts = contacts;
        id = count;
        count++;
    }
    /**
     * Returns the id of the meeting.
     *
     * @return the id of the meeting.
     */
    @Override
    public int getId() {
        return id;
    }

    /**
     * Return the date of the meeting.
     *
     * @return the date of the meeting.
     */
    @Override
    public Calendar getDate() {
        return date;
    }

    /**
     * Return the details of people that attended the meeting.
     * <p/>
     * The list contains a minimum of one contact (if there were
     * just two people: the user and the contact) and may contain an
     * arbitrary number of them.
     *
     * @return the details of people that attended the meeting.
     */
    @Override
    public Set<Contact> getContacts() {
        return contacts;
    }
}

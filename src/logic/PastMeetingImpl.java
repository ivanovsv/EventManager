package logic;

import interfaces.Contact;
import interfaces.PastMeeting;

import java.util.Calendar;
import java.util.Set;

/**
 * Created by Workstation on 16/06/2015.
 */
public class PastMeetingImpl extends MeetingImpl implements PastMeeting {
    private String notes;

    public PastMeetingImpl(Calendar date, Set<Contact> contacts, String notes){
        super(date, contacts);
        this.notes = notes;
    }


    /**
     * Returns the notes from the meeting.
     * <p/>
     * If there are no notes, the empty string is returned.
     *
     * @return the notes from the meeting.
     */
    @Override
    public String getNotes() {
        return notes;
    }
}

package logic;

import interfaces.Contact;
import interfaces.FutureMeeting;

import java.util.Calendar;
import java.util.Set;

/**
 * Created by V Ivanovs on 16/06/2015.
 */
public class FutureMeetingImpl extends MeetingImpl implements FutureMeeting {

    public FutureMeetingImpl(Calendar date, Set<Contact> contacts){
        super(date, contacts);
    }
}

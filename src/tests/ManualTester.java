package tests;

/**
 * Class for quick manual tests of concepts
 * Created by Workstation on 17/06/2015.
 */
public class ManualTester {
    public static void main(String[] args) {
        MeetingIntImpl pm1 = new PMeetingIntImpl("A");
        MeetingIntImpl pm2 = new PMeetingIntImpl("B");
        MeetingIntImpl fm1 = new FMeetingIntImpl("AA");
        MeetingIntImpl fm2 = new FMeetingIntImpl("AB");

        System.out.println(pm1.getId());
        System.out.println(pm2.getId());
        System.out.println(fm1.getId());
        System.out.println(fm2.getId());

        MeetingIntImpl fm3 = new FMeetingIntImpl("AA");
        MeetingIntImpl fm4 = new FMeetingIntImpl("AB");

        System.out.println(fm3.getId());
        System.out.println(fm4.getId());

    }
}

interface MeetingInt{
    public int getId();
}

interface PMeetingInt{

}

interface FMeetingInt{
}



class MeetingIntImpl implements MeetingInt {
    private static int count;
    private int id;
    private String contact;

    public MeetingIntImpl(String contact){
        this.contact = contact;
        this.id = count + 1;
        count++;

    }
    @Override
    public int getId(){
        return id;
    }
}

class PMeetingIntImpl extends MeetingIntImpl implements PMeetingInt{
    public PMeetingIntImpl(String contact) {
        super(contact);
    }
}

class FMeetingIntImpl extends MeetingIntImpl implements FMeetingInt{
    public FMeetingIntImpl(String contact) {
        super(contact);
    }
}



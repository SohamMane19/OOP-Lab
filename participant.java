public class participant
{
    static int Counter=1000;
    String RegistrationID,Name,Branch;
    int ContactNumber;

    participant(String name,int contact,String branch)
    {
        Name=name;
        ContactNumber=contact;
        Branch=branch;
    }
    void getRegistrationId()
    {
        Counter+=1;
        RegistrationID="D"+String.valueOf(Counter);
        System.out.println(RegistrationID);
    }
    public static void main(String args[])
    {
        participant p=new participant("abc",123456789,"CSE");
        p.getRegistrationId();
        participant p2=new participant("xyz",123476789,"CE");
        p2.getRegistrationId();
    }
}
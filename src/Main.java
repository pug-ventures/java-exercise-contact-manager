//Udacity course "Object Oriented Programming in Java"

public class Main {
    public static void main(String[] args)
    {
        ContactManager myContactManager = new ContactManager();
        Contact ChristianQuast = new Contact();
        ChristianQuast.name = "Christian Quast";
        ChristianQuast.email = "cquast@mpi-bremen.de";
        ChristianQuast.phoneNumber = "004942169642576";
        myContactManager.addContact(ChristianQuast);

        Contact TordisWippler = new Contact();
        TordisWippler.name = "Tordis Wippler";
        TordisWippler.phoneNumber = "0049832351377";
        myContactManager.addContact(TordisWippler);

        Contact OliverJäckle = new Contact();
        OliverJäckle.name = "Oliver Jäckle";
        OliverJäckle.phoneNumber = "00494212028907";
        myContactManager.addContact(OliverJäckle);

        Contact MerleÜcker = new Contact();
        MerleÜcker.name = "Merle Ücker";
        MerleÜcker.phoneNumber = "00494212028907";
        myContactManager.addContact(MerleÜcker);

        Contact JanineBeckmann = new Contact();
        JanineBeckmann.name = "Janine Beckmann";
        JanineBeckmann.phoneNumber = "00494212028907";
        myContactManager.addContact(JanineBeckmann);

        Contact result = myContactManager.searchContact("Tordis Wippler");
        System.out.println(result.phoneNumber);
    }
}

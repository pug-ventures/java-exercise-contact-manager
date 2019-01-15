// Searches for and adds contacts
// Contacts are stored in an array of Contacts

public class ContactManager {

    // Fields:
    Contact[] myFriends; // array to store all contacts
    int friendsCount;    // counter to keep track of where
    // in the array the last contact was added

    // Default constructor to initialize the fields:
    ContactManager()
    {
        this.friendsCount = 0;
        this.myFriends = new Contact[500]; // Can store up to 500 contacts
    }

    // Methods:
    void addContact(Contact contact)
    {
        myFriends[friendsCount] = contact; // Add contact at next free position
        friendsCount++;                    // Increment position counter for next
    }

    Contact searchContact(String searchName)
    {
        for (int i = 0; i < friendsCount; i++)
        {
            if (myFriends[i].name.equals(searchName))
            {
                return myFriends[i];
            }
        }
        return null;
    }
}

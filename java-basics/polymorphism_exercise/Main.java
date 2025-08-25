public class Main {

    public Contact createContact(String name, String number, String email) {
        return new PhoneEmailContact(name, number, email);
    }

    public Contact createContact(String name, String information) {
        if (information.contains("@gmail.com")) {
            return new EmailContact(name, information);
        } else {
            return new PhoneContact(name, information);
        }

    }
    public static void main(String[] args) {

        Contact fullContact = createContact("Neville", "444-444-4444", "nvaude@gmail.com");
        Contact phoneContact = createContact("Dorothy", "777-777-7777");
        Contact emailContact = createContact("Peter", "pdiddy@gmail.com");

        System.out.println("fullContact" + " ...");
        System.out.println("phoneContact" + " ...");
        System.out.println("emailContact" + " ...");
    }
}
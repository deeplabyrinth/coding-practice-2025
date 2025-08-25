public class Main {

    public static Contact createContact(String name, String number, String email) {
        return new PhoneEmailContact(name, number, email);
    }

    public static Contact createContact(String name, String information) {
        if (information.contains("@")) {
            return new EmailContact(name, information);
        } else {
            return new PhoneContact(name, information);
        }

    }
    public static void main(String[] args) {

        Contact fullContact = createContact("Neville", "444-444-4444", "nvaude@gmail.com");
        Contact phoneContact = createContact("Dorothy", "777-777-7777");
        Contact emailContact = createContact("Peter", "pdiddy@gmail.com");

        System.out.printf("Full contact: %s %s %s\n",
                fullContact.getName(),
                fullContact.getPhone(),
                fullContact.getEmail());
        System.out.printf("Phone contact: %s %s\n",
                phoneContact.getName(),
                phoneContact.getPhone());
        System.out.printf("Email contact: %s %s\n",
                emailContact.getName(),
                emailContact.getEmail());
    }
}
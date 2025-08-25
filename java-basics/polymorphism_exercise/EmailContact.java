public class EmailContact {
    private String email;

    public EmailContact(String name, String email) {
        super(name);
        setEmail(email);
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
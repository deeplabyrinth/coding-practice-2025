public class PhoneEmailContact extends Contact {
    private String phone;
    private String email;

    public PhoneEmailContact(String name, String phone, String email) {
        super(name);
        setPhone(phone);
        setEmail(email);
    }

    @Override
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
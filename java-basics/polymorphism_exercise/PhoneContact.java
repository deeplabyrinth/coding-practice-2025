public class PhoneContact extends Contact {
    private String phone;

    public PhoneContact(String name, String phone) {
        super(name);
        setPhone(phone);
    }

    @Override
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
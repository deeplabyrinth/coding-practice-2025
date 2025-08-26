import java.sql.Timestamp;

public class MissedPaymentEvent implements Event {
    private Long createdTimeStamp;
    private String id;

    public AccountTransferEvent(String id) {
        this.createdTimeStamp = new Timestamp(System
                .currentTimeMillis()).getTime();
        this.id = id;
    }

    @Override
    public Long getTimeStamp() { return this.createdTimeStamp; }

    @Override
    public void process() {
        System.out.println("Customer " + id + " missed their payment. " +
                "Sending a bill to the customer.");
}
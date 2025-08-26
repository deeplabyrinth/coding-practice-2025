public class Main {
    public static void main(String[] args) {
        PasswordChangeEvent eventOne = new PasswordChangeEvent("3216596843");
        AccountTransferEvent eventTwo = new AccountTransferEvent("5456484646");
        MissedPaymentEvent eventThree = new MissedPaymentEvent("6868465466");

        Event[] events = {eventOne, eventTwo, eventThree};

        for (Event e : events) {
            System.out.println(e.getTimeStamp());
            e.process();
            System.out.println();
        }
    }
}
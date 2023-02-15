package hvl.dat109.model;

import java.util.Date;

public class CreditCard {
    private String duedate;
    private Long cardNumber;

    public CreditCard(String duedate, Long cardNumber) {
        this.duedate = duedate;
        this.cardNumber = cardNumber;
    }

    public String getDuedate() {
        return duedate;
    }

    public void setDuedate(String duedate) {
        this.duedate = duedate;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public String toString() {
        return "CreditCard{" +
                "duedate='" + duedate + '\'' +
                ", cardNumber=" + cardNumber +
                '}';
    }
}

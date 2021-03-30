package Others;

import java.util.Date;

public class Payment {
    private String paymentType;
    private String cardNumber;
    private Date expirationDate;
    private String CVV;
    private String Cardholder;

    public Payment( String cardNumber, Date expirationDate, String CVV, String Cardholder){

            this.cardNumber=cardNumber;
            this.expirationDate=expirationDate;
            this.CVV=CVV;
            this.Cardholder=Cardholder;

    }



    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }


    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String CVV) {
        this.CVV = CVV;
    }

    public String getCardholder() {
        return Cardholder;
    }

    public void setCardholder(String cardholder) {
        Cardholder = cardholder;
    }






}

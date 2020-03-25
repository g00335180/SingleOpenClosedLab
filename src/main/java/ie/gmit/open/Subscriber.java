/*
Name: Meghan Fitzgerald
Date: 25/03/2020
Contact: G00335180@gmit.ie
Comments: Design Principles lab where we explored how to use 2 of the SOLID Principles, Single and Open.
 */

package ie.gmit.open;

//base class - closed for modification can inherit the class
public abstract class Subscriber {

    protected Long subscriberId;
    protected String address;
    protected Long phoneNumber;

    public Long getSubscriberId() {
        return subscriberId;
    }
    public void setSubscriberId(Long subscriberId) {
        this.subscriberId = subscriberId;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public abstract double calculateBill(); //extension open for change by whatever class is using it
}

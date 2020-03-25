/*
Name: Meghan Fitzgerald
Date: 25/03/2020
Contact: G00335180@gmit.ie
Comments: Design Principles lab where we explored how to use 2 of the SOLID Principles, Single and Open.
 */

package ie.gmit.open;

import java.util.List;

public class PhoneSubscriber  extends Subscriber{

    private int baseRate;

    public double calculateBill() {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);
        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();
        return totalDuration*baseRate/100;
    }

    /**
     * @return the baseRate
     */
    public int getBaseRate() {
        return baseRate;
    }

    /**
     * @param baseRate the baseRate to set
     */
    public void setBaseRate(int baseRate) {
        this.baseRate = baseRate;
    }

}
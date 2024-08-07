package largedatafileprocessing;

import java.util.Date;

public class Transactions
{
    int transcation_id;
    int costumer_id;
    long amount;
    Date d1;

    public Transactions(int transcation_id,int costumer_id,long amount,Date d1)
    {
        this.amount=amount;
        this.transcation_id=transcation_id;
        this.costumer_id=costumer_id;
        this.d1=d1;
    }

    public int getTranscation_id() {
        return transcation_id;
    }

    public void setTranscation_id(int transcation_id) {
        this.transcation_id = transcation_id;
    }

    public int getCostumer_id() {
        return costumer_id;
    }

    public void setCostumer_id(int costumer_id) {
        this.costumer_id = costumer_id;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    public Date getD1() {
        return d1;
    }

    public void setD1(Date d1) {
        this.d1 = d1;
    }

    @Override
    public String toString() {
        return transcation_id+","+costumer_id+","+amount+","+d1;
    }
}

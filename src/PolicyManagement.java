public class PolicyManagement
{
    private int policy_number;
    private String policy_Holdername;
    private String insurance_type;
    private int coverage_amount;
   public PolicyManagement(int policy_number,String policy_Holdername,String insurance_type,int coverage_amount)
   {
       this.policy_number=policy_number;
       this.policy_Holdername=policy_Holdername;
       this.insurance_type=insurance_type;
       this.coverage_amount=coverage_amount;
   }

    public int getPolicy_number() {
        return policy_number;
    }

    public void setPolicy_number(int policy_number) {
        this.policy_number = policy_number;
    }

    public String getPolicy_Holdername() {
        return policy_Holdername;
    }

    public void setPolicy_Holdername(String policy_name) {
        this.policy_Holdername = policy_Holdername;
    }

    public String getInsurance_type() {
        return insurance_type;
    }

    public void setInsurance_type(String insurance_type) {
        this.insurance_type = insurance_type;
    }

    public int getCoverage_amount() {
        return coverage_amount;
    }

    public void setCoverage_amount(int coverage_amount)
    {
        this.coverage_amount = coverage_amount;
    }

    @Override
    public String toString() {
        return "PolicyManagement{" +
                "policy_number=" + policy_number +
                ", policy_Holdername='" + policy_Holdername + '\'' +
                ", insurance_type='" + insurance_type + '\'' +
                ", coverage_amount=" + coverage_amount +
                '}';
    }
}

public class PolicyManagement
{
    private int policy_number;
    private String policy_name;
    private String insurance_type;
    private int coverage_amount;
   public PolicyManagement(int policy_number,String policy_name,String insurance_type,int coverage_amount)
   {
       this.policy_number=policy_number;
       this.policy_name=policy_name;
       this.insurance_type=insurance_type;
       this.coverage_amount=coverage_amount;
   }

    public int getPolicy_number() {
        return policy_number;
    }

    public void setPolicy_number(int policy_number) {
        this.policy_number = policy_number;
    }

    public String getPolicy_name() {
        return policy_name;
    }

    public void setPolicy_name(String policy_name) {
        this.policy_name = policy_name;
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
    public static void main(String[] args)
    {

    }
}

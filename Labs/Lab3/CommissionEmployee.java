public class CommissionEmployee extends Employee {
 
    private double grossSales;
    private double commissionRate;
 
    // TODO 5: Create constructor using super()
    public CommissionEmployee(String firstName, String lastName, String ssn, double grossSales, double commissionRate) 
    {
        super(firstName, lastName, ssn);
        if (grossSales >= 0) 
        {
            this.grossSales = grossSales;
        }

        if (commissionRate > 0 && commissionRate < 1) 
        {
            this.commissionRate = commissionRate;
        }
    }
    // TODO 6: Create getters and setters with validation
    public double getGrossSales() 
    {
        return grossSales;
    }
    public void setGrossSales(double grossSales) 
    {
        if (grossSales >= 0) 
        {
            this.grossSales = grossSales;
        }
    }

    public double getCommissionRate() 
    {
        return commissionRate;
    }

    public void setCommissionRate(double commissionRate) 
    {
        if (commissionRate > 0 && commissionRate < 1) 
        {
            this.commissionRate = commissionRate;
        }
    }
    // TODO 7: Override earnings()
     @Override
    public double earnings() {
        return grossSales * commissionRate;
    }
    // TODO 8: Override toString()
}
 
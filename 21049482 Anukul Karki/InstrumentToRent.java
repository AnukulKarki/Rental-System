/**
 * The InstrumentToRent class extends Instrument class So it is childclass and Instrument is parent class
 * The InstrumentToRent class contains 5 different where every variable is instance variable
 * A constructor was made with two parameters instrumentName and ChargePerDay
 * Setters and getters method were also made in here
 * Method for renting out the instrument and returning it is also included
 * Display method was made that calls display method from Instrumentclass and prints accordingly if item is rented
 * 
 * 
 * @author (Anukul Karki)
 * @version (21049482, javac 17.0.1)
 */
public class InstrumentToRent extends Instrument
{
    //Instance variables were initialized
    private int chargePerDay;
    private String dateOfRent;
    private String dateOfReturn;
    private int noOfDays;
    private boolean isRented;
    //Constructor with two parameters
    public InstrumentToRent( String instrumentName, int chargePerDay)
    {
        super(instrumentName);
        this.chargePerDay = chargePerDay;
        this.dateOfRent = "";
        this.dateOfReturn = "";
        this.noOfDays = 0;
        this.isRented = false;
    }
    //setter method or mutator method
    public void setChargePerDay( int chargePerDay)
    {
        this.chargePerDay = chargePerDay;
    }
    //getter method or accessor method
    public int getChargePerDay()
    {
        return this.chargePerDay;
    }
    //mutator method
    public void setDateOfRent( String dateOfRent)
    {
        this.dateOfRent = dateOfRent;
    }
    //accessor method
    public String getDateOfRent()
    {
        return this.dateOfRent;
    }
    //mutator method
    public void setDateOfReturn( String dateOfReturn)
    {
        this.dateOfReturn = dateOfReturn;
    }
    //accessor method
    public String getDateOfReturn()
    {
        return this.dateOfReturn;
    }
    //mutator method
    public void setNoOfDays( int noOfDays)
    {
        this.noOfDays = noOfDays;
    }
    //accessor method
    public int getNoOfDays()
    {
        return this.noOfDays;
    }
    //mutator method
    public void setIsRented( boolean isRented)
    {
        this.isRented = isRented;
    }
    //accessor method
    public boolean getIsRented()
    {
        return this.isRented;
    }
    //method for renting the instrument 
    public void Rent(String customerName, String customerMobile, long customerPanNo, String dateOfRent, String dateOfReturn, int noOfDays)
    {
        if (isRented == true)
        {
            System.out.println("The Item is not Available for Rent!");     
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Mobile: " + customerMobile);
            System.out.println("Date Of Return: " + dateOfReturn);
        }
        else
        {
            super.setCustomerName(customerName);
            super.setCustomerMobile(customerMobile);
            super.setCustomerPanNo(customerPanNo);
            this.dateOfRent = dateOfRent;
            this.dateOfReturn = dateOfReturn;
            this.noOfDays = noOfDays;
            this.isRented = true;
            int totalAmount = this.noOfDays * this.chargePerDay;
            
            System.out.println("This Item Is Now Rented For: ");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Mobile: " + customerMobile);
            System.out.println("Customer Pan No.: " + customerPanNo);
            System.out.println("Date Of Return: "+ dateOfReturn);
            System.out.println("Date Of Rent: " + dateOfRent);
            System.out.println("No of Days: " + noOfDays);
            System.out.println("Total Amount: " + totalAmount);
        }
    }
    /* 
     * This Method Handles the items that were rented
     * It clears data after the item is returned
     */
    public void Return()
    {
        if(isRented == false)
        {
            System.out.println("This Item is not in Rent");
        }
        else
        {
            super.setCustomerName("");
            super.setCustomerMobile("");
            this.dateOfReturn = "";
            this.dateOfRent = "";
            this.noOfDays = 0;
            super.setCustomerPanNo(0);
            this.isRented = false;
            System.out.println("Item Is Now Returned");
        }
    }
    //display method
    public void Display()
    {
        super.Display();
        if(isRented == true)
        {
            System.out.println("Customer Name: " + super.getCustomerName());
            System.out.println("Customer Mobile: " + super.getCustomerMobile());
            System.out.println("Customer Pan NO.: " + super.getCustomerPanNo());
            System.out.println("Date Of Rent: " + this.dateOfRent);
            System.out.println("Date of Return: " + this.dateOfReturn);
        }
    }
}

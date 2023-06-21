/**
 * The Instrument Class contains 5 different variable in which 1 of them is static and others were instance 
 * A constructor was created with the 1 parameter InstrumentName where instrumentId is increased automatically.
 * setters and getters methods were made for every variables 
 * Display Method was made where it displays the Instrument Name and ID also it prints customer details if found
 * 
 * 
 * @author (Anukul Karki)
 * @version (21049482, javac 17.0.1)
 */
public class Instrument
{
    //static variable is initialized
    private static int instrumentId;
    //Instance variables is initialized
    private String instrumentName;
    private String customerName;
    private String customerMobile;
    private long customerPanNo;
    //Creating constructor
    public Instrument(String instrumentName)
    {
        instrumentId = ++instrumentId;
        this.instrumentName = instrumentName;
        this.customerName = "";
        this.customerMobile = "";
        this.customerPanNo = 0;
        
    }
    //Mutator method or setter method
    public void setInstrumentId(int instrumentId)
    {
        Instrument.instrumentId = instrumentId; //Static variable can be written with class.variable
    }
    //accessor method or getter method
    public int getInstrumentId()
    {
        return Instrument.instrumentId;
    }
    //mutator method
    public void setInstrumentName( String instrumentName)
    {
        this.instrumentName = instrumentName;
    }
    //accessor method
    public String getInstrumentName()
    {
        return this.instrumentName;
    }
    //mutator method
    public void setCustomerName( String customerName)
    {
        this.customerName = customerName;
    }
    //accessor method
    public String getCustomerName()
    {
        return this.customerName;
    }
    //mutator method
    public void setCustomerMobile( String customerMobile)
    {
        this.customerMobile = customerMobile;
    }
    //accessor method
    public String getCustomerMobile()
    {
        return this.customerMobile;
    }
    //mutator method
    public void setCustomerPanNo( long customerPanNo)
    {
        this.customerPanNo = customerPanNo;
    }
    //accessor method
    public long getCustomerPanNo()
    {
        return this.customerPanNo;
    }
    //Method For Display
    public void Display()
    {
        System.out.println("Instrument Id: " + Instrument.instrumentId);
        System.out.println("Instrument Name: " + this.instrumentName);
        if( customerName.equals("") && customerMobile.equals("") && customerPanNo == 0)
        {
           System.out.println("Customer Detail Not found!"); 
        }
        else
        {
            System.out.println("Customer Name: " + this.customerName);
            System.out.println("Customer Mobile: " + this.customerMobile);
            System.out.println("Customer Pan No.: " +this.customerPanNo);
        }
    }
}

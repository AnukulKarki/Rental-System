
/**
 * The InstrumentToSell class extends Intrument class so it is child class and Instrument is parent class
 *The instrument contans 4 differnet instance variable
 * A constructor is made with two differnet parameters
 * Setters and getters method were made to every variable
 * Method for selling the insrument is also made
 * Method for displaying the was also developed and print accordingly if the item is sold
 *
 * @author (Anukul Karki)
 * @version (21049482, javac 17.0.1)
 */
public class InstrumentToSell extends Instrument
{
    //Instance variables were initialized
    private float Price;
    private String sellDate;
    private float discountPercent;
    private boolean isSold;
    //constructor
    public InstrumentToSell( String instrumentName, float Price)
    {
        super(instrumentName);
        this.Price = Price;
        this.sellDate = "";
        this.discountPercent = 0.0f;
        this.isSold = false;
    }
    //Setter Method or Mutator Method
    public void setPrice( float Price)
    {
        if( isSold = false)
        {
            this.Price = Price;
        }
        else
        {
            System.out.println("Price Cannot be Changed For the Current Item!");
        }
    }
    //Getter Method or accessor method
    public float getPrice()
    {
        return this.Price;
    }
    //Mutator Method
    public void setSellDate( String sellDate)
    {
        this.sellDate = sellDate;
    }
    //accessor method
    public String getSellDate()
    {
        return this.sellDate;
    }
    //Mutator Method
    public void setDiscountPercent( float discountPercent)
    {
        this.discountPercent = discountPercent;
    }
    //accessor method 
    public float getDiscountPercent()
    {
        return this.discountPercent;
    }
    //Mutator method
    public void setIsSold( boolean isSold)
    {
        this.isSold = isSold;
    }
    //accessor method
    public boolean getIsSold()
    {
        return this.isSold;
    }
    //Method to sell the instrument 
    public void sellInstrument( String customerName, String customerMobile, long customerPanNo, String sellDate, float discountPercent)
    {
        if(isSold == true)
        {
            System.out.println("This Item Is Already Sold!");
            System.out.println("Customer Name: " + customerName);
            System.out.println("Customer Phone: " + customerMobile);
            System.out.println("Customer Pan NO.: " + customerPanNo);
        }
        else
        {
            super.setCustomerName(customerName);
            super.setCustomerMobile(customerMobile);
            super.setCustomerPanNo(customerPanNo);
            this.sellDate = sellDate;
            this.discountPercent = discountPercent;
            this.isSold = true;
            float finalPrice = Price - ((discountPercent/100) * Price);
        }
    }
    //Method to Display output
    public void Display()
    {
        super.Display();
        System.out.println("Price: " + this.Price);
        if(isSold == true)
        {
            System.out.println("Customer Name: " + super.getCustomerName());
            System.out.println("Customer Phone: " + super.getCustomerMobile());
            System.out.println("Customer Pan NO.: " + super.getCustomerPanNo());
            System.out.println("Sell Date: " + this.sellDate);
        }
        
    }
}


/**
 * This class contains different swing components and awt components, differnt instance variable of of long, float int String datatypes are also included
 * Event Handiling for different buttons are also added using ActionListener that is firstly implemented in the class.
 * In this class it contains one constructor, one actionPerformed method, and one main method where constructor is initialized.
 * 
 * 
 *
 * @author (Anukul Karki) 
 * @version (21049482, javac 17.0.1)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;



public class SarangiSansar implements ActionListener
{
    long customerPanNoRent, customerPanNoSellValue;
    float discountValue, priceList;
    String instrumentNameList, instrumentNameSellList, rentInstrument, customerNameRent, customerMobileRent,  rentYearDate, rentMonthDate, rentDayDate, rentDate1,
    returnYearDate, returnMonthDate, returnDayDate, returnDate1, customerNameSellValue, customerMobileSellValue,  instrumentNameSellValue, sellYearDate, sellMonthDate, sellDayDate, sellDate1;
    int chargePerDayList,  chargePerDay, numberOfDays;
    JPanel rentPanel , sellPanel, rentRegisterPanel, sellRegisterPanel, returnRentPanel;
    JFrame frame;
    
    JLabel main,registerRentHead, registerSellHead,returnRentHead, rentHead, customerName, customerMobile, customerPanNo, dateOfRent, instrumentName,instrumentNameRegister, chargePerDayRegister,
     noOfDays, returnDate, sellHead, customerNameSell, customerMobileSell, customerPanNoSell, instrumentNameSell, instrumentNameSellRegister, priceSellRegister,
     discount, sellDate, instrumentNameReturn, instrumentNameHolderReturn;
    
    JTextField customerNameHolder, customerMobileHolder, customerPanNoHolder, instrumentNameHolder, noOfDaysHolder,
    customerNameSellHolder, customerMobileSellHolder, customerPanNoSellHolder, instrumentNameSellHolder,  discountHolder, instrumentNameRegisterHolder, chargePerDayRegisterHolder,
    instrumentNameSellRegisterHolder, priceSellRegisterHolder, instrumentNameReturnHolder;
    
    JComboBox<String> rentYear, rentMonth,  rentDay, returnYear, returnMonth, returnDay, sellYear, sellMonth, sellDay;
    
    JButton rent, clearRent,sell, clearSell, displaySell, displayRent, returnInstrument, addInstrumentRegister, addInstrumentSellRegister;
    ArrayList <Instrument> list  = new ArrayList<Instrument>();
    
    public SarangiSansar()
    {
        //creating frame with the heading Sarangi Sansar
        frame = new JFrame("Sarangi Sansar");
        
        
        
        //creating JPanel
        rentPanel = new JPanel();
        sellPanel = new JPanel();
        rentRegisterPanel = new JPanel();
        sellRegisterPanel = new JPanel();
        returnRentPanel = new JPanel();
        
        //Creating JLabel for the Instrument to Rent
        main = new JLabel("Sarangi Sansar");
        rentHead = new JLabel("Instrument Rent:");
        customerName = new JLabel("Customer Name:");
        customerMobile = new JLabel("Customer Mobile:");
        customerPanNo = new JLabel("Customer Pan No.:");
        dateOfRent = new JLabel("Date Of Rent:");
        instrumentName = new JLabel("Instrument Name:");
        
        noOfDays = new JLabel("No. Of Days:");
        returnDate = new JLabel("Return Date:");
    
        //JLabel for register instrument
        
        registerRentHead = new JLabel("Register Rent Instrument:");
        instrumentNameRegister = new JLabel("Instrument Name:");
        chargePerDayRegister = new JLabel("Charge Per Day");
        
        //Return Insrument Label
        returnRentHead = new JLabel("Return Instrument:");
        instrumentNameReturn = new JLabel("Instrument Name:");
        
        
        //creating JLabel for instrument to sell
        sellHead = new JLabel("Instrument Sell:");
        customerNameSell = new JLabel("Customer Name:");
        customerMobileSell = new JLabel("Customer Mobile:");
        customerPanNoSell = new JLabel("Customer Pan No.:");
        instrumentNameSell = new JLabel("Instrument Name:");
        
        discount = new JLabel("Discount:");
        sellDate = new JLabel("Sell Date:");
        
        //Register Selling Instrument
        registerSellHead = new JLabel("Register Sell Instrument:");
        instrumentNameSellRegister = new JLabel("Instrument Name:");
        priceSellRegister = new JLabel("Price:");
        
        
        
        
        
        
        
        
        
        //Creating JTextField for instrument to Rent
        customerNameHolder = new JTextField();
        customerMobileHolder = new JTextField();
        customerPanNoHolder = new JTextField();
        instrumentNameHolder = new JTextField();
        
        noOfDaysHolder = new JTextField();
        
        //JTextField register Instrument
        instrumentNameRegisterHolder = new JTextField();
        chargePerDayRegisterHolder = new JTextField();
        
        //JtextField for return Instrument
        instrumentNameReturnHolder = new JTextField();
        
        
        
        
        
        //creating JTextField for instrument to sell
        customerNameSellHolder = new JTextField();
        customerMobileSellHolder = new JTextField();
        customerPanNoSellHolder = new JTextField();
        instrumentNameSellHolder = new JTextField();
        
        discountHolder = new JTextField();
        
        //JTextField for register selling instrument
        instrumentNameSellRegisterHolder = new JTextField();
        priceSellRegisterHolder = new JTextField();
        
        
        
        
        
        
        
        
        //Creting the array for the check box in instrument to rent and instrument to sell
        String[] year = {"2021","2022","2023","2024","2025","2026","2027","2028","2029","2030"};
        String[] day = {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32"};
        String[] month = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        
        // creating the combo box for the instrument to rent
        rentYear = new JComboBox<String>(year);
        rentMonth = new JComboBox<String>(month);
        rentDay = new JComboBox<String>(day);
        returnYear = new JComboBox<String>(year);
        returnMonth = new JComboBox<String>(month);
        returnDay = new JComboBox<String>(day);
        
        //Creating the combob box for the instrument to sell
        sellYear = new JComboBox<String>(year);
        sellMonth = new JComboBox<String>(month);
        sellDay = new JComboBox<String>(day);
        
        
        
        
        //Creating Buttons for the instrument to rent
        
        rent = new JButton("Rent");
        
        //adding action listener
        rent.addActionListener(this);
        clearRent = new JButton("Clear");
        clearRent.addActionListener(this);
        
        //creating buttons for the instrumetn to sell
        sell = new JButton("Sell");
        sell.addActionListener(this);
        clearSell = new JButton("Clear");
        clearSell.addActionListener(this);
        
        //button for display
        displaySell = new JButton("Display");
        displaySell.addActionListener(this);
        displayRent = new JButton("Display");
        displayRent.addActionListener(this);
        
        
        //register instrument rent button
        addInstrumentRegister = new JButton("Add Instrument");
        //action listner
        addInstrumentRegister.addActionListener(this);
        
        //register Instrument sell button
        addInstrumentSellRegister = new JButton("Add Instrument");
        
        //actionListener
        addInstrumentSellRegister.addActionListener(this);
        
        
        //return instrument button
        returnInstrument = new JButton("Return");
        returnInstrument.addActionListener(this);
        
        
        
        
        //creating the object for the font;
        Font mainFont = new Font("Arial", Font.BOLD, 30);
        Font subHeadFont = new Font("Arial",Font.PLAIN, 25);
        Font font = new Font("Arial",Font.PLAIN,18);
        
        //line border
        
        
        
        //setting the bounds for the Heading
        main.setBounds(660,26,250,35);
        
        //Setting the bounds in the label for the instrument to rent
        rentHead.setBounds(40,3,200,30);
        customerName.setBounds(40,50,150,20);
        customerMobile.setBounds(40,100,150,20);
        customerPanNo.setBounds(40,150,170,20);
        dateOfRent.setBounds(40,200,138,20);
        instrumentName.setBounds(500,50,148,20);
        
        noOfDays.setBounds(500,100,138,20);
        returnDate.setBounds(500,200,138,20);
        
        //setting up the bounds for register Instrument To register
        registerRentHead.setBounds(40,3,300,30);
        instrumentNameRegister.setBounds(40,50,150,20);
        chargePerDayRegister.setBounds(40,100,150,20);
        
        //settting up the bound for the return of rented instrument
        returnRentHead.setBounds(40,3,300,30);
        instrumentNameReturn.setBounds(40,50,150,20);
        
        //setting up the bounds for the JLabel of register for instrument
        
        registerSellHead.setBounds(40,3,300,30);
        instrumentNameSellRegister.setBounds(40,50,150,20);
        priceSellRegister.setBounds(40,100,150,20);
        
        
        
        
        //Setting bounds in the JLabel for the instrument to sell
        sellHead.setBounds(40,3,200,30);
        customerNameSell.setBounds(40,50,150,20);
        customerMobileSell.setBounds(40,100,150,20);
        customerPanNoSell.setBounds(40,150,170,20);
        instrumentNameSell.setBounds(500,50,148,20);
        discount.setBounds(500,100,138,20);
        sellDate.setBounds(500,150,138,20);
        
        
        //setting bounds for JTextField for the instrumentToRent
        
        customerNameHolder.setBounds(215,48,200,30);
        customerMobileHolder.setBounds(215,98,200,30);
        customerPanNoHolder.setBounds(215,148,200,30);
        instrumentNameHolder.setBounds(665,48,200,30);
        noOfDaysHolder.setBounds(665,98,200,30);
        
        //setting up the bounds for JTextField of register Instrument
        instrumentNameRegisterHolder.setBounds(215,48,200,30);
        chargePerDayRegisterHolder.setBounds(215,98,200,30);
        
        //setting up the bounds text field for instrument return field
        instrumentNameReturnHolder.setBounds(215,48,200,30);
        
        //setting up the bounds text field for instrument register field
        instrumentNameSellRegisterHolder.setBounds(215,48,200,30);
        priceSellRegisterHolder.setBounds(215,98,200,30);
        
        
        //setting bounds for JTextField for instrumentToSell
        customerNameSellHolder.setBounds(215,48,200,30);
        customerMobileSellHolder.setBounds(215,98,200,30);
        customerPanNoSellHolder.setBounds(215,148,200,30);
        instrumentNameSellHolder.setBounds(665,48,200,30);
        discountHolder.setBounds(665,98,200,30);
        
        //setting bounds for the combo box for the instrument to rent
        
        rentYear.setBounds(215,198,85,30);
        rentMonth.setBounds(310,198,70,30);
        rentDay.setBounds(390,198,65,30);
        returnYear.setBounds(665,198,85,30);
        returnMonth.setBounds(760,198,70,30);
        returnDay.setBounds(840,198,65,30);
        
        //setting bounds for the combo box for the instrument to sell
        sellYear.setBounds(665,148,85,30);
        sellMonth.setBounds(760,148,70,30);
        sellDay.setBounds(840,148,65,30);
        
        //setting bounds for the buttons in the instrument to rent
        
        rent.setBounds(659,265,100,32);
        clearRent.setBounds(799,265,100,32);
        displayRent.setBounds(40,265,100,32);
        
        //setting up the bounds for the button to register instrument to rent
        addInstrumentRegister.setBounds(245,142,170,30);
        
        //setting the bounds for the button to return the instrument
        returnInstrument.setBounds(295,98,120,30);
        
        //setting the bounds for the button to register to sell field
        addInstrumentSellRegister.setBounds(245,148,170,30);
        
        //setting bounds for the buttons in the instrument to sell
        sell.setBounds(659,225,100,32);
        clearSell.setBounds(799,225,100,32);
        displaySell.setBounds(40,225,100,32);
        
        
        
        
        /*Setting up the fonts for the JLabel of instrument to sell
        and Instrument to rent */
        
        
        //Setting the fonts size to the component of instrument to rent
        main.setFont(mainFont);
        rentHead.setFont(subHeadFont);
        registerRentHead.setFont(subHeadFont);
        returnRentHead.setFont(subHeadFont);
        registerSellHead.setFont(subHeadFont);
        customerName.setFont(font);
        customerMobile.setFont(font);
        customerPanNo.setFont(font);
        dateOfRent.setFont(font);
        instrumentName.setFont(font);
        noOfDays.setFont(font);
        returnDate.setFont(font);
        
        //setting up the fonts for register Instrument
        instrumentNameRegister.setFont(font);
        chargePerDayRegister.setFont(font);
        
        //setting up the fonts for return instrument
        instrumentNameReturn.setFont(font);
        
        //setting the fonts for register Instrument To sell
        instrumentNameSellRegister.setFont(font);
        priceSellRegister.setFont(font);
        
        //Setting font's for the instrument to sell
        sellHead.setFont(subHeadFont);
        customerNameSell.setFont(font);
        customerMobileSell.setFont(font);
        customerPanNoSell.setFont(font);
        instrumentNameSell.setFont(font);
        discount.setFont(font);
        sellDate.setFont(font);
        
        
        
        
        
        
        //setting the font for the text field
        customerNameHolder.setFont(font);
        customerMobileHolder.setFont(font);
        customerPanNoHolder.setFont(font);
        instrumentNameHolder.setFont(font);
        noOfDaysHolder.setFont(font);
        
        //setting fonts for text Field for register rent
        instrumentNameRegisterHolder.setFont(font);
        chargePerDayRegisterHolder.setFont(font);
        
        //setting fonts for text field for return rented instrument
        instrumentNameReturnHolder.setFont(font);
        
        //setting fonts for text Field for register selling instrument
        instrumentNameSellRegisterHolder.setFont(font);
        priceSellRegisterHolder.setFont(font);
        
        
        //setting the fonts for the text field of instrument to sell
        
        customerNameSellHolder.setFont(font);
        customerMobileSellHolder.setFont(font);
        customerPanNoSellHolder.setFont(font);
        instrumentNameSellHolder.setFont(font);
        discountHolder.setFont(font);
        
        
        
        
        
        
        
        //setting the font for the combo box
        rentYear.setFont(font);
        rentMonth.setFont(font);
        rentDay.setFont(font);
        returnYear.setFont(font);
        returnMonth.setFont(font);
        returnDay.setFont(font);
        
        //setting font for the combo box
        sellYear.setFont(font);
        sellMonth.setFont(font);
        sellDay.setFont(font);
        
        
        //setting the font for the buttons
        
        rent.setFont(font);
        clearRent.setFont(font);
        displayRent.setFont(font);
        
        //setting the color 
        rent.setBackground(Color.decode("#f0b86c"));
        clearRent.setBackground(Color.decode("#f0b86c"));
        displayRent.setBackground(Color.decode("#f0b86c"));
        
        
        //adding font to button of register rent
        addInstrumentRegister.setFont(font);
        
        //setting the color
        addInstrumentRegister.setBackground(Color.decode("#f0b86c"));
        
        
        //adding font to button of return of instrument
        returnInstrument.setFont(font);
        
        //setting the color 
        returnInstrument.setBackground(Color.decode("#f0b86c"));
        //adding font to button of register of selling instrument
        addInstrumentSellRegister.setFont(font);
        
        //setting the color for the button
        addInstrumentSellRegister.setBackground(Color.decode("#f0b86c"));
    
        
        //setting the fonts for the buttons of instrument to sell
        sell.setFont(font);
        clearSell.setFont(font);
        displaySell.setFont(font);
        
        //setting the color
        sell.setBackground(Color.decode("#f0b86c"));
        clearSell.setBackground(Color.decode("#f0b86c"));
        displaySell.setBackground(Color.decode("#f0b86c"));
        
        //coloring the frame
        frame.getContentPane().setBackground(Color.decode("#b3d4ff"));
        
    
        
        //adding the Jlabel components in the Panel
        
        frame.add(main);
        rentPanel.add(rentHead);
        rentPanel.add(customerName);
        rentPanel.add(customerMobile);
        rentPanel.add(customerPanNo);
        rentPanel.add(dateOfRent);
        rentPanel.add(instrumentName);
        rentPanel.add(noOfDays);
        rentPanel.add(returnDate);
        
        //adding the JLabel Components of register Rent Instrument in the JPanel
        rentRegisterPanel.add(registerRentHead);
        rentRegisterPanel.add(instrumentNameRegister);
        rentRegisterPanel.add(chargePerDayRegister);
        
        //adding JLabel component of return instrument
        returnRentPanel.add(returnRentHead);
        returnRentPanel.add(instrumentNameReturn);
        
        //adding JLabelComponent of register Selling instrument
        sellRegisterPanel.add(registerSellHead);
        sellRegisterPanel.add(instrumentNameSellRegister);
        sellRegisterPanel.add(priceSellRegister);
        
        
        
        //adding textField in frame
        sellPanel.add(sellHead);
        sellPanel.add(customerNameSell);
        sellPanel.add(customerMobileSell);
        sellPanel.add(customerPanNoSell);
        sellPanel.add(instrumentNameSell);
        sellPanel.add(discount);
        sellPanel.add(sellDate);
        
        //Adding TextField component in the frame
        rentPanel.add(customerNameHolder);
        rentPanel.add(customerMobileHolder);
        rentPanel.add(customerPanNoHolder);
        rentPanel.add(instrumentNameHolder);
        rentPanel.add(noOfDaysHolder);
        
        
        //adding TextField components of register Rent Instrument in JPanel
        
        rentRegisterPanel.add(instrumentNameRegisterHolder);
        rentRegisterPanel.add(chargePerDayRegisterHolder);
        
        //adding Text Field components of return insturment in JPanel
        returnRentPanel.add(instrumentNameReturnHolder);
        
        
        //addint text field componnets of register instrument in sell
        sellRegisterPanel.add(instrumentNameSellRegisterHolder);
        sellRegisterPanel.add(priceSellRegisterHolder);
        
        
        //Adding textField components in the JPanel
        
        sellPanel.add(customerNameSellHolder);
        sellPanel.add(customerMobileSellHolder);
        sellPanel.add(customerPanNoSellHolder);
        sellPanel.add(instrumentNameSellHolder);
        sellPanel.add(discountHolder);
        
        //Adding the combo box component in the frame
        rentPanel.add(rentYear);
        rentPanel.add(rentMonth);
        rentPanel.add(rentDay);
        rentPanel.add(returnYear);
        rentPanel.add(returnMonth);
        rentPanel.add(returnDay);
        
        //addiing the combo box in the JPanel
        sellPanel.add(sellYear);
        sellPanel.add(sellMonth);
        sellPanel.add(sellDay);
        
        //adding the button in the frame
        rentPanel.add(rent);
        rentPanel.add(clearRent);
        rentPanel.add(displayRent);
        
        //adding the buttons in the JPanel of rent Instrument Register
        rentRegisterPanel.add(addInstrumentRegister);
        
        //adding button to return instrument
        returnRentPanel.add(returnInstrument);
        
        //adding JButton to register instrument to sell
        sellRegisterPanel.add(addInstrumentSellRegister);
        
        //adding the button in the JPanel
        sellPanel.add(sell);
        sellPanel.add(clearSell);
        sellPanel.add(displaySell);
        
        
        
        //setting bounds for rentPanel
        rentPanel.setBounds(530,80,945,320);
        sellPanel.setBounds(530,410,945,320);
        rentRegisterPanel.setBounds(10,80,510,178 );
        returnRentPanel.setBounds(10,268,510,132);
        sellRegisterPanel.setBounds(10,410,510,320);
        
        
        //adding the border in the JPanel
        rentPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        sellPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        rentRegisterPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        returnRentPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        sellRegisterPanel.setBorder(BorderFactory.createLineBorder(Color.black));
        
        //disabiling the layout
        rentPanel.setLayout(null);
        sellPanel.setLayout(null);
        rentRegisterPanel.setLayout(null);
        returnRentPanel.setLayout(null);
        sellRegisterPanel.setLayout(null);
        
        //coloring the pannel
        rentPanel.setBackground(Color.decode("#B9FFF7"));
        sellPanel.setBackground(Color.decode("#B9FFF7"));
        returnRentPanel.setBackground(Color.decode("#B9FFF7"));
        rentRegisterPanel.setBackground(Color.decode("#B9FFF7"));
        sellRegisterPanel.setBackground(Color.decode("#B9FFF7"));
        
        
        
        
        
        
        
        //adding the pannel in the frame
        frame.add(rentPanel);
        frame.add(sellPanel);
        frame.add(rentRegisterPanel);
        frame.add(returnRentPanel);
        frame.add(sellRegisterPanel);
        
        
        
        
        
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setSize(1500,780);
        
        
    }
    //boolean instadd = false;
    //int counter = 0; 
    public void actionPerformed(ActionEvent event)
    {
        //checking which button is preseed
        if(event.getSource() == addInstrumentRegister)
        {
            boolean exist = false;
            //checking if the field is empty
            if(instrumentNameRegisterHolder.getText().isEmpty() || chargePerDayRegisterHolder.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Empty Fields Found!! Please Enter the value", "Empty Field", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                
                //try catch block to handle exception
                try
                {
                    
                    instrumentNameList = instrumentNameRegisterHolder.getText();
                    chargePerDayList = Integer.parseInt(chargePerDayRegisterHolder.getText());
                    //checking if the size of the list is 0
                    if(list.size() == 0 )
                    {
                        InstrumentToRent instrumentRentObj = new InstrumentToRent(instrumentNameList, chargePerDayList);
                        list.add(instrumentRentObj);
                        JOptionPane.showMessageDialog(frame,instrumentNameList+ " is added to list. \nCharge Per Day: "+chargePerDayList );
                    }
                    else
                    {
                        //checking if the instrument already exist
                        for(Instrument instrumentNameCheck: list)
                        {
                            if(instrumentNameCheck.getInstrumentName().equals(instrumentNameList) && instrumentNameCheck instanceof InstrumentToRent)
                            {
                                exist = true;
                                break;
                            }
                        }
                        //adding the instrument if the instrument is not in the list
                        if(exist == false )
                        {
                            InstrumentToRent instrumentRentObj = new InstrumentToRent(instrumentNameList, chargePerDayList);
                            list.add(instrumentRentObj);
                            JOptionPane.showMessageDialog(frame,instrumentNameList+ " is added to list. \nCharge Per Day: "+ chargePerDayList );
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(frame,"This Instrument already Exist","Repetation Found", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    
                    
                    
                    
                    //clearing the insturment field
                    
                    instrumentNameRegisterHolder.setText("");
                    chargePerDayRegisterHolder.setText("");
                }catch(NumberFormatException exception)
                {
                    JOptionPane.showMessageDialog(frame,"Use Integer In Charge Per Day","Integer Error",JOptionPane.ERROR_MESSAGE);
                    instrumentNameRegisterHolder.setText("");
                    chargePerDayRegisterHolder.setText("");
                }                
            }
        }
        if(event.getSource() == addInstrumentSellRegister)
        
        {
            boolean sellExist = false;
            if(instrumentNameSellRegisterHolder.getText().isEmpty() || priceSellRegisterHolder.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Empty Fields Found!! Please Enter the value", "Empty Field", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                
               try
                {
                    instrumentNameSellList = instrumentNameSellRegisterHolder.getText();
                    priceList = Float.parseFloat(priceSellRegisterHolder.getText());
                    
                    if( list.size() == 0)
                    {
                        InstrumentToSell instrumentSellObj = new InstrumentToSell(instrumentNameSellList, priceList);
                        list.add(instrumentSellObj);
                        JOptionPane.showMessageDialog(frame,instrumentNameSellList+ " is added to list. \nPrice: "+ priceList );
                        
                    }
                    else 
                    {
                        for(Instrument instrumentNameSellCheck : list)
                        {
                            if(instrumentNameSellCheck.getInstrumentName().equals(instrumentNameSellList) && instrumentNameSellCheck instanceof InstrumentToSell)
                            {
                                sellExist = true;
                            }
                        }
                        if(sellExist == false )
                        {
                            InstrumentToSell instrumentSellObj = new InstrumentToSell(instrumentNameSellList, priceList);
                            list.add(instrumentSellObj);
                            JOptionPane.showMessageDialog(frame,instrumentNameSellList+ " is added to list. \nPrice: "+ priceList);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(frame,"This Instrument already Exist","Repetation Found", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                    
                    
                    //clearing the data
                    instrumentNameSellRegisterHolder.setText("");
                    priceSellRegisterHolder.setText("");
                    
                }catch(NumberFormatException exception)
                {
                    JOptionPane.showMessageDialog(frame,"Use Integer","Integer Error",JOptionPane.ERROR_MESSAGE);
                    instrumentNameSellRegisterHolder.setText("");
                    priceSellRegisterHolder.setText("");
                }  
            }
                
        }
        if(event.getSource() == rent)
        {
            //checking if the field is empty or not
            if(instrumentNameHolder.getText().isEmpty() || customerNameHolder.getText().isEmpty() || customerPanNoHolder.getText().isEmpty() || 
            customerMobileHolder.getText().isEmpty() || noOfDaysHolder.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Empty Field Found!!", "Empty Field", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    rentInstrument = instrumentNameHolder.getText(); 
                    numberOfDays = Integer.parseInt(noOfDaysHolder.getText());
                    customerNameRent = customerNameHolder.getText();
                    customerMobileRent = customerMobileHolder.getText();
                    customerPanNoRent = Long.parseLong(customerPanNoHolder.getText());
                    rentYearDate = rentYear.getSelectedItem().toString();
                    rentMonthDate = rentMonth.getSelectedItem().toString();
                    rentDayDate = rentDay.getSelectedItem().toString();
                    rentDate1 = rentYearDate +" " +  rentMonthDate +" " +  rentDayDate;
                        
                    returnYearDate = sellYear.getSelectedItem().toString();
                    returnMonthDate = sellMonth.getSelectedItem().toString();
                    returnDayDate = sellDay.getSelectedItem().toString();
                    returnDate1 = returnYearDate +" " + returnMonthDate + " " + returnDayDate;
                    
                    int rentNumber = 0;
                    for(Instrument instrument: list)
                    {
                        //checking if the instrument name is same or not
                        if(instrument.getInstrumentName().equals(rentInstrument))
                        {
                            /*
                                UpCasting is already done while adding the objects of the instrument to ArryayList of Instrument Type 
                                We dont need to create another obect as we sell what we have. 
                                while adding the instrument To Rent into instrument class It turned into parent class object. 
                                It got changed because it have the relation of parent calss and child class
                                */
                                
                            
                            
                                
                            /*checking if the instrument is for the renting 
                             if not then the error message is thrown*/
                            if(instrument instanceof InstrumentToRent)
                            {
                                /*downcasting the instrument to InstrumentToRent in order to access the method 
                                Rent of instrumentToRent Method from the method of instrument object*/
                                InstrumentToRent  instrumentRent = (InstrumentToRent)instrument;
                                        
                                if(instrumentRent.getIsRented())
                                {
                                   for(Instrument checkName : list)
                                    {
                                        //it shows to whom the instrument is already rented
                                        if(checkName.getInstrumentName().equals(rentInstrument) && instrumentRent.getIsRented() && checkName instanceof InstrumentToRent)
                                        {
                                            JOptionPane.showMessageDialog(frame,"This Item Is already Rented to : " + checkName.getCustomerName());
                                            break;
                                        }
                                    }
                                   break;
                                }
                                else
                                {
                                    //Renting the instrument
                                    instrumentRent.Rent(customerNameRent, customerMobileRent, customerPanNoRent, rentDate1, returnDate1, numberOfDays);
                                    JOptionPane.showMessageDialog(frame, "Your Instrument: "+ rentInstrument+" \nis Rented for Charge:" + instrumentRent.getChargePerDay());
                                    
                                    customerNameHolder.setText("");
                                    customerMobileHolder.setText("");
                                    customerPanNoHolder.setText("");
                                    instrumentNameHolder.setText("");
                                    noOfDaysHolder.setText("");
                                    rentYear.setSelectedIndex(0);
                                    rentMonth.setSelectedIndex(0);
                                    rentDay.setSelectedIndex(0);
                                    returnYear.setSelectedIndex(0);
                                    returnMonth.setSelectedIndex(0);
                                    returnDay.setSelectedIndex(0);
                
                                    break;
                                }
                            }
                             
                        }
                        rentNumber++;
                        
                    
                    }
                    //checking if the instrument is available or not
                    if(rentNumber == list.size())
                    {
                            JOptionPane.showMessageDialog(frame, "No Instrument Available", "Not Found", JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch(NumberFormatException exception1)
                {
                    JOptionPane.showMessageDialog(frame,"Use Days In Integer", "Intger Error", JOptionPane.ERROR_MESSAGE);
                }
            }
                
        }
        if(event.getSource() == sell)
        {
            //checking if the field is empty or not
            if(customerNameSellHolder.getText().isEmpty() || customerMobileSellHolder.getText().isEmpty() || customerPanNoSellHolder.getText().isEmpty() || 
            instrumentNameSellHolder.getText().isEmpty() || discountHolder.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Empty Field Found!!", "Empty Field", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                try
                {
                    customerNameSellValue = customerNameSellHolder.getText();
                    customerMobileSellValue = customerMobileSellHolder.getText();
                    instrumentNameSellValue = instrumentNameSellHolder.getText();
                    discountValue = Float.parseFloat(discountHolder.getText());
                    customerPanNoSellValue = Long.parseLong(customerPanNoSellHolder.getText());
                    sellYearDate = sellYear.getSelectedItem().toString();
                    sellMonthDate = sellMonth.getSelectedItem().toString();
                    sellDayDate = sellDay.getSelectedItem().toString();
                    sellDate1 = sellYearDate+" " + sellMonthDate+ " " + sellDayDate;
                    
                    int sellNumber = 0; 
                    
                    for(Instrument instrument : list)
                    {
                        //checking if the instrument name matches to the existing instrument
                        if(instrument.getInstrumentName().equals(instrumentNameSellValue))
                        {
                            /*
                                UpCasting is already done while adding the objects of the instrument to ArryayList of Instrument Type 
                                We dont need to create another obect as we sell what we have. 
                                while adding the instrument To Sell into instrument class It turned into parent class object. 
                                It got changed because it have the relation of parent calss and child class
                            */
                           
                        
                            if(instrument instanceof InstrumentToSell )
                            {
                                //downcasting as we have the object in instrument that need to be convert into instrumentSell
                                InstrumentToSell instrumentSell = (InstrumentToSell) instrument;
                                if(instrumentSell.getIsSold())
                                {
                                    for(Instrument checkName : list)
                                    {
                                        if(checkName.getInstrumentName().equals(instrumentNameSellValue) && checkName instanceof InstrumentToSell)
                                        {
                                            JOptionPane.showMessageDialog(frame,"This Item Is already Sold to : " + checkName.getCustomerName());
                                        }
                                    }
                                    break;
                                }
                                else
                                {
                                    instrumentSell.sellInstrument(customerNameSellValue, customerMobileSellValue, customerPanNoSellValue, sellDate1, discountValue);
                                    JOptionPane.showMessageDialog(frame, "Your Instrument: "+ instrumentNameSellValue + " \nis Sold for: "+ (instrumentSell.getPrice() -(instrumentSell.getPrice() * (instrumentSell.getDiscountPercent()/100 ))));  
                                    customerNameSellHolder.setText("");
                                    customerMobileSellHolder.setText("");
                                    customerPanNoSellHolder.setText("");
                                    instrumentNameSellHolder.setText("");
                                    discountHolder.setText("");
                                    sellYear.setSelectedIndex(0);
                                    sellMonth.setSelectedIndex(0);
                                    sellDay.setSelectedIndex(0);
                                    break;
                                    
                                }
                                
                            }
                        }
                        sellNumber++;
                    }
                    //checking if the instrument is available or not
                    if(sellNumber == list.size())
                    {
                            JOptionPane.showMessageDialog(frame, "No Instrument Available", "Not Found", JOptionPane.ERROR_MESSAGE);
                    }
                     
                }
                catch(NumberFormatException event1)
                {
                    JOptionPane.showMessageDialog(frame,"Use in intger format", "Integer Error", JOptionPane.ERROR_MESSAGE);                    
                }
                
            }
        }
        if(event.getSource() == clearRent)
        {
            //clearing all the data
            instrumentNameRegisterHolder.setText("");
            chargePerDayRegisterHolder.setText("");
            customerNameHolder.setText("");
            customerMobileHolder.setText("");
            customerPanNoHolder.setText("");
            instrumentNameHolder.setText("");
            noOfDaysHolder.setText("");
            instrumentNameReturnHolder.setText("");
            rentYear.setSelectedIndex(0);
            rentMonth.setSelectedIndex(0);
            rentDay.setSelectedIndex(0);
            returnYear.setSelectedIndex(0);
            returnMonth.setSelectedIndex(0);
            returnDay.setSelectedIndex(0);
        }
        if(event.getSource() == clearSell)
        {
            //clearing all the data
            instrumentNameSellRegisterHolder.setText("");
            priceSellRegisterHolder.setText("");
            customerNameSellHolder.setText("");
            customerMobileSellHolder.setText("");
            customerPanNoSellHolder.setText("");
            instrumentNameSellHolder.setText("");
            discountHolder.setText("");
            sellYear.setSelectedIndex(0);
            sellMonth.setSelectedIndex(0);
            sellDay.setSelectedIndex(0);
        }
        //event handle to rent the insturment
        if(event.getSource() == returnInstrument )
        
        {
            //checking if the field is empty ot not
            if(instrumentNameReturnHolder.getText().isEmpty())
            {
                JOptionPane.showMessageDialog(frame,"Empty Field Found", "Empty Field", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                String returnInstrumentName = instrumentNameReturnHolder.getText();
                boolean itemCheck = false; 
                for(Instrument instrument: list)
                {
                    //checking the instrument name
                    if(instrument.getInstrumentName().equals(returnInstrumentName))
                    {
                         
                        
                        
                        //checking the instance
                        if(instrument instanceof InstrumentToRent)
                        {
                            InstrumentToRent instrumentRent = (InstrumentToRent) instrument;
                            itemCheck = true;
                            //checing if the instrument is rented or not
                            if(instrumentRent.getIsRented() == true)
                            {
                                
                                JOptionPane.showMessageDialog(frame,"Your Item is Returned.\nTotal Price: "+ instrumentRent.getChargePerDay() * instrumentRent.getNoOfDays());
                                instrumentRent.Return();
                                instrumentNameReturnHolder.setText("");
                            }
                            else
                            {
                          
                                JOptionPane.showMessageDialog(frame,"Your Item is not Rented", "Rent Not Found", JOptionPane.ERROR_MESSAGE);
                            }
                            break;
                        }
                    }
                }
                //checking if the instrument is not found
                if(itemCheck == false)
                {
                    JOptionPane.showMessageDialog(frame,"No Item Found","Not Found", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        //method to display
        if(event.getSource() == displayRent )
        
        {
            int counter = 0 ;
            int rentCounter = 0;
            for(Instrument instrument: list)
            {
                
                
                //checking if the object instance of InstrumentToRent
                if(instrument instanceof InstrumentToRent)
                {
                    InstrumentToRent instrumentRent = (InstrumentToRent) instrument;
                    
                    instrumentRent.Display();
                    counter ++;
                    //checking if the instrument is rented or not
                    if(instrumentRent.getIsRented() == false)
                    {
                        rentCounter++;

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame,"Your item is rented to \nCustomer Name:" + instrumentRent.getCustomerName()+"\nInstrument Name:" + instrumentRent.getInstrumentName()+ "\nCustomer Number: " + instrumentRent.getCustomerMobile()+
                        "\nCustomer Pan NO: "+ instrumentRent.getCustomerPanNo()+ "\nDate Of Rent: "+ instrumentRent.getDateOfRent() + "\nDate of Return: "+ instrumentRent.getDateOfReturn());
                    }
                    
                    
                }
            }
            //message if the instrument is not rented
            if(counter == rentCounter)
            {
                JOptionPane.showMessageDialog(frame,"Your Item is not Rented");
            }
            
        }
        //for displaying sell value
        if(event.getSource() == displaySell)
        {
            int sellCustomer = 0; 
            int sellNumber = 0;
            for(Instrument instrument: list)
            {
                
                
                
                //checking if the object is instanceof instrumentToSell
                if(instrument instanceof InstrumentToSell)
                {
                    InstrumentToSell instrumentSell = (InstrumentToSell) instrument;
                    instrumentSell.Display();
                    sellNumber++;
                    //checking if the instrument is sold or not
                    if(instrumentSell.getIsSold() == false)
                    {
                        sellCustomer++;

                    }
                    else
                    {
                        JOptionPane.showMessageDialog(frame,"Your item is Sold to \nCustomer Name:" + instrumentSell.getCustomerName()+"\nInstrument Name:" + instrumentSell.getInstrumentName()+ "\nCustomer Number: " + instrumentSell.getCustomerMobile()+
                        "\nCustomer Pan NO: "+ instrumentSell.getCustomerPanNo()+ "\nDate Of Sold: "+ instrumentSell.getSellDate());
                    }
                    
                }
                
            }
            if(sellCustomer == sellNumber)
            {
                JOptionPane.showMessageDialog(frame,"Your Item is not Sold");
            }
        }        
          
    }
        
    
    public static void main(String[] args)
    {
        new SarangiSansar();
    }
    
}

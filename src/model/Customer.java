/*******************************************************************************
* Title: Customer.java
* Author: Hunter Schoonover
* Date: 11/19/15
*
* Purpose:
*
* This class stores information about a customer:
*       Skoonie Key, ID, Display Name, Address Line 1, Address Line 2, City, 
*       State, Zip Code
*
*/

//------------------------------------------------------------------------------

package model;

//------------------------------------------------------------------------------

//------------------------------------------------------------------------------
//------------------------------------------------------------------------------
// class Customer
//

public class Customer extends Record
{
    
    private String name;
    public String getName() { return name; }
    public void setName(String pName) { name = pName; }
    
    private String addressLine1;
    public String getAddressLine1() { return addressLine1; }
    public void setAddressLine1(String pLine) { addressLine1 = pLine; }
    
    private String addressLine2;
    public String getAddressLine2() { return addressLine2; }
    public void setAddressLine2(String pLine) { addressLine2 = pLine; }
    
    private String city;
    public String getCity() { return city; }
    public void setCity(String pCity) { city = pCity; }
    
    private String state;
    public String getState() { return state; }
    public void setState(String pState) { state = pState; }
    
    private String zipCode;
    public String getZipCode() { return zipCode; }
    public void setZipCode(String pZip) { zipCode = pZip; }
    
    //--------------------------------------------------------------------------
    // Customer::Customer (constructor)
    //

    public Customer(String pSkoonieKey, String pId, String pName, 
                        String pAdLine1, String pAdLine2, String pCity, 
                        String pState, String pZip)
    {
        
        super(pSkoonieKey, pId);
        
        name            = pName;
        addressLine1    = pAdLine1;
        addressLine2    = pAdLine2;
        city            = pCity;
        state           = pState;
        zipCode         = pZip;

    }//end of Customer::Customer (constructor)
    //--------------------------------------------------------------------------
    
}//end of class Customer
//------------------------------------------------------------------------------
//------------------------------------------------------------------------------

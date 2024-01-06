/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author saifu
 */
public class Bus 
{
    private String id;
    private String destination;
    private int available;
    private int mrp;
    
    public Bus(String id, String pname,int available, int mrp)
    {
        this.id=id;
        this.destination=pname;
        this.available=available;
        this.mrp=mrp;
        
        
    }
            
    public String getid()
    {
        return id;
    }
    public String getdestination()
    {
        return destination;
    }
    public int getavailable()
    {
        return available;
    }
    public int getmrp()
    {
        return mrp;
    }
  }



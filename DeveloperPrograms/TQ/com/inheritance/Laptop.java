package com.inheritance;

public class Laptop {
private int noOfUsbPort;
private int processorSpeed;
 
public void setNoOfUsbPort(int noOfUsbPort)
{
this.noOfUsbPort=noOfUsbPort;	
}
public void setProcessorSpeed(int processorSpeed)
{
this.processorSpeed=processorSpeed;	
}
public int getNoOfUsbPort()
{
return noOfUsbPort;	
}
public int getProcessorSpeed()
{
return processorSpeed;
}

public static void main(String[] args)
{
Laptop l=new Laptop();
l.setNoOfUsbPort(12);
l.setProcessorSpeed(56);
System.out.println(l.getNoOfUsbPort());
System.out.println(l.getProcessorSpeed());
}
}
package com.Encapsulation;

public class car {
private int modelNumber;
private String carName;
private int speedLimit;

public void setModelNumber(int modelNumber)
{
this.modelNumber=modelNumber;	
}
public void setCarName(String carName)
{
this.carName=carName;
}
public void setSpeedLimit(int speedLimit)
{
if(speedLimit<80)
{
	this.speedLimit=speedLimit;
	}
else
{
System.out.println("Error message");	
}
}
public int getModelNumber()
{
return modelNumber;
}
public String getCarName()
{
return carName;	
}
public int getSpeedLimit()
{
return speedLimit;	
}

	
}
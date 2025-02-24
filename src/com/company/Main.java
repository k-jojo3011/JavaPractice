package com.company;

class Computer // just an idea (blueprint) and u need an object to use that idea
{
    public void  playMusic() // here void means u dont want something in return
    {
        System.out.println("Music Playing...");

    }
    public String getMeAPen(int cost) // whatever u returning u have to mention here , like in this case we returning a string pen
    {
        if(cost >=10)
           return "Pen";
        else
            return "Nothing";

    }
}
// what to access the computer class u have to create an object of the computer
public class Main {

    public static void main(String[] args)
    {

        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getMeAPen(12);
        System.out.println(str);
	// write your code here

    }
}


package com.journaldev.design.builder;

import com.journaldev.design.builder.Computer;
 
public class TestBuilderPattern {
 
    public static void main(String[] args) {
        //Using builder to get the object in a single line of code and 
                //without any inconsistent state or arguments management issues     
        Computer comp = new Computer.ComputerBuilder(
                "500 GB", "2 GB").setBluetoothEnabled(true)
                .setGraphicsCardEnabled(true).build();
        
        System.out.println(comp.getRAM());
        
                Computer comp2 = new Computer.ComputerBuilder(
                "700 GB", "12 GB").setBluetoothEnabled(false)
                .setGraphicsCardEnabled(true).build();
        
        System.out.println(comp2);
    }
    
 
}

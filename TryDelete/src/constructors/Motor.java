/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors;

/**
 *
 * @author Tony
 */
class Motor {
    public static int count = 0;
    private int countO = 0;
    public Motor(){  
    count++;
    System.out.println("Motor started");
    }
    
    public void showInfo() {
        System.out.println("count: "+count+"countO: "+countO);
    }
    
    public static void countPlus(){
        count++;
    }
    public void countOPlus(){
        countO++;
    }
}



package tutorials.codingbat;

public class EndOther {
    
public static void main(String[] args){
    System.out.println(endOther("AbC", "HiaBc"));
}        
    
public static boolean endOther(String a, String b) {
int aLength = a.length();
int bLength = b.length();
String aL = a.toLowerCase();
String bL = b.toLowerCase();
if(bLength > aLength){
   System.out.println( (bL.substring(bLength-aLength,bLength)));
return (aL.equals(bL.substring(bLength-aLength,bLength)));
}
else{
    System.out.println(aL.substring(aLength-bLength,aLength));
return (bL.equals(aL.substring(aLength-bLength,aLength)));
}


}

}
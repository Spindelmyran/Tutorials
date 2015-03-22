package tutorials.aiLearning;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Tony Andersson <mailto:Tony.andersson@so4it.com/>
 * @since 0.0.11
 */


class Memory{
    ArrayList greeting = new ArrayList(5);
    public Object getGreeting(int i) {
        return greeting.get(i);
    }

    public void setGreeting(int i,String s) {
//        this.greeting[i] = s;
        greeting.add(i,s);
    }

    public ArrayList getArray(){
        return greeting;
    }

    public boolean contain(String x){
       return greeting.contains(x);
    }


}
public class Main {
    public static void main(String[] args) {
        Memory m1 = new Memory();
        //  prompt the user to enter their name
        System.out.print("Skriv ett värde: ");

        //  open up standard input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String userName = null;

        //  read the username from the command-line; need to use try/catch with the
        //  readLine() method
        try {
            userName = br.readLine();
        } catch (IOException ioe) {
            System.out.println("IO error trying to read your name!");
            System.exit(1);
        }


        try {
            BufferedWriter out = new BufferedWriter(new FileWriter("/home/tony/projects/Tutorials/tutorials/src/example.txt"));
            for (int i = 0; i < 3; i++) {
                out.write(              userName + "\n");
            }
            out.write(userName);
            out.close();
        } catch (IOException e) {}

        String fileName = "/home/tony/projects/Tutorials/tutorials/src/example.txt";
        File textFile = new File(fileName);
        Scanner in = null;
        try {
            in = new Scanner(textFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        in.nextLine();
        int count = 0;
        while(in.hasNextLine()) {
            String line = in.nextLine();
            System.out.println(count + ": " + line);

            System.out.println("------->"+line.toString());
            if(line.toString().equals("nox")) {
                m1.setGreeting(count, line.toString());
            }
            count++;
        }
        in.close();

//        m1.setGreeting(1,"nolla");
//        System.out.println(m1.getGreeting(0));
        System.out.println(m1.contain(""));
        System.out.println("---------------------------------------------------------");
        for (Object k : m1.getArray()) {

            System.out.println(k);
            System.out.println("---------------");
        }
    }
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package social.studies;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Andrew
 */
public class A11 {
        public static void main(String[] args) {
            System.out.println("COnflict and change = 1 ");
            System.out.println("Enter what thing you want : ");
           try{
	    BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
	    String st = bufferRead.readLine();
 
            if(st.matches("1")) {
                 A1.main(args);
                 
            A1v = true;
        }
	}
	catch(IOException e)
	{
		e.printStackTrace();
	}
        }
}

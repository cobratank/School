/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package social.studies;

import java.io.*;

/**
 *
 * @author Andrew
 */
public class SocialStudies {

    public static boolean A1v = false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("SS Interactive loaded");
        
        if(5 + 5 == 10) {
            System.out.println("Math test is good");
        }
      
        System.out.println("Enter something here : ");
       
 
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
        // TODO code application logic here
    

package task12;

import java.util.ArrayList;
import java.util.List;

public class Ques4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> arrayobj = new ArrayList<String>();

		arrayobj.add("Hi");
		arrayobj.add("Welcome to Guvi");
		arrayobj.add("Thank You");


		String conArray[] = arrayobj.toArray(new String[0]);


		for (String i : conArray) {

			System.out.println(i);

		}

	}

}

/*  Output
Hi
Welcome to Guvi
Thank You   
 */


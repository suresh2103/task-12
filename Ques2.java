package task12;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Object>listobj = new ArrayList<Object>();
		
		listobj.add("First");
		listobj.add("Second");
		listobj.add("Third");
		listobj.add("Fourth");
		listobj.add("Fifth");
		listobj.add("Sixth");
		listobj.add("Seventh");
		listobj.add("Eight");
		listobj.add(1234);
		listobj.add(true);
		
		listobj.remove(9);
		listobj.remove(8);
		//System.out.println(listobj.size());
		
		Iterator<Object> i = listobj.iterator();

		while (i.hasNext()) {

			System.out.println(i.next());
		}
		

		System.out.println("using Get Command : " + listobj.get(1));

		

		listobj.clear();

		System.out.println("using Clear Command :" + listobj);

		
		

	}

}


/* output
 * 
 * 
First
Second
Third
Fourth
Fifth
Sixth
Seventh
Eight
using Get Command : Second
using Clear Command :[]       */



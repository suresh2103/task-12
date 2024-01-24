package task12;

import java.util.Map;
import java.util.TreeMap;

public class Ques3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String> employee = new TreeMap<Integer, String>();
		
		employee.put(005, "Vijay");
		employee.put(001, "Arul");
		employee.put(003, "Siva");
		employee.put(002, "Deepan");
		employee.put(004, "Suresh");


		for (Map.Entry<Integer, String> details : employee.entrySet()) {

			System.out.println(details);

		}
		
		
	}
}


/*   Output


1=Arul
2=Deepan
3=Siva
4=Suresh
5=Vijay   */
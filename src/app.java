import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//Coding Steps:
		
	//Step 1.
		
		List<String> employeeNames = new ArrayList<String>();
	
	//Step 2.
		
		Set<Integer> ids = new HashSet<Integer>();
		
	//Step 3.
		
		Map<Integer, String> employeeMap = new HashMap<Integer, String>();
		
	//Step 4. 
		
		employeeNames.add("Shawn");
		employeeNames.add("Greg");
		employeeNames.add("Kara");
		employeeNames.add("Marissa");
		employeeNames.add("Erin");
		
		ids.add(55);
		ids.add(77);
		ids.add(99);
		ids.add(66);
		ids.add(22);
		
	//Step 5.
		
		int i = 0;
		for (int id : ids) {
			employeeMap.put(id, employeeNames.get(i));
			i++;
		}
		
	//Step 6.
	
		Set<Integer> keys = new HashSet<>();
		keys.addAll(employeeMap.keySet());
		for(int key : keys) {
			
		//extracting values based on the key
			String empName = employeeMap.get(key);
			System.out.println("key: " + key + " Employee Name: " + empName );
		}
		
	//Step 7.
		
		StringBuilder idsBuilder = new StringBuilder();
		
	//Step 8,
		
		for(int id : ids) {
			idsBuilder.append(id + "-");
		}
		
	//Step 9.

		System.out.println(idsBuilder.toString());
		
	//Step 10.
		
		StringBuilder namesBuilder = new StringBuilder();
		
	//Step 11.
		
		for(String employeeName : employeeNames) {
			namesBuilder.append(employeeName + " ");
		}
	//Step 12.
		System.out.println(namesBuilder.toString());
		
	}

}

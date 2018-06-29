
import java.util.*;

class Compare_set{

	public static void main(String args[]){

		HashSet<String> Set1 = new HashSet<String>();

		HashSet<String> Set2 = new HashSet<String>();

		Set1.add("behgal");

		Set1.add("sandhu");

		Set1.add("kler");

		Set1.add("sharma");

		System.out.println("Set1 are"+Set1);

		Set2.add("behgal");

		Set2.add("sandhu");

		Set2.add("kumar");

		Set2.add("rajput");

		System.out.println("Set2 are"+ Set2);

		HashSet<String> Set3 = new HashSet<String>();

		Set1.retainAll(Set2);

		System.out.println(Set1);

	}

} 
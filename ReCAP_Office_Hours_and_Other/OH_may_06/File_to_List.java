package OH_may_06;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
public class File_to_List {
	public static void main(String[] args) throws FileNotFoundException {
		//create file object
		File file = new File ("products.txt");
		//open file using scanner
		Scanner scan = new Scanner (file);
		//System.out.println(scan.nextLine());
		//hasNextLine will be true there is line of data
		//it will say true if there is next line.
		System.out.println(scan.hasNextLine());
		ArrayList<String> data = new ArrayList<>();
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			System.out.println(line);
			data.add(line);
		}
		System.out.println("Number of products: "+ data.size());
		System.out.println(data.toString());
}}
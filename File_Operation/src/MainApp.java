import java.io.File;
import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = null;
		
		try{
			sc = new Scanner(new File("File1.lst"));
			while(sc.hasNext()){
				System.out.println(sc.next());
			}
		   }
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Citation
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		
		System.out.println("Enter the author's name as 'Last name, First name': ");
		StringTokenizer st = new StringTokenizer(br.readLine());
		String lastNameAndComma = st.nextToken();
		String firstName = st.nextToken();
		
	    System.out.println("Enter the title of the book: ");
	    st = new StringTokenizer(br.readLine());
	    ArrayList<String> bookTitleWords = new ArrayList<>();
	    while (st.hasMoreTokens()) {
	        bookTitleWords.add(st.nextToken());
	    }
	    
	    System.out.println("Enter the publisher of the book: ");
	    st = new StringTokenizer(br.readLine());
	    ArrayList<String> publishers = new ArrayList<>();
	    while (st.hasMoreTokens()) {
	        publishers.add(st.nextToken());
	    }
	    
	    System.out.println("Enter the year the book was published: ");
	    st = new StringTokenizer(br.readLine());
	    String publicationYear = st.nextToken();
	    
	    System.out.print(lastNameAndComma + " " + firstName + ". " );
	    for (int i = 0; i < bookTitleWords.size(); i++) {
	        if (i == bookTitleWords.size() - 1) {
	            System.out.print(bookTitleWords.get(i) + ". \n");
	        }
	        else {
	            System.out.print(bookTitleWords.get(i) + " ");
	        }
	    }
	    for (int i = 0; i < publishers.size(); i++) {
	        if (i == publishers.size() - 1) {
	            System.out.print(publishers.get(i));
	        }
	        else {
	            System.out.print(publishers.get(i) + " ");
	        }
	    }
	    System.out.print(", " + publicationYear + ".");
    }
}
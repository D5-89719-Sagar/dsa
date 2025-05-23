package Q2;



import java.io.FileReader;
import java.io.IOException;


public class File {
	public static void main(String[] args) throws IOException {
		FileReader f1=new FileReader("file1.txt");
		StringBuilder sb=new StringBuilder();
		int c;
		while((c=f1.read())!=-1) {
			sb.append((char)c);
		}
		UserInput.findoccurrences(sb.toString());
	}
}

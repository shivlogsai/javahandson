import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ReadWriteAppend {
	public static void write() throws IOException {
    File file=new File("C:practiceProject.txt");
    
    //Write
    FileWriter writer=new FileWriter(file);
    writer.write("This is my first line....");
    writer.close();
    
    if(file.createNewFile()) {
		System.out.println("File is Created");
	 }
	else {
		System.out.println("File  is already Exist");
	 }
	}
	
    //Read
	public static void read()throws IOException{
    FileReader reader=new FileReader("C:practiceProject.txt");
    int data;
     while((data=reader.read())!=-1) {
    	System.out.print((char) data);
     }
	}
	
	//Append
    public static void append() throws IOException{
    	Path path=Paths.get("C:practiceProject.txt");
    	System.out.println("\n");
    	String appendString="I am appending this line, This is my second line";
    	byte input[]=appendString.getBytes();
    	
    	Files.write(path, input, StandardOpenOption.CREATE,StandardOpenOption.APPEND);
    	System.out.println("Date written successfully");
    	read();
    }
    
	public static void main(String[] args) {
		try{
			 write();
			 read();
			 append();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}

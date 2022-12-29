import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 
public class Exam {

	public static void main(String[] args) throws IOException{
		Scanner a= new Scanner(System.in);
		try {
			for(int i=0; i<= 20; i++) {
		//Create Document instance.
		Document document = new Document();
	 
		//Create OutputStream instance.
		FileOutputStream outputStream = new FileOutputStream(new File("test1" + i + ".pdf"));
	 
		//Create PDFWriter instance.
	        PdfWriter.getInstance(document, outputStream);
	 
	        //Open the document.
	        document.open();
	 
	        //Add content to the document.
	        document.add(new Paragraph(" Welcome,This is Majid Page "));
	     
	        //Close document and outputStream.
	        document.close();
			}
	 
	        System.out.println("Pdf created successfully.");
	    } catch (Exception e) {
		e.printStackTrace();
	    }
		
		System.out.println("java");
		String q= a.next();
		System.out.println("javaScript");
		String qq= a.next();
		System.out.println("HTML");
		String qqq= a.next();
		
		
		
}
	}
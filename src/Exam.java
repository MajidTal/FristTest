import java.io.File;
import java.io.FileOutputStream;

import java.io.IOException;
import java.util.Scanner;

import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;

public class Exam {

	public static void main(String[] args) throws IOException {
		Scanner a = new Scanner(System.in);
		try {
			for (int i = 0; i <= 100; i++) {
				// Create Document instance.
				Document document = new Document();

				// Create OutputStream instance.
				FileOutputStream outputStream = new FileOutputStream(new File("test" + i + ".pdf"));

				// Create PDFWriter instance.
				PdfWriter.getInstance(document, outputStream);

				// Open the document.
				document.open();

				// Add content to the document.
				if (i <= 20) {
					document.add(new Paragraph(" Welcome,This is Majid Page "));

				}
				else if (i <=30)
				{
					document.add(new Paragraph(" Hi,This is my second Page   "));
					
				} 
				else if (i <= 50) 
				{
					document.add(new Paragraph(" Helow,This is the third Page "));
				} 
				else

					document.add(new Paragraph(" Hi there,This is the forth Page "));

				document.close();
				outputStream.close();

			}

			System.out.println("Pdf created successfully.");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String path = "C:\\Users\\Lenovo\\eclipse-workspace\\FristExam";
			System.out.println("search the word");
			String searchWord =a.next();
			File pt1 = new File(path);
			File[] pdfFiles = pt1.listFiles((d,name) -> name.endsWith(".pdf"));
			
			for(File pdfFile : pdfFiles)
			try {
				PdfReader reader = new PdfReader (pdfFile.getAbsolutePath());
				int numPages = reader.getNumberOfPages();
			boolean found = false;
			for(int i =1; i<=numPages; i++ )
			{
				String pageText = PdfTextExtractor.getTextFromPage(reader, i);
				if(pageText.toLowerCase().contains(searchWord.toLowerCase())) {
					found = true;
					break;
				}
				}
			
			    if(found)
			    {
			    	System.out.println(" Found " + searchWord + " in " + pdfFile.getName());
			    	}
			    }
				catch (Exception e)
			{
					e.printStackTrace();
			}
		}
}
		
		
		





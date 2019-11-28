package fileIOStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteFileDemo {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		File file;
		
		String myContent = "Gutiri kindu kiumaga hega!";
		try 
		{
		     File newFile = new File("C:/Users/Macharia-Kuria/Documents/myOutputFile.txt");
		     /*If file gets created then the createNewFile() 
		      * method would return true or if the file is 
		      * already present it would return false
		      */
	             boolean fvar = newFile.createNewFile();
		     if (fvar){
		          System.out.println("File has been created successfully");
		     }
		     else{
		          System.out.println("File already present at the specified location");
		     }
			//Specify file path here
			file = new File("C:/Users/Macharia-Kuria/Documents/myOutputFile.txt");
			fos = new FileOutputStream(file);
	          /* This logic will check whether the file
			   * exists or not. If the file is not found
			   * at the specified location it would create
			   * a new file*/
			if(!file.exists()) {
				file.createNewFile();
			}
			
			  /*String content cannot be directly written into
			   * a file. It needs to be converted into bytes*/
			
			byte[] bytesArray = myContent.getBytes();
			
			fos.write(bytesArray);
			fos.flush();
			System.out.println("File Written Successfully!");
		}
		catch(IOException ioe)
		{
			ioe.printStackTrace();
		}
		finally {
			
			try {
				if(fos != null) {
					fos.close();
				}
			}catch(IOException ioe) {
				System.out.println("Error occured while closing the stream!");
			}
			
		}
	}

}

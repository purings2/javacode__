package pkg15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileSave {
	public static void main(String[] args) {
		
		String pathname = "c:\\windows" ;
		File target = new File(pathname);
		
		FileWriter fw1 = null;
		BufferedWriter bw1 = null ;
		
		FileWriter fw2 = null;
		BufferedWriter bw2 = null ;
		
		File[] filelists = target.listFiles();
		
		String filename1 = "c:\\imsi2\\file.txt";
		String filename2 = "c:\\imsi2\\forder.txt";
				
		
		try {
			fw1 = new FileWriter(filename1);
			bw1 = new BufferedWriter(fw1);
			
			fw2 = new FileWriter(filename2);
			bw2 = new BufferedWriter(fw2);
			
			for (int i = 0; i < filelists.length; i++) {
				if (filelists[i].isFile()) {
					bw1.write(filelists[i].toString());
					bw1.newLine();
				} else {
					bw2.write(filelists[i].toString());
					bw2.newLine();
				}
			}
			
//			System.out.println("작업 완료");
			
			
		} catch (IOException e) {
			
		} catch (Exception e) {
			
		} finally {
			try {
				if(bw1 != null) {bw1.close();}
				if(fw1 != null) {fw1.close();}
				if(bw2 != null) {bw2.close();}
				if(fw2 != null) {fw2.close();}
				
			} catch (Exception e) {
				
			}
		}
	}

}

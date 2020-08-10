package pkg14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OnlyGetId {

	public static void main(String[] args) {
		String pathname = "c:\\imsi2\\myid.txt" ;
		File source = new File(pathname);
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(source);
			br = new BufferedReader(fr);
			
			String imsi = "";
			int count = 0;
			while((imsi = br.readLine()) != null ) {
//				if(imsi.contains("(")) {
					int apos = imsi.indexOf("(") ;
					int bpos = imsi.indexOf(")") ;
					
					if(apos > -1 && bpos > -1) {
						if ((apos+1) < bpos) {
							String id = imsi.substring(apos+1, bpos);
							System.out.println(++count + "번 아이디 : " + id);
						}
						
					}
					
//					String data = imsi.substring(apos+1, bpos) ;
//					System.out.println(count++ + "번 아이디 : " + data);
//				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}				
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
				
	}

}

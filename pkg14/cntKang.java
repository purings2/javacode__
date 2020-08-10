package pkg14;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class cntKang {

	public static void main(String[] args) {
		String pathname = "c:\\imsi2\\news.txt" ;
		File source = new File(pathname);
		
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(source);
			br = new BufferedReader(fr);
			
			String imsi = "";
			int cntline = 0; //전체라인수
			int cntkang = 0; //강호동 카운터 횟수
			while((imsi = br.readLine()) != null ) {
				++cntline ;
				if(imsi.indexOf("강호동") > -1) {
					++cntkang;
				}
			}
			String ggu = "";
			ggu += "news.txt 파일의 전체 라인 수 : [ " + cntline + " ]" + "\n" ;
			ggu += "강호동은 총 [ " + cntkang + " ]번 나옵니다." ;
			System.out.println(ggu);
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

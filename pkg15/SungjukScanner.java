package pkg15;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class SungjukScanner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String pattern = "###.0";
		DecimalFormat df = new DecimalFormat(pattern);

		FileWriter fw = null;
		BufferedWriter bw = null;

		try {
			fw = new FileWriter(new File("c:\\imsi2\\student.txt"));
			bw = new BufferedWriter(fw);

			for (int i = 0; i < 2; i++) {
				System.out.println("이름 입력 : ");
				String name = scan.next();

				System.out.println("국어 점수 : ");
				int kor = scan.nextInt();

				System.out.println("영어 점수 : ");
				int eng = scan.nextInt();

				System.out.println("수학 점수 : ");
				int math = scan.nextInt();

				double total = kor + eng + math;
				double average = total / 3.0;

				String imsi = "";
				imsi += name + ", ";
				imsi += kor + ", ";
				imsi += eng + ", ";
				imsi += math + ", ";
				imsi += df.format(total) + ", ";
				imsi += df.format(average);

				bw.write(imsi);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (bw != null) {
					bw.close();
				}
				if (fw != null) {
					fw.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		if (scan != null) {
			scan.close();
		}

	}

}

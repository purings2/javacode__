package pkg15;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class GetFileInfo {
	public static void main(String[] args) {
		String pathname = "c:\\mytest\\";
		File target = new File(pathname);
		boolean bool = false;

		if (target.exists() == true) {
//			System.out.println("존재합니다.");
			if (target.isDirectory()) {
//				System.out.println("폴더");
				
//				새로운 파일 만들기
				File newFile = new File("c:\\mytest\\cc.txt");
				try {
					bool = newFile.createNewFile();
					if ( bool ) {
						System.out.println("파일 생성 완료");
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				} 
				

				File[] mylists = target.listFiles();
				System.out.println("목록 출력하기");
				for (int i = 0; i < mylists.length; i++) {
//					System.out.println(mylists[i]);
					if (mylists[i].isFile()) {
						System.out.println("파일 : " + mylists[i].getName());

						if (mylists[i].getName().toLowerCase().equals("a.txt")) {
							System.out.println("파일 a.txt 정보 출력");
							System.out.println("절대 경로 : " + mylists[i].getAbsolutePath());
							System.out.println("숨긴 파일인가요? : " + mylists[i].isHidden());
							System.out.println("파일 크기 : " + mylists[i].length());
							System.out.println("마지막 수정 일자 : " + mylists[i].lastModified());

						} else if (mylists[i].getName().toLowerCase().equals("b.txt")) {
							bool = mylists[i].delete();
							if (bool) {
								System.out.println("삭제 성공");
							} else {
								System.out.println("삭제 실패");
							}
						}

					} else {
						System.out.println("폴더 : " + mylists[i].getName());
						
						//folder1 폴더의 이름을 temp로 변경하기
						if (mylists[i].getName().toLowerCase().equals("folder1")) {
							bool = mylists[i].renameTo(new File("c:\\mytest\\temp"));
							if (bool) {
								System.out.println("폴더 이름 변경");
							}
						}
						
						
					}
				}
			} else {
				System.out.println("파일");
			}
		} else {
			System.out.println("존재하지 않는 항목입니다.");
		}

	}

}

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
//			System.out.println("�����մϴ�.");
			if (target.isDirectory()) {
//				System.out.println("����");
				
//				���ο� ���� �����
				File newFile = new File("c:\\mytest\\cc.txt");
				try {
					bool = newFile.createNewFile();
					if ( bool ) {
						System.out.println("���� ���� �Ϸ�");
					}
				} catch (IOException e) {
					e.printStackTrace();
				} catch (Exception e) {
					e.printStackTrace();
				} 
				

				File[] mylists = target.listFiles();
				System.out.println("��� ����ϱ�");
				for (int i = 0; i < mylists.length; i++) {
//					System.out.println(mylists[i]);
					if (mylists[i].isFile()) {
						System.out.println("���� : " + mylists[i].getName());

						if (mylists[i].getName().toLowerCase().equals("a.txt")) {
							System.out.println("���� a.txt ���� ���");
							System.out.println("���� ��� : " + mylists[i].getAbsolutePath());
							System.out.println("���� �����ΰ���? : " + mylists[i].isHidden());
							System.out.println("���� ũ�� : " + mylists[i].length());
							System.out.println("������ ���� ���� : " + mylists[i].lastModified());

						} else if (mylists[i].getName().toLowerCase().equals("b.txt")) {
							bool = mylists[i].delete();
							if (bool) {
								System.out.println("���� ����");
							} else {
								System.out.println("���� ����");
							}
						}

					} else {
						System.out.println("���� : " + mylists[i].getName());
						
						//folder1 ������ �̸��� temp�� �����ϱ�
						if (mylists[i].getName().toLowerCase().equals("folder1")) {
							bool = mylists[i].renameTo(new File("c:\\mytest\\temp"));
							if (bool) {
								System.out.println("���� �̸� ����");
							}
						}
						
						
					}
				}
			} else {
				System.out.println("����");
			}
		} else {
			System.out.println("�������� �ʴ� �׸��Դϴ�.");
		}

	}

}

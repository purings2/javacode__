package pkg12;

import java.util.Random;

public class RunnableEx implements Runnable{
	String[] arr = {"ī��", "���", "��ȿ��", "�̹���"};
// 2�� �������� 100���� �迭 ����� ������ ��Ҹ� ����Ѵ�.
// Runnable �������̽��� ��ӹ޾Ƽ� ó���غ���.
	
	
	
	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			try {
				String item = arr[new Random().nextInt(arr.length)];
				System.out.println("�迭 ��� ��� : " + item);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

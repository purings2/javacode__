package pkg07;

public class TvTestMain01 {
	public static void main(String[] args) {
		CaptionTv tv1 = new CaptionTv(); 
		tv1.Display() ; //��� ���
		
		System.out.println();
		
		CaptionTv tv2 = new CaptionTv("����", "ȣȣȣ"); //����, ĸ��
		tv2.setVolume(10) ; //������ 10���� ����
		tv2.volumeDown(2) ; //������ 2���� : 10 - 2 = 8���� �����ȴ�.		
		tv2.volumeUp(5) ; //������ 5�ø� : 8 + 5 = 13 ���� �����ȴ�.
		tv2.Display() ; //��� ���
		
		System.out.println();
		
		CaptionTv tv3 = new CaptionTv("�Ķ�", "������", 8, 7); //����, ĸ��, ����, ä��		
		tv3.volumeDown(4) ; //������ 4���δ�. 			
		tv3.channelUp(2) ; //ä���� +2��Ų��.
		tv3.Display() ; //��� ���		
	}
}

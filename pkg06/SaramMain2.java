package pkg06;

public class SaramMain2 {
	public static void main(String[] args) {
		Saram2[] human ;
		human = new Saram2[2] ;
		
		for (int i = 0; i < human.length; i++) {
			human[i] = new Saram2(); 
		}
		
		human[0].name = "��ö��" ;
		human[0].height = 175.2;
		human[0].weight = 62.3 ;
		human[0].hobby = "�籸";
		human[0].blood = "AB" ;
		
		human[1].name = "�ڿ���";
		human[1].height = 160.2;
		human[1].weight = 50.3 ;
		human[1].hobby = "�߱�";
		human[1].blood = "O" ;
		
		for (int i = 0; i < human.length; i++) {
			human[i].Display();
			System.out.println();
		}		
	}
}
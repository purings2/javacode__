package pkg08;

public class RefCasting {

	public static void main(String[] args) {
		Book java = new Book("ÀÚ¹Ù", 1000, "´õÁ¶Àº") ;
		String str = new String("´ëÇÑ¹Î±¹") ;
		Integer x = new Integer(5) ; //¹Ú½Ì
		
		Display(java);
		Display(str);
		Display(x);
	}

	private static void Display(Object obj) {
		if (obj instanceof Book) {
			System.out.println(((Book) obj).getName());
			
			Book mybook = (Book)obj ;
			System.out.println( mybook.getName() );
			
			System.out.println(mybook.toString());
			
		} else if (obj instanceof Integer) {
			Integer myint = (Integer)obj ;
			System.out.println(myint.toString());
			
			//myint = Á¤¼öÇü °´Ã¼
			int ii = myint; //.intValue() ; //¾ð¹Ú½Ì
			System.out.println(ii + 100);
			
		} else if (obj instanceof String) {
			String mystr = (String)obj ;
			System.out.println(mystr.toString());
			
		} else {
			
		}
		
	}

}

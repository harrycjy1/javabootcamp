package sec02_exam;

public class ReferenceReturnClass {

	public static void main(String[] args) {
		
		Data d = new Data();
		d.x=10;
		
		//참조변수 d를 매개변수로 던진다. 아울러 반환값을 data타입으로 받는다.
		
		Data d2 = ReferenceReturnClass.copy(d);
		System.out.println("d.x = "+d.x);
		System.out.println("d2.x = "+d2.x);
		System.out.println("d주소 = "+d);
		System.out.println("d2주소 = "+d2);
		
	}

	
		public static Data copy(Data d) {
			Data tmp = new Data();
			tmp.x = d.x;
			System.out.println("tmp 주소 = " +tmp);
			return tmp;
		}
}

package sec_verify01;

public class StringBufferExample {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("This");
		
		System.out.println("기존 스트링버퍼 sb 출력 : "+sb.toString());
		System.out.println("스트링버퍼 sb의 해쉬값 출력 : "+sb.hashCode());
		sb.append(" is pencil");
		System.out.println("변형된 스트링버퍼 sb 출력 : "+sb.toString());
		sb.replace(7, 8," my ");
		System.out.println("변형된 스트링버퍼 sb 출력 : "+sb.toString());
		sb.replace(7, 10, " your");
		System.out.println("변형된 스트링버퍼 sb 출력 : "+sb.toString());
		sb.delete(4,20);
		System.out.println("문자열 길이를 설정하여 변형된 스트링버퍼 sb 출력 : "+sb.toString());
		System.out.println("문자열 조작 후 스트링 버퍼의 해쉬 코드 : "+sb.hashCode());
		System.out.println("문자열 조작 후에도 해쉬코드가 변함이 없다 즉, 스트링버퍼는 새로운 인스턴스를 만들지 아니함을 알수 있다.");
	}

}

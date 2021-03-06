package sec01_list.exam01_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx04 {

	public static void main(String[] args) {
		
		final int LIMIT = 10;
		String source = "0123456789abcdefghijklmondifjijgrijgththg";
		int length = source.length();
		
		//크기를 여유있게 잡는다
		List list = new ArrayList(length/LIMIT +10);
		
		for(int i=0; i<length; i+=LIMIT) {
			if(i+LIMIT < length) 
				list.add(source.substring(i, i+LIMIT));
			else
				list.add(source.substring(i));
		}
		
		System.out.println(list);
	}

}

package prob3;

public class Prob3 {

	public static void main(String[] args) {
		String str = "모든 프로그램은 자바 언어로 개발 될 수 있습니다.";

		if( str.contains("자바")){
			System.out.print("자바 문자열이 포함되어 있습니다.\n->");
			String str2 = str.replace("자바", "Java");
			System.out.println( str2 );
		}

		/*
		if( str.contains("자바")){
			System.out.print("자바 문자열이 포함되어 있습니다.\n->");
			StringBuffer buf = new StringBuffer(str);
			buf.replace(9, 11, "Java");
			System.out.println( buf );
		}
		*/
	}
	
}

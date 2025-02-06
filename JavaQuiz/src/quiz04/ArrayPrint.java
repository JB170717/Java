package quiz04;

public class ArrayPrint {
	
	/*
	 * 1.ArrayPrint는 접근제어자를 통해서, 외부에서 객체로 생성할수 없도록 만들어 주세요.
	 * 2.각 메서드에서는 public static을 붙여서 호출해주세요.
	 */
	
	private ArrayPrint() {}
	
	public static String toArray(int[] arr) {
		
		if(arr==null) {
			return "null";
		}
		if(arr.length<=0) {
			return "[]";
		}
		
		String str ="[";
		for(int i=0; i<arr.length;i++) {
			str+=arr[i];
			if(i==arr.length-1) {
				str+="]";
				return str;						
			}
			str+=", ";
		}	
		return str;
	}

	public static String toArray(char[] arr) {
		
		if(arr==null) {
			return "null";
		}
		if(arr.length<=0) {
			return "[]";
		}
		
		String str ="[";
		for(int i=0; i<arr.length;i++) {
			str+=arr[i];
			if(i==arr.length-1) {
				str+="]";
				return str;						
			}
			str+=", ";
		}	
		return str;
	}

	public static String toArray(String[] arr) {
	
	if(arr==null) {
		return "null";
	}
	if(arr.length<=0) {
		return "[]";
	}
	
	String str ="[";
	for(int i=0; i<arr.length;i++) {
		str+=arr[i];
		if(i==arr.length-1) {
			str+="]";
			return str;						
		}
		str+=", ";
	}	
	return str;
}

}

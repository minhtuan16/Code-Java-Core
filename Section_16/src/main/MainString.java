package main;

public class MainString {

	public static void main(String[] args) {
		String s = "Hello Trung Tam Java.";
		String s1 = " I am Java.";
		String s2 = " I am joining JavaCore19";
		
		System.out.println(s + s1 + s2);
		
		System.out.println("-----------");
		
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Hello Trung Tam Java.");
		stringBuilder.append(" I am Java.");
		stringBuilder.append(" I am joining JavaCore19");
		
		String s3 = stringBuilder.toString();
		System.out.println(s3);
		
		System.out.println("---------");
		StringBuffer stringBuffer = new StringBuffer("Hello Trung Tam Java.");
		stringBuffer.append(" I am Java");
		stringBuffer.append(" I am joining JavaCore19");
		System.out.println(stringBuffer.toString());
		
	}
}

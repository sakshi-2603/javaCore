package in.sbp.strings.mainclasses;
import in.sbp.strings.classes.*;
public class MainStringExample {
	public static void main(String[] args) {
		StringExample strObj = new StringExample();
		String name = "Sakshi";
		String name1 = "7876542389";
//		name += " ABC";
//		System.out.println(strObj.getResult(name));
		StringBuilder strBuilder= new StringBuilder();
		strBuilder.append(name);
		strBuilder.append(" raje");
		System.out.println(strObj.getResult(strBuilder.toString()));
		byte[] bytes=strBuilder.toString().getBytes();
		for(byte val:bytes)
			System.out.println(val);
		System.out.println(name.matches("[A-Z][a-z]{1,15}"));
		System.out.println(name1.matches("[6-9][0-9]{9}"));
	}

}
//ctrl+2 L
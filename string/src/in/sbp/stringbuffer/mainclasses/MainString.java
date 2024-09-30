package in.sbp.stringbuffer.mainclasses;

public class MainString {
	public static void main(String[] args) {
		StringBuffer strBuffer = new StringBuffer();
		strBuffer.append("this is solapur city");
		int occurence = strBuffer.lastIndexOf("is");
		System.out.println(occurence);
		strBuffer.insert(7," Great");
		System.out.println(strBuffer.toString());
		strBuffer.delete(7,13);
		System.out.println(strBuffer.toString());
	}

}

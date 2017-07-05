package tt;

import java.io.UnsupportedEncodingException;

public class T {

	public static void main(String[] args) throws UnsupportedEncodingException {
		String myFileName="%CA%B2%C3%B4%B7%BD%B7%A8%BA%C3%D3%C3";
		System.out.println(new String(myFileName.getBytes("gbk")));   
		System.out.println(new String(myFileName.getBytes("utf-8"),"gbk"));
		System.out.println(new String(myFileName.getBytes("iso-8859-1"),"gbk")); 
		System.out.println(new String(myFileName.getBytes("gb2312"), "gbk"));

		System.out.println(new String(myFileName.getBytes("utf-8")));   
		System.out.println(new String(myFileName.getBytes("gbk"),"utf-8"));
		System.out.println(new String(myFileName.getBytes("iso-8859-1"),"utf-8")); 
		System.out.println(new String(myFileName.getBytes("gb2312"), "utf-8"));

		System.out.println(new String(myFileName.getBytes("iso-8859-1")));   
		System.out.println(new String(myFileName.getBytes("gbk"),"iso-8859-1"));
		System.out.println(new String(myFileName.getBytes("utf-8"),"iso-8859-1")); 
		System.out.println(new String(myFileName.getBytes("gb2312"), "iso-8859-1"));

		System.out.println(new String(myFileName.getBytes("gb2312")));   
		System.out.println(new String(myFileName.getBytes("gbk"),"gb2312"));
		System.out.println(new String(myFileName.getBytes("utf-8"),"gb2312")); 
		System.out.println(new String(myFileName.getBytes("iso-8859-1"), "gb2312"));


	}

}

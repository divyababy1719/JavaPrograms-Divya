package InterviewQstns;

public class StringBufferProgram {

	public static void main(String[] args) {
  String s1="abc";
  String s2="xyz";
  StringBuffer s3=new StringBuffer(s1);
  System.out.println(s1==s2);   //false
  System.out.println(s1.equals(s3));//false  same like s1==s2 comparing the reference only
  System.out.println(s1.equals(s2));//false
	}

}

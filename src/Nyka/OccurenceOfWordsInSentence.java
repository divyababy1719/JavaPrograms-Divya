package Nyka;

import java.util.LinkedHashSet;

public class OccurenceOfWordsInSentence {

	public static void main(String[] args) {
   String s="i am from kerala i";
  String  str[]=s.split(" ");
 LinkedHashSet<String> ls=new LinkedHashSet<>();
 for(int i=0;i<str.length;i++)
 {
	ls.add(str[i]);
 }
 for(String word:ls)
 {
	 int count=0;
	 for(int i=0;i<str.length;i++)
	 {
		 if(word.equals(str[i]))
		 {
			 count++;
		 }
	 }
	 if(count>1)
	 System.out.println(word+" "+count);
 }
	}
}

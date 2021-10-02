package tema1;
import java.lang.*;
public class ex2 {
	
	static void Elimina(String x,int l)
	{
		int i=0,j=0;
		StringBuffer a = new StringBuffer(x);
		i=0;
		while(i<l-1)
		{
			j=i+1;
				if(a.charAt(i)==a.charAt(j))
				{
					a.deleteCharAt(j);
					l--;
					i--;
				}
			i++;
		}
		System.out.println(a);
	}
	
	public static void main(String[] args) { 
		int l=0;
		 String Str1 = new String("abba...metttallica");
	      
	      l=Str1.length();
	      Elimina(Str1,l);
	   
	}
}

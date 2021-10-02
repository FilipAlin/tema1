package tema1;

public class ex1 {
	static boolean Speciale(int [] a, int n) {
		int i=0,j=0;
	while(j<n && a[j]==0)
		j++;
	while(j<n)
	{
		if(a[j]==1)
			if(i>1)
				return false;
			else
				i=0;
		else
			i++;
		j++;
	}
	return true;
	}
	public static void main(String[] args) { 
		int [] a= {1,1,0,0,1,0};
		System.out.println(Speciale(a,6));
	}
}

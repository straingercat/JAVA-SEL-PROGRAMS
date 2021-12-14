package practicepro;

public class Max_lenght_in_array {

	public static void main(String[] args) {
		String s[]= {"hi","hello","how","are","you"};
	
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)
			{
				if(s[i].length()>s[j].length())
				{
					String temp=s[i];
					s[i]=s[j];
					s[j]=temp;
				}
			}
		}
		System.out.println(s[0]);
	}

}

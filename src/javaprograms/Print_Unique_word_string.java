package javaprograms;

import java.util.LinkedHashSet;

public class Print_Unique_word_string {

	public static void main(String[] args) {
		String s="welcome to tyss to company company welcome";
		
		//Spiting by space
		String str[]=s.split(" ");
		
		//Create set collection(hash set) and add all the character of the string in to set
				LinkedHashSet<String> set=new LinkedHashSet<String>();
				for(int i=0;i<str.length;i++)
				{
					set.add(str[i]);
				}
				
				//input
				System.out.println(set);
				
				
				//compare each char of the set with all character in the string
				for( String word :set)
					{
				int count=0;
				for(int i=0;i<str.length;i++)
					
					
					//if it is matching increase the count
				{
					if (word==str[i])
					{
						count++;
						
					}
				}
				
				
				//print the both character and the count
				if(count==1) {
					System.out.print(word+" ");
				}
				
				
					
				}
				

			}

		}


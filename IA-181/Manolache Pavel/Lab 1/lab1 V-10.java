import java.util.Scanner;
public class lab1 {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Introdu sirul ");
		String sentence=scanner.nextLine();
		sentence=sentence+" ";
		int l=sentence.length();
		int pos=0,k=0;
		char ch1,ch2;
		String w;
		for(int i=0;i<l;i++)
		{
			ch1=sentence.charAt(i);
			if(ch1==' ')
			{
				w=sentence.substring(pos,i);
				ch2=w.charAt(0);
				if(ch2=='a'||ch2=='e'||ch2=='i'||ch2=='o'||ch2=='u'||
				ch2=='A'||ch2=='E'||ch2=='I'||ch2=='O'||ch2=='U')
				{
					System.out.println(w);
					k++;
				}
				pos=i+1;
			}
		}
		System.out.println("Sunt "+k+" cuvinte care incep si se termina cu o vocala");
		
	}
}

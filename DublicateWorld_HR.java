import java.util.*;
public class DublicateWorld_HR
{
	public static void main(String args[])
	{
		Scanner scan=new Scanner(System.in);
		int no_str=Integer.parseInt(scan.nextLine());
		while(no_str>0){
			String input=scan.nextLine();
			String[] words = input.split("\\s");
			for (int i = 0; i < words.length; i++)
			{
				for (int j = 0; j < words.length; j++)
				{
					if (words[i].equalsIgnoreCase(words[j]))
					{
						if (i != j)
							words[j] = "";
					}
				}
			}
			for (int i = 0; i < words.length; i++)
			{
				if (words[i] != "")
				{
					System.out.print(words[i]+" ");
				}
			}
			no_str--;
			System.out.println();
		}
		scan.close();
	}
}

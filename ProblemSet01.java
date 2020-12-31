import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;
import java.lang.Exception;

public class ProblemSet01
{
	private static String pos_String;
	public static void helloWorld(String fileName)
	{
		String file = "./src/input/"+fileName;
		File f;
		FileReader fr;
		BufferedReader br;
		try
		{
			f = new File(file);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String numOfNames_String = br.readLine();
			int numOfNames = Integer.parseInt(numOfNames_String);
			for(int i = 0; i< numOfNames; i++)
			{
				String name = br.readLine();
				System.out.println("Hello, "+name+".");
			}
			
			
			br.close();
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println("There is an error in your code "+ e.toString());
			e.printStackTrace();
		}
	}

	public static void pokemon(String fileName) 
	{
		String file = "./src/input/"+fileName;
		File f;
		FileReader fr;
		BufferedReader br;
		try
		{
			f = new File(file);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			String pos_String = "";
			int numC = 0; 
			int numB = 0;
			int numS = 0;
			
			String numOfSets_String = br.readLine();
			int numOfSets = Integer.parseInt(numOfSets_String);
			for(int i = 0; i<numOfSets;i++)
			{
				while((numC!= numB || numB!=numS || numB!=numC) && br.ready())
				{
					pos_String = br.readLine();
					pos_String = pos_String.trim();
					if(pos_String.equals("C"))
					{
						numC++;
					}
					if(pos_String.equals("S"))
					{
						numS++;
					}
					if(pos_String.equals("B"))
					{
						numB++;
					}
					pos_String = br.readLine();
					pos_String = pos_String.trim();
					
				}
				System.out.println("Complete set obtained at "+ numS);
			}
			br.close();
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println("There is an error in your code "+ e.toString());
			e.printStackTrace();
		}
		
	}

    public static void triangularNumbers(String fileName)  
    {
    	String file = "./src/input/"+fileName;
		File f;
		FileReader fr;
		BufferedReader br;
		try
		{
			f = new File(file);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String numOfTriangles_String = br.readLine();
			int numOfTriangles = Integer.parseInt(numOfTriangles_String);
			for(int i = 0; i< numOfTriangles; i++)
			{
				String pos_String = br.readLine();
				int pos = Integer.parseInt(pos_String);
				int value = 0;
				for(int j = pos; j>0; j--)
				{
					value +=j;
				}
				System.out.println(pos + " = " + value);
				
			}
			
			
			br.close();
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println("There is an error in your code "+ e.toString());
			e.printStackTrace();
		}
    }

    public static void mario(String fileName) 
    {
    	String file = "./src/input/"+fileName;
		File f;
		FileReader fr;
		BufferedReader br;
		try
		{
			f = new File(file);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String numOfRows_String = br.readLine();
			numOfRows_String = numOfRows_String.trim();
			int numOfRows = Integer.parseInt(numOfRows_String);
			for(int r = 0; r<numOfRows;r++)
			{
				String posString = br.readLine();
				posString = posString.trim();
				int pos = Integer.parseInt(posString);
				for(int i = 0;i<pos;i++)
		        {
		            for (int j = 0;j< pos-i-1;j++)
		            {
		                System.out.print(" ");
		            } 
		            for(int k = 0; k<2+i;k++)
		            {
		                System.out.print("#");
		            }
		            System.out.println();
		        }
			}
	
			br.close();
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println("There is an error in your code "+ e.toString());
			e.printStackTrace();
		}
    }

    public static void fourOneOne(String fileName) 
    {
    	String file = "./src/input/"+fileName;
		File f;
		FileReader fr;
		BufferedReader br;
		try
		{
			f = new File(file);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String numOfLines_String = br.readLine();
			int numOfLines = Integer.parseInt(numOfLines_String);
			for(int i = 0; i< numOfLines; i++)
			{
				String number_String = br.readLine();
				String[] numberStrings = number_String.split(",");
				int even = 0;
				int[] nums = new int[numberStrings.length];
				for(int j = 0; j< nums.length; j++)
				{
					nums[j]= Integer.parseInt(numberStrings[j]);
				}
				for(int k = 0; k<nums.length; k++)
				{
					if(nums[k]%2==0)
					{
						even++;
					}
				}
				String formattedPercentage = String.format("%.2f", ((double)even/nums.length)*100);
				System.out.println(nums.length+" numbers, "+even+" evens ("+formattedPercentage+"%)");
				
				
			}
			
			
			br.close();
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println("There is an error in your code "+ e.toString());
			e.printStackTrace();
		}
    }
    
    public static void urlify(String fileName)
    {
    	String file = "./src/input/"+fileName;
		File f;
		FileReader fr;
		BufferedReader br;
		try
		{
			f = new File(file);
			fr = new FileReader(f);
			br = new BufferedReader(fr);
			
			String numOfLines_String = br.readLine();
			int numOfLines = Integer.parseInt(numOfLines_String);
			for(int i = 0; i< numOfLines; i++)
			{
				String sentence = br.readLine();
				String url = "";
				String trimSentence = sentence.trim();
				String[] splitSentence = trimSentence.split(" ");
				for(int j = 0; j<splitSentence.length-1; j++)
				{
					url+=(splitSentence[j]+"%20");
				}
				url+=splitSentence[splitSentence.length-1];
				System.out.println(url);
				
			}
			
			
			br.close();
			fr.close();
		}
		catch(Exception e)
		{
			System.out.println("There is an error in your code "+ e.toString());
			e.printStackTrace();
		}
    
    }
    public static void main(String[] args)
    {
    	pokemon("pokemonExample.in.txt");
    }
}
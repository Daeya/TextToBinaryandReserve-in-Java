import java.util.Scanner;

 public class textToBinaryandReverse
{
     public static void main(String[] args) 
{

	System.out.println("Enter the string you want printed : ");
         Scanner sc = new Scanner(System.in);
         String s = sc.next();

	byte[] bytes = s.getBytes();
         StringBuilder binary = new StringBuilder();
         for (byte b : bytes){
             int val = b;
             for (int i = 0; i < 8; i++){
                 binary.append((val & 128) == 0 ? 0 : 1);
                 val <<= 1;
        }
             binary.append(' ');
        }
        System.out.println("\n'" + s + "' to binary: " + binary);

	
	String reverse = new String();

	while (s != null) {
	for(int i=s.length()-1; i>=0; i--)
	{
	reverse = reverse + s.charAt(i);
	}
	System.out.println("\n'" + s + "' to reverse: " + reverse);
	break;
	}
		
}}

import java.util.Scanner;
public class ProjectCalculatorScanner {
   public static void main(String[] args) {
		// TcDO Auto-generated method stub
	   Scanner scanner=new Scanner(System.in);  
	   System.out.println("enter buying price");
		int buyingPrice = scanner.nextInt();
        System.out.println("enter selling price");
		int sellingPrice = scanner.nextInt();
		int profit=sellingPrice-buyingPrice;
		System.out.println("profit=" +profit);
		
	}

}

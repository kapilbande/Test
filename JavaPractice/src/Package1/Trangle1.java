package Package1;

public class Trangle1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int TotalRow=9;
		int RowNum= 1;
		
		for(int i=TotalRow; i>0; i--){
			for (int j=1; j<=i;j++){
				System.out.print(" ");
			}
			for (int j=1; j<=RowNum; j++){
				System.out.print("*"+" "); //j, *
			}
			System.out.println("");
			RowNum++;
		}
				
		
	}

	
		
}
		


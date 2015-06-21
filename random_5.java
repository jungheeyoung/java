import java.util.Scanner;
class random_5 
{
	public static void main(String args[]){
	int ho;
		Scanner scan=new Scanner(System.in);
		System.out.print("내가 생각한 수:");
	    int num=scan.nextInt();
		System.out.println("=============");
		System.out.println("1이면 더 큰 것\n2이면 더 작은 것\n3이면 맞춤");
		System.out.println("=============");
		
		   do{
	 		 int ran=(int)(Math.random()*100+1);
	         System.out.println(ran+"이 맞니?");
			 int wow=scan.nextInt();  //1이면 더 큰 것, 2이면 더 작은 것,3이면 맞춤
			 if (wow==1)
			 {
				 System.out.println("더 큽니다. 다시 맞춰보세요");
			 }
			 else if(wow==2){
				 System.out.println("더 작습니다. 다시 맞춰보세요");
			 }
			 else
				 break;
		 }while(true);
		     System.out.println("맞추셨습니다!!");
    }
}

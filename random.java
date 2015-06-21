import java.util.Scanner;
class random 
{
	public static void main(String[] args) 
	{
		Scanner input=new Scanner(System.in);
		int number=(int)(Math.random()*100+1);
		int answer=0;
		
		while(number!=answer)
		{
			System.out.println("숫자를 입력하세요:");
			answer=input.nextInt();
			if(number>answer){
				System.out.println("더 높은 숫자를 입력하세요.");
			}
			else if(number<answer){
				System.out.println("더 낮은 숫자를 입력하세요.");
			}
	}
	System.out.println("맞추셨습니다!");
  }
}
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
			System.out.println("���ڸ� �Է��ϼ���:");
			answer=input.nextInt();
			if(number>answer){
				System.out.println("�� ���� ���ڸ� �Է��ϼ���.");
			}
			else if(number<answer){
				System.out.println("�� ���� ���ڸ� �Է��ϼ���.");
			}
	}
	System.out.println("���߼̽��ϴ�!");
  }
}
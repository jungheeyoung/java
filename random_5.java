import java.util.Scanner;
class random_5 
{
	public static void main(String args[]){
	int ho;
		Scanner scan=new Scanner(System.in);
		System.out.print("���� ������ ��:");
	    int num=scan.nextInt();
		System.out.println("=============");
		System.out.println("1�̸� �� ū ��\n2�̸� �� ���� ��\n3�̸� ����");
		System.out.println("=============");
		
		   do{
	 		 int ran=(int)(Math.random()*100+1);
	         System.out.println(ran+"�� �´�?");
			 int wow=scan.nextInt();  //1�̸� �� ū ��, 2�̸� �� ���� ��,3�̸� ����
			 if (wow==1)
			 {
				 System.out.println("�� Ů�ϴ�. �ٽ� ���纸����");
			 }
			 else if(wow==2){
				 System.out.println("�� �۽��ϴ�. �ٽ� ���纸����");
			 }
			 else
				 break;
		 }while(true);
		     System.out.println("���߼̽��ϴ�!!");
    }
}

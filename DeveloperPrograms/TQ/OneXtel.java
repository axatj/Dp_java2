
public class OneXtel {

	public static void main(String[] args) {
	int num;
	
	for( num=1;num<=20;num++)
	{
		 if(num%3==0 &&  num%5==0)
			{
				System.out.println("OnexTel");
			}
		 else if(num%3==0) 
		{
			System.out.println("OneX");
		}
		else if(num%5==0) {
			System.out.println("Tel");
		}
		else
		{
			System.out.println(num);
		}
		 
	}

	}

}

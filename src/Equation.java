
public class Equation {

	public static void main(String[] args) {//��ʽ
		// TODO Auto-generated method stub
		int a,b,d;
		int i;
		char c;
		for(i=0;i<50;i++)
		{
			a=CreatRandom();
			b=CreatRandom();
			c=CreatRandomCint();
			d=Count(a,b,c);
			System.out.print(a);
			System.out.print(c);
			System.out.print(b);
			System.out.print("=");
			System.out.print(d);
			System.out.println();
		}
	}
	
	
	
	public static int CreatRandom() {//����100���ڵ������
		int a;
		a=(int)(Math.random()*100);
		return a;
	}
	
	public static char CreatRandomCint() {//���������
		int a;
		char b='2';
		a=(int)(Math.random()*2);
		if(a==0) {
			b='+';
		}
		if(a==1) {
			b='-';
		}
		return b;
	}
	
	public static int Count(int a,int b,char c) {//�������ɵ���ʽ
		int d=0;
		if(c=='+')
		{
			d=a+b;
		}
		if(c=='-')
		{
			d=a-b;
		}
		return d;
	}

}
	




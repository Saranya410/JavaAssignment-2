
 abstract class Arthimetic1{
	int num1,num2,num3;

	public Arthimetic1(int num1, int num2) {
		super();
		this.num1 = num1;
		this.num2 = num2;

	}
	abstract int calculate();
	
}

class Add extends Arthimetic1
{

	public Add(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		System.out.println("ADD :");
		num3=num1+num2;
		return num3;
	}
	
}
class Sub extends Arthimetic1
{

	public Sub(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		System.out.println("SUB :");
		num3=num1-num2;
		return num3;
	}
	
}
class Mul extends Arthimetic1
{

	public Mul(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		System.out.println("MUL :");
		num3=num1*num2;
		return num3;
	}
	
}class Div extends Arthimetic1
{

	public Div(int num1, int num2) {
		super(num1, num2);
		// TODO Auto-generated constructor stub
	}

	@Override
	int calculate() {
		// TODO Auto-generated method stub
		System.out.println("DIV :");
		num3=num1/num2;
		return num3;
	}
	
}
public class Arthimetic
{
	public static void main(String[] args)
	{
		int x=10,y=5;
		int choice=1;
		Arthimetic1[] ar= {new Add(x,y),new Sub(x,y), new Mul(x,y),new Div(x,y)};
		ar[choice-1].calculate();
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i].calculate());
		}
	}
}



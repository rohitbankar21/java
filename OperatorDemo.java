class OperatorDemo
{
	public static  void main(String[] args) {
		int a=10;
		int b=25;
		int c=55;

		System.out.println(a>b && c<b);
		System.out.println(c>a || b<c);
		System.out.println((a>b || b<c) && c>b);
		System.out.println(!(a<b));
		System.out.println(!(a<b && b<c));
	}
}

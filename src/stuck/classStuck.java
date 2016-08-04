package stuck;

public class classStuck {
	private int length;
	private int[] stor ;
	classStuck(int n)
	{
		this.length = 0;
		this.stor = new int[n];
	}
	public boolean insert(int n)
	{
		if(this.length == this.stor.length)
		{
			return false;
		}
		this.stor[this.length] = n ;
		this.length ++ ;
		return true;
	}
	public int pop()
	{
		if(this.length == 0)
		{
			System.out.print("Õ»ÒÑÇå¿Õ");
			return 0;
		}
		else
		{
			--this.length;
			return this.stor[this.length];
		}
	}
	public static void main(String args[])
	{
		classStuck cl = new classStuck(10);
		for(int i = 0 ; i < 10 ; i ++)
		{
			cl.insert(i);
		}
		for(int i = 0 ; i < 100 ; i ++)
		{
			System.out.println(cl.pop());
		}
		
		}

	
}

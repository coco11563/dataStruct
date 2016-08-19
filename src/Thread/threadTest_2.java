package Thread;

public class threadTest_2 implements Runnable{
	@Override
	public void run()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("���ǽ���B");
	}
    public static boolean stringPermutation(String A, String B) {
        // Write your code here
    	  if(A.length()  != B.length())
          {
              return false;
          }
    	  int i = 1;
          while(A.length() != 0)
          {
        	 
          if(A.length()  != B.length())
          {
              return false;
          }
              B = B.replace(A.substring(i-1,i),"");
              A = A.replace(A.substring(i-1,i),"");
          }
          if(B.length() == 0 )
          {
              return true;
          }
          else return false;
    }

	public static void main(String args[])
	{
		String s ="^&*#$@%@%@$%@$!*&*&*)))!)()())( **jsafhjhsajfhthisisa lint";
		String b = "^&)!)(%))thijhsajfhs)())( **jsafh*#$@%@$!*&*&sa lint*@%@$i";
		if(stringPermutation(s,b))
			System.out.println(1);
		else
			System.out.println(0);
		System.exit(0);
		threadTest_2 b1 = new threadTest_2();
		new Thread(b1).start();
		System.out.println("�������̣߳�");
	}

}


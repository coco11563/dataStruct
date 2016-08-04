package minTree;

public class smallHeap {
	final static int MAX_LEN = 100;
	private int queue[] = new int[MAX_LEN];
	private int size = 0 ;
	public void add(int e)
	{
		if(size >= MAX_LEN)
		{
			System.out.println("queue overflow");
			return ;
		}
		int s = size++;
		shiftUp(s,e);
	}
	private void shiftUp(int s, int e) {
		// TODO Auto-generated method stub
		while(s>0)
		{
			int parent = (s - 1) / 2;//����β�˺����ĸ��ڵ��ֵ
			if(queue[parent] <e)
			{
				break;
			}
			queue[s] = queue[parent];//�����ڵ��ƶ����ýڵ�λ��
			s = parent;
		}
		queue[s] = e;//���ýڵ��ƶ������ڵ�λ��
	}
	public int size()
	{
		return size;//���������С�Ѱ�����Ԫ��ֵ
	}
	public int poll()
	{
		if(size <= 0 )//�������ѵĴ�СΪ0���߸�С���򷵻�-1
		{
			return -1;
		}
		int ret = queue[0];//������ֵ����ret
		int s = --size; //��õ�ǰ����β�ڵ㣬�����ڳ������������size--
		shiftDown(0,queue[s]);//�����β�ڵ���뵽��ͷ��
		queue[s] = 0;//�Ƴ�����ڵ�
		return ret;
	}
	public void shiftDown(int s , int q)
	{
		
		while(s < size)
		{
			int right = 2 * s + 2;
			int left = 2 * s + 1;
			if(right < size && queue[left] >queue[right]) //��left��right��ѡ���С��
			{
				left = right;
			}
			if(q < queue[left])//���ӽڵ�Ĵ�С���ȸ��ڵ�С��������ڵ������С���ˣ�ֱ��break
			{
				break;
			}
			queue[s] = queue[left];//����С���ӽڵ��Ƶ������λ��
			s = left;//������ڵ��Ƶ���С���ӽڵ��λ��
		}
		queue[s] = q;//�ҵ����յ�λ�ã���q�������Ǹ�λ��
		
	}
}

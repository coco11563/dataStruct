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
			int parent = (s - 1) / 2;//插入尾端后它的父节点的值
			if(queue[parent] <e)
			{
				break;
			}
			queue[s] = queue[parent];//将父节点移动到该节点位置
			s = parent;
		}
		queue[s] = e;//将该节点移动到父节点位置
	}
	public int size()
	{
		return size;//返回这个最小堆包含的元素值
	}
	public int poll()
	{
		if(size <= 0 )//如果这个堆的大小为0或者更小，则返回-1
		{
			return -1;
		}
		int ret = queue[0];//将返回值赋给ret
		int s = --size; //获得当前的最尾节点，并且在程序运行完后令size--
		shiftDown(0,queue[s]);//将这个尾节点插入到最头上
		queue[s] = 0;//移除这个节点
		return ret;
	}
	public void shiftDown(int s , int q)
	{
		
		while(s < size)
		{
			int right = 2 * s + 2;
			int left = 2 * s + 1;
			if(right < size && queue[left] >queue[right]) //从left和right中选择更小的
			{
				left = right;
			}
			if(q < queue[left])//若子节点的大小都比父节点小，则这个节点就是最小的了，直接break
			{
				break;
			}
			queue[s] = queue[left];//将较小的子节点移到插入的位置
			s = left;//将这个节点移到较小的子节点的位置
		}
		queue[s] = q;//找到最终的位置，将q放置在那个位置
		
	}
}

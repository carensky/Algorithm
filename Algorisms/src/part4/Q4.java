package part4;

public class Q4 {

	public class EmptyIntAryQueueException extends RuntimeException 
	{
		public EmptyIntAryQueueException() {}
	}

	// 실행할 때 예외：큐가 가득 참
	public class OverflowIntAryQueueException extends RuntimeException 
	{
		public OverflowIntAryQueueException() {}
	}

	private int max; // 큐의 용량
	private int num; // 현재의 데이터 수
	private int[] que; // 큐의 본체

	// 생성자
	public Q4(int capacity)
	{
	      num = 0;
	      max = capacity;
	      try 
	      {
	         que = new int[max];         // 큐 본체용 배열을 생성
		  } 
	      catch (OutOfMemoryError e) 
	      { 
	    	  max = 0;
		  }
	}
	
	// 인큐
	public int enque(int x) throws OverflowIntAryQueueException 
	{
		if (num >= max)
		{
			throw new OverflowIntAryQueueException(); // 큐가 가득 참
		}
			que[num++] = x; // 스택의 PUSH와 같이 데이터를 입력
			return x;
		}

	// 디큐
	public int deque() throws EmptyIntAryQueueException 
	{
		if (num <= 0)
		{
			throw new EmptyIntAryQueueException(); // 큐가 비어 있음
		}
		int x = que[0];
		for (int i = 0; i < num - 1; i++)
		{
			que[i] = que[i + 1]; // 한칸씩 위로 배치
		}
			num--;
			return x;
		}

		// 피크
		public int peek() throws EmptyIntAryQueueException 
		{
			if (num <= 0)
			{
				throw new EmptyIntAryQueueException(); // 큐가 비어 있음
			}
			return que[num - 1]; // 가장 위에있는(가장 먼저 인큐된 데이터 출력)
		}

		// INDEX
		public int indexOf(int x) 
		{
			for (int i = 0; i < num; i++)
			{
				if (que[i] == x) // 검색성공
				{
					return i;
					
				}
			}
			return -1; // 검색실패
		}

		// 큐를 비움
		public void clear() 
		{
			num = 0;
		}

		// 큐의 용량을 반환
		public int capacity() 
		{
			return max;
		}

		// 큐에 쌓인 데이터 수를 반환
		public int size() 
		{
			return num;
		}

		// 큐가 비어 있는가?
		public boolean isEmpty() 
		{
			return num <= 0;
		}

		// 큐가 가득 찼는가?
		public boolean isFull() 
		{
			return num >= max;
		}

		// 큐 안의 데이터를 머리→꼬리의 차례로 출력함
		public void dump() 
		{
			if (num <= 0)
			{
				System.out.println("큐가 비었습니다.");
			}
			else 
			{
				for (int i = 0; i < num; i++)
				{
					System.out.print(que[i] + " ");
				}
				System.out.println();
			}
		}
}

package lambda;

import com.smartlab.test.Command;
import com.smartlab.test.ProcessArray;

public class CommandTest {
	
	public static void main(String[] args)
	{
		ProcessArray pa = new ProcessArray();
		int[] target = {3 , -4 , 6 , 4};
		pa.process(target, new Command() {
			
			@Override
			public void process(int[] target) {
				// TODO Auto-generated method stub
				int sum = 0;
				for(int tmp : target)
				{
					sum += tmp;
				}
				System.out.println("数组元素的总和是：" + sum);
			}
		});
	}

}

package threa_synchronization;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class BlockingQueueTest {

	public static void main(String[] args) throws Exception {

		BlockingQueue<String> bq = new ArrayBlockingQueue<>(2);
		bq.put("java");
		bq.put("java");
		bq.put("java");

	}

}

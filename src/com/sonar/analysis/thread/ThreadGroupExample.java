package com.sonar.analysis.thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class ThreadGroupExample {

	public static void main(String[] args) {
		ThreadFactory threadFactory = Executors.defaultThreadFactory();
		ThreadPoolExecutor executorPool = new ThreadPoolExecutor(3, 10, 5, TimeUnit.SECONDS,
				new ArrayBlockingQueue<>(2), threadFactory);

		for (int i = 0; i < 10; i++) {
			executorPool.execute(new JobThread("Job" + i));
		}

		System.out.println(executorPool.getActiveCount());
		executorPool.shutdown();

	}

}

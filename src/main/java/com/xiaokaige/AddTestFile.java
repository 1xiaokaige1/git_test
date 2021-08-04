package com.xiaokaige;

import java.util.concurrent.*;

/**
 * @author zengkai
 * @date 2021/7/23 11:36
 */
public class AddTestFile {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadPoolExecutor threadPool = new ThreadPoolExecutor(5, 10, 20, TimeUnit.SECONDS, new LinkedBlockingQueue<>()
                , new MyThreadFactory());

        Future<?> future = threadPool.submit((Callable<Object>) () -> {
            System.out.println("one");
            return "one";
        });
        Object o = future.get();
        System.out.println(o);

        ThreadPoolExecutor cachedThreadPool = (ThreadPoolExecutor) Executors.newCachedThreadPool();
        cachedThreadPool.setRejectedExecutionHandler(new RejectedExecutionHandler() {
            @Override
            public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {

            }
        });


    }

    public Integer quickFind() {
        return Integer.MAX_VALUE;
    }

    public void test01() {
        String param = "ac";
    }

    public void test02() {

    }
}

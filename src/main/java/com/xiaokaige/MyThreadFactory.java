package com.xiaokaige;

import java.util.concurrent.ThreadFactory;

/**
 * @author zengkai
 * @date 2021/8/4 11:01
 */
public class MyThreadFactory implements ThreadFactory {
    @Override
    public Thread newThread(Runnable r) {
        System.out.println("初始化一个线程");
        return new Thread(r);
    }
}

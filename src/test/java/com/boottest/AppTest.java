package com.boottest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Unit test for simple App.
 */
@SpringBootTest(classes = App.class)
@RunWith(SpringRunner.class)
public class AppTest {
    /**
     * Rigorous Test :-)
     */


//    @Autowired
//    TestService service;
//
//    @Autowired
//    TestDao testDao;
    @Test
    public void shouldAnswerWithTrue() {

//        ThreadPoolExecutor executorService = new ThreadPoolExecutor(0, Integer.MAX_VALUE,
//                60L, TimeUnit.SECONDS,
//                new SynchronousQueue<Runnable>(), new ThreadFactory() {
//            @Override
//            public Thread newThread(Runnable r) {
//                Thread t = new Thread(r);
//                t.setName("my_t");
//                System.out.println(t.getName());
//                return t;
//            }
//        });
//
//        executorService.prestartAllCoreThreads();
//        executorService.submit(new Runnable() {
//            @Override
//            public void run() {
//                while (true) {
//                    System.out.println("分线程---------");
//                    try {
//                        Thread.sleep(678);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//
//                }
//
//            }
//        });
//
//        while (true) {
//            System.out.println("主线程--------");
//            try {
//
//                Thread.sleep(789);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//
//        }

//        executorService.shutdown();
//        executorService.shutdownNow();





    }
}

package dataStructrue.ProducerAndConsumer;

import java.io.IOException;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by ZhangJing on 2017/5/9.
 *
 *
 * 利用Condition的await和signalAll
 */
public class AwaitAndSignal {

        public static void main(String[] args) throws IOException
        {
            Person2 person = new Person2();
            new Thread(new Consumer2(person), "消费者一").start();
            new Thread(new Consumer2(person), "消费者二").start();
            new Thread(new Consumer2(person), "消费者三").start();

            new Thread(new Producer2(person), "生产者一").start();
            new Thread(new Producer2(person), "生产者一").start();
            new Thread(new Producer2(person), "生产者一").start();
        }
    }

    class Producer2 implements Runnable
    {
        private Person2 person;

        public Producer2(Person2 person)
        {
            this.person = person;
        }

        @Override
        public void run()
        {

            for (int i = 0; i < 10; i++)
            {
                person.produce();
            }

        }

    }

    class Consumer2 implements Runnable
    {

        private Person2 person;

        public Consumer2(Person2 person)
        {
            this.person = person;
        }

        @Override
        public void run()
        {

            for (int i = 0; i < 10; i++)
            {
                    person.consume();

            }

        }

    }

    class Person2{
        private int foodNum = 0;

        private ReentrantLock lock = new ReentrantLock();

        private Condition condition = lock.newCondition();

        private final int MAX_NUM = 5;

        public void produce()
        {
            lock.lock();
            try
            {
                while (foodNum == MAX_NUM)
                {
                    System.out.println("box is full，size = " + foodNum);
                    condition.await();
                }
                foodNum++;
                System.out.println("produce success foodNum = " + foodNum);
                condition.signalAll();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            } finally
            {
                lock.unlock();
            }

        }

        public void consume()
        {
            lock.lock();
            try
            {
                while (foodNum == 0)
                {
                    System.out.println("box is empty,size = " + foodNum);
                    condition.await();
                }
                foodNum--;
                System.out.println("consume success foodNum = " + foodNum);
                condition.signalAll();
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            } finally
            {
                lock.unlock();
            }

        }
    }

package com.hima.demo;



import java.util.concurrent.*;

public class Threaddemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);
        ExcuteBusiness ebObj = new ExcuteBusiness();

        // Submit a task to the executor
        Future<Object> future = executor.submit(() -> {
            try {
                ebObj.add(5,10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        Future<Object> future1 = executor.submit(() -> {
            try {
                ebObj.add(25,10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        });

        try {
            System.out.println("Task submitted. Waiting for result...");
            // Retrieve the result (blocks until the task is complete)
            Integer result = future.get();
            Integer result1 = future1.get();

            System.out.println("Result: " + result + " Result2: " + result1);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        } finally {
            executor.shutdown();
        }
    }
}


package com.hye.section04.queue;

import java.util.LinkedList;
import java.util.Queue;

public class Practice2 {
    public int solution(int w, int l, Integer[] truckWeight) {

        Queue<Integer> wait = new LinkedList<>();
        Queue<Integer> bridge = new LinkedList<>();

        for(int weight: truckWeight) {
            wait.offer(weight);
        }

        int currentWeight = 0;
        int time = 0;

        while (!wait.isEmpty() || !bridge.isEmpty()) {
            time++;


            if (!bridge.isEmpty()) {
                int truckBridge = bridge.poll();
                currentWeight -= truckBridge;
            }

            if (!wait.isEmpty()) {
                int next = wait.peek();

                if (currentWeight + next <= l && bridge.size() < w) {

                    bridge.offer(wait.poll());
                    currentWeight += next;
                }
            }
        }
        return time;
        }
    }


package chotabhim;

import java.util.Collections;
import java.util.PriorityQueue;

public class chotabhim_priorityqueue {

	public static int cb(int cups[], int size) {
		int time = 60;
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i < size; i++) {
			pq.add(cups[i]);
		}
		int total = 0;
		int count = 0;
		int value;
		while (time > 0) {
			value = pq.remove();
			if (value == 1) {
				return (total + time);
			} else {
				total += value;
				value = (int) Math.ceil(value / 2.0);
				pq.add(value);
				time -= 1;
				count++;
			}
		}
		System.out.println(total);
		return (total + time);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cups[] = { 2, 1, 4, 7, 2 };
		System.out.println(cb(cups, cups.length));

	}
}

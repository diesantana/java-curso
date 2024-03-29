package model.service;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {
	private List<T> list = new ArrayList<>();
	
	public PrintService() {
	}

	public List<T> getList() {
		return list;
	}

	public void addValue(T value) {
		list.add(value);
	}
	
	public T first() {
		if(list.isEmpty()) {
			throw new IllegalArgumentException("A lista está vazia!");
		}
		return list.get(0);
	}
	
	public void print() {
		if(!list.isEmpty()) {
			StringBuilder sb = new StringBuilder("[" + list.get(0));
			for(int i = 1; i < list.size(); i++) {
				sb.append(", "+list.get(i));
			}
			sb.append("]");
			System.out.println(sb.toString());			
		} else {
			throw new IllegalArgumentException("A lista está vazia!");
		}
	}
}

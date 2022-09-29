package com.mycompany.study.ch13.forth;

public class Pair<K, V> {
	private K key;	// string, int, double ...아무거나 가능  
	private V value; 

	public Pair(K key, V value) {
		this.key = key;
		this.value = value;
	}
	

	public void setKey(K key) { this.key = key; }
	public void setValue(V value) { this.value = value; }
	public K getKey()   { return key; }
	public V getValue() { return value; }
}

package com.classobject;

class Node{
	Node prev;
	Node next;
	int data;
	public Node(int data,Node next,Node prev)
	{
		this.data=data;
		this.next=next;
		this.prev=prev;
	}
}
class DoublyLinkList
{
	private Node head;
	private Node tail;
	private int size;
	
	void add(int data)
	{
		Node temp=new Node(data,head,null);
		if(head!=null)
			head.prev=temp;
		head=temp;
		if(tail==null)
			tail=temp;
		setSize(getSize() + 1);
		System.out.println("Adding : "+data);
		
		
	}
	
	void delete()
	{
		
		Node tmp = tail;
        tail = tail.prev;
        tail.next = null;
        setSize(getSize() - 1);
        System.out.println("deleted: "+tmp.data);
       // return tmp.data;
	}
	
	void insert()
	{
	}
	void print()
	{
         
        System.out.println("Printing..");
        Node tmp = head;
        while(tmp != null){
            System.out.println(tmp.data);
            tmp = tmp.next;
        }
    } 
		
	
	
	 int count()
	{
		int count=0;
		 Node tmp = head;
        while(tmp != null){
            count++;
            tmp = tmp.next;
        }
		return count;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	}


public class DLL
{
	public static void main(String args[])
	{
		DoublyLinkList d1=new DoublyLinkList();
		d1.add(5);
		d1.add(7);
		d1.add(9);
		d1.print();
		System.out.println("count : "+d1.count());
		d1.delete();
		d1.print();
		System.out.println("count : "+d1.count());
		
	}
}
	
	
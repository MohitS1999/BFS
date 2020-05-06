import java.util.*;
class Node{
	int data;
	Node next;
}
public class BFS{
	public static void main(String[] arhs){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[][]=new int[n+1][n+1];
		System.out.println("ROW");
		
		for(int i=1;i<=n;i++){
			System.out.println("COLUMN");
			for(int j=1;j<=n;j++){
				a[i][j]=sc.nextInt();
			}
		}
		bfs(a,sc.nextInt(),n);
	}
	//BFS
	public static void bfs(int a[][],int i,int n){
		Queue q=new Queue();
		int visited[]=new int[n+1];
		System.out.println(i);
		visited[i]=1;
		q.enqueue(i);
		while(!q.isEmpty()){
			int u=q.dequeue();
			for(int v=1;v<=n;v++){
				if((a[u][v]==1) && (visited[v]==0)){
					System.out.println(v);
					visited[v]=1;
					q.enqueue(v);
				}
			}
		}
	}
}
//Queue
class Queue{
	Node front;
	Node rear;
	//Insert the Element in Queue
	public void enqueue(int data){
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(front==null)
		{
			front=node;
			rear=node;
		}else
		{
			rear.next=node;
			rear=node;
		}
	}
	//Delete the element from the queue
	public int dequeue(){
		int x=-1;
		if(front==null)
			System.out.println("EMptty");
		else{
			Node t=front;
			front=front.next;
			x=t.data;
			t=null;
		}return x;
	}
	public boolean isEmpty(){
		if (front==null)
			return true;
		return false;
	}
}

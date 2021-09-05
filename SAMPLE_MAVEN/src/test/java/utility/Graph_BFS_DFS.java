package utility;
import java.util.LinkedList;
import java.util.Iterator;
public class Graph_BFS_DFS {
	private int v;
	private LinkedList<Integer> adj[]; //adj edges of the graph
	public Graph_BFS_DFS(int vertex){
		v=vertex;
		adj= new LinkedList[v];
		for(int i=0;i<v;i++)
			adj[i]=new LinkedList<Integer>();
		
	}
	public void addEdge(int v,int w)	{
		adj[v].add(w);
	}
	
	public void BFS(int v1){
		boolean visited[]=new boolean[v];
		LinkedList<Integer> queue=new LinkedList<>();
		queue.add(v1);
		System.out.println("BFS TRAVERSAL");
		while(queue.size()!=0){
			int s=queue.poll();
			System.out.print(s+"-->");
			visited[s]=true;
			Iterator i=adj[s].listIterator();
			while(i.hasNext()){
				int n=(int) i.next();
				if(!visited[n])
					queue.add(n);
				
			}
		}
		
	}
	public void DFS(int v1){
		boolean visited[]=new boolean[v];
		System.out.println("\nDFS TRAVERSAL");
		DfsUtil(v1,visited);
		
	}
	public void DfsUtil(int v1, boolean[] visited){
		visited[v1]=true;
		System.out.print(v1+"-->");
		Iterator i=adj[v1].listIterator();
		while(i.hasNext()){
			int n=(int) i.next();
			if(!visited[n])
				DfsUtil(n,visited);}
		
	}
	public static void main(String[] args) {
		Graph_BFS_DFS g=new Graph_BFS_DFS(4);
		g.addEdge(0,1);
		g.addEdge(0,2);
		g.addEdge(1,2);
		g.addEdge(2,0);
		g.addEdge(2,3);
		g.addEdge(3,3);
		g.BFS(2);
		g.DFS(2);
		
		

	}

}

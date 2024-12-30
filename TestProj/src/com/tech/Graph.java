package com.tech;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Graph {
	
	static class Edge{
		
		int source;
		@Override
		public String toString() {
			return "Edge [source=" + source + ", destination=" + destination + "]";
		}

		int destination;
		public Edge(int source , int destination) {
			this.source=source;
			this.destination=destination;
		}
		// create graph method
		public static void createGraph(ArrayList<Edge> graph[]) {
			// making loop to replace nyll value with list value 
			for(int i=0; i<graph.length ; i++) {
				graph[i]=new ArrayList<>();
			}
			graph[0].add(new Edge(0, 1));
			graph[1].add(new Edge(1, 2));
			graph[1].add(new Edge(1, 3));
			graph[2].add(new Edge(2, 0));
			graph[2].add(new Edge(2, 1));
			graph[2].add(new Edge(2, 3));
			graph[3].add(new Edge(3, 1));
			graph[3].add(new Edge(3, 2));
			System.out.println("Graph created ");
			// calling printNeighbour 
			printNeighbour(graph);
		}
		// logic to find neighbor of all vertexes
		public static void printNeighbour(ArrayList<Edge> graph[]) {
			
			for(int i=0 ; i<graph.length ;i++) {
				   ArrayList<Edge> e= graph[i];
				   int vertex=i;
				   for(Edge edge : e) {
					   System.out.println(" for vertex : "+ vertex +" neighbour are  "+edge.destination);
				   }
			}
		}
		// traversal logic
		// create a boolean array 
		public static void traverseGraph(ArrayList<Edge> graph[],int vertex) {
		boolean b[]=new boolean[vertex];
		for(int i=0 ; i<b.length ; i++) {
			b[i]=false;
		}
		//creating a queue for traveling 
		Queue<Integer> q=new LinkedList<Integer>();
		// add an element to queue for traversal
		q.add(0);
		while(!q.isEmpty()) {
			  int v=q.remove();
			  if(b[v]==false) {
				System.out.println(" nodes of graph : "+v);
				b[v]=true;
				for(int i=0 ; i<graph[v].size();i++) {
					ArrayList<Edge> edge=graph[i]; 
				      for(Edge e : edge) {
				    	  q.add(e.destination);
				      }
				}
			}
		}
		
		}

		static int count=0;
		public static void DFS(ArrayList<Edge> graph[],int current , boolean vis[] ) {
			System.out.println(count=count++);
			System.out.println("DFS : "+current);
			vis[current]=true;
				
				for(int i=0; i<graph[current].size() ;i++) {
					  Edge edge =graph[current].get(i);
					  System.out.println(" in for "+edge + "i value "+i);
					  if(vis[edge.destination] == false)
					     DFS(graph,edge.destination,vis);
				}
			System.out.println("DFS bahar aya");
			//System.out.println("count "+count);
		}
	
		public static void printAllPath(ArrayList<Edge> graph[] , int current , String path , boolean vis[] ,int target) {
		//	System.out.println("called");
			if(current == target) {
				System.out.println(path);
				return;
			}
			
			for(int i=0 ; i<graph[current].size();i++) {
			    
				Edge edge=graph[current].get(i);
				
				if(vis[edge.destination] == false) {
					vis[current]=true;
					printAllPath(graph, edge.destination, path+edge.destination, vis, target);
					vis[current]=false;
				}
			}
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int vertex=4;
		ArrayList<Edge> graph[]=new ArrayList[vertex]; 
            Edge.createGraph(graph);
            Edge.traverseGraph(graph, vertex);
            boolean b[]=new boolean[vertex];
    		for(int i=0 ; i<b.length ; i++) {
    			b[i]=false;
    		}
    		Edge.DFS(graph, 0, b);
    		int src=0 ; int destination=3;
    		Edge.printAllPath(graph, 0, "0", new boolean[vertex], 3);
		
	}

}

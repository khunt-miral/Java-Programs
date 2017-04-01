package Graph;

import java.util.HashMap;

public class Graph {
	private class Vertex{
	 String name;
	 Vertex(String name){
		 this.name=name;
	 }
	 
	}
	
   private class Edge{
		Vertex v1;
		Vertex v2;
		Edge(Vertex v1,Vertex v2){
			this.v1=v1;
			this.v2=v2;
		}
	}
   
    private HashMap<String,Vertex >vertices;
    private HashMap<Vertex,Vertex>edges;
    
      public Graph(){
    	this.vertices=new HashMap<>();
    	this.edges=new HashMap<>();
    }
    public void addVertex(String name){
    	if(vertices.containsKey(name)){
    		return;
    	}
    	else{
    		vertices.put(name, null);
    	}
    }
    public void removeVertex(String name){
    	if(!vertices.containsKey(name))
    		return ;
    	else
    		vertices.remove(name);
    }
    public int numVertices(){
    	return this.vertices.size();
    }
    public void addEdge(String name1,String name2){
    	if(!vertices.containsKey(name1)||!vertices.containsKey(name2))
    		return;
    	Vertex v1=vertices.get(name1);
    	Vertex v2=vertices.get(name2);
    	Edge newEdge=new Edge(v1,v2);
    	
    	edges.put(v1,v2);
    	
    }
    public void removeEdge(String name1,String name2){
    	if(!vertices.containsKey(name1)||!vertices.containsKey(name2))
    		return;
    	
    	
    }
    
}

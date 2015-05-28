import java.util.*;
public class DFS{

    private static LinkedList<Integer>[] adj;
    private static boolean[] visited;
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        adj = new LinkedList[n];
        visited = new boolean[n];
        
        for(int i = 0; i < n; i++){
            adj[i] = new LinkedList<Integer>();
            visited[i] = false;
        }
        
        for(int i = 0; i < m; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            adj[a].add(b);
        }
        runDFS(0);
        runBFS(0);
     }
     
     public static void runDFS(Integer root){
         if(root == null)
            return;
        System.out.println(root);
         visited[root] = true;
         for(int i = 0; i < adj[root].size(); i++){
             if(!visited[adj[root].get(i)])
                runDFS(adj[root].get(i));
         }
         
     }
     
     public static void runBFS(Integer root){
         if(root == null)
            return;
            
        List queue = new LinkedList<Integer>();
        queue.add(root);
        visited[root] = true;
        
        while(queue.size() != 0){
            int head = (int) queue.remove(0);
            
            
            System.out.println(head);
            for(int i = 0; i < adj[head].size(); i++){  
                
                if(!visited[adj[head].get(i)]){
                    queue.add(adj[head].get(i));
                    visited[adj[head].get(i)] = true;
                }
            }            
        }
        
     }
}

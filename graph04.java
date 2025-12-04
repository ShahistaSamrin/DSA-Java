/*OUTPUT:
Movie Heroes Fan Network
mahesh->[ram, vijay]
prabhasn->[allu]
allu->[ntr, ramveer, prabhasn, nani]
ramveer->[allu]
ntr->[allu]
nani->[allu]
ram->[mahesh, vijay]
vijay->[ram, mahesh] */
import java.util.*;
  class Graph04{
    private Map<String,List<String>>connections=new HashMap<>();
    public void addHero(String hero){
        connections.putIfAbsent(hero, new ArrayList<>());
    }

    public void addConnection(String hero1,String hero2){
       addHero(hero1);
       addHero(hero2);
    
    
      if(!connections.get(hero1).contains(hero2))connections.get(hero1).add(hero2);
      if(!connections.get(hero2).contains(hero1))connections.get(hero2).add(hero1);
       
      }

    public void showNetwork(){
        System.out.println("Movie Heroes Fan Network");
        for(String hero:connections.keySet()){
            System.out.println(hero+"->"+connections.get(hero));
        }

    }
    public boolean areConnected(String h1,String h2){
        return connections.containsKey(h1)&& connections.get(h1).contains(h2);

    }
    public void topPopularHero(){
      String top="";
      int max=-1;
      for(String hero:connections.keySet()){
        if(connections.get(hero).size()>max){
            max=connections.get(hero).size();
        }
      }
        
      System.out.println("\n top fan network hero="+top+"("+max+"list");
    }
   

    public static void main(String[]args)
{
    Graph04 graph=new Graph04();
    graph.addConnection("ntr","allu");
    graph.addConnection("ram","mahesh");
    graph.addConnection("allu","ramveer");
    graph.addConnection("allu","prabhasn");
    graph.addConnection("vijay","ram");
    graph.addConnection("nani","allu");
    graph.addConnection("vijay","mahesh");

    graph.showNetwork();

    graph.topPopularHero();



 }
}
  
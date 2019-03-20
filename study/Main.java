
import java.io.*;
import java.util.*;

class Main{
    public static void main(String[] args){
        solve();
    }

    public static void solve(){
       	ArrayList<String> s = problem();
       	ArrayList<String> restList = restriction();
       	/*ArrayList<String> wordList = word();

       	for(int i=0;i<wordList.size();i++){
       		System.out.println(wordList.get(i));
       	}*/

       	HashMap<String,Integer> algorithmList = algorithm();

       	for(String key : algorithmList.keySet()){
       		//System.out.println(key+" "+algorithmList.get(key));
       	}

       	HashMap<String, Integer> scoreList = score();
       	HashMap<String, String[]> scoreNameList = scoreName();

       	for(String key : scoreList.keySet()){
       		//System.out.println(key+" "+scoreNameList.get(key)+" "+scoreList.get(key));
       	}

       	int[] counterList = new int[algorithmList.size()];
       	for(String key : scoreList.keySet()){
       		for(int j=0;j<s.size();j++){
       			String u = s.get(j);
		       	if(u.matches(".*"+key+".*")){
       				String[] t = scoreNameList.get(key);
       				for(int i=0;i<t.length;i++){
	       				counterList[algorithmList.get(t[i])] += scoreList.get(key);
   					}
   				}
       		}
       	}
       	for(int i=0;i<restList.size();i++){
       		String rest = restList.get(i);
       		String[] t;
       		if(rest.contains("<=")){
       			t = rest.split("<=", 0);
       		}
       		else{
       			t = rest.split("<", 0);
       		}
       		for(int j=0;j<t.length;j++){
       			if(t[j].charAt(0)=='-' && counterList[algorithmList.get("Dijkstra")]!=0){
       				counterList[algorithmList.get("BellmanFord")] += 5;
       			}
       			if(i==0 && j==2){
       				if(500>Integer.parseInt(t[j]) && counterList[algorithmList.get("Dijkstra")]!=0){
       					counterList[algorithmList.get("WarshallFloyd")] += 3;
       				}
       			}
       		}
       	}
       	if(restList.size()<=2 && (counterList[algorithmList.get("Dijkstra")]!=0 || counterList[algorithmList.get("BFS")]!=0)){
       		counterList[algorithmList.get("BFS")] += 1;
       	}
       	if(restList.size()<=2 && (counterList[algorithmList.get("Dijkstra")]!=0 || counterList[algorithmList.get("DFS")]!=0)){
       		counterList[algorithmList.get("DFS")] += 1;
       	}

       	int now = 0;
       	int max = counterList[now]; 
       	for(int i=1;i<algorithmList.size();i++){
       		if(max<counterList[i]){
       			now = i;
       			max = counterList[i];
       		}
       		if(counterList[i]!=0){
       			//System.out.print(counterList[i]+" ");
       			//output(i, algorithmList);
       		}
       	}
       	output(now, algorithmList);
    }	

    public static ArrayList<String> problem(){
    	System.out.println("Input the problem(end only 0)");
    	ArrayList<String> s = new ArrayList<String>();
    	while(true){		
		    Scanner sc = new Scanner(System.in);
		    String t = sc.next();
		    if(t.equals("0")){
		    	break;
		    }
		    s.add(t);
    	}
    	return s;
    }

    public static ArrayList<String> restriction(){
    	System.out.println("Input the restriction(end only 0)");
    	Scanner sc = new Scanner(System.in);
    	ArrayList<String> restList = new ArrayList<String>();
    	String s = sc.next();
    	while(!s.equals("0")){
    		restList.add(s);
    		s = sc.next();
    	}
    	sc.close();
    	return restList;
    }
/*
    public static ArrayList<String> word(){
    	try{
	    	ArrayList<String> wordList = new ArrayList<String>();
    		File file = new File("word.txt");
    		BufferedReader reader = new BufferedReader(new FileReader(file));
    		String s;
    		while((s = reader.readLine()) != null){
    			wordList.add(s);
    		}
    		reader.close();
    		return wordList;
    	}catch(IOException e){
    		System.out.println(e);
    	}
    	return new ArrayList<String>();
    }
*/
    public static HashMap<String,Integer> algorithm(){
    	try{
	    	HashMap<String,Integer> algorithmList = new HashMap<String,Integer>();
    		File file = new File("algorithm.txt");
    		BufferedReader reader = new BufferedReader(new FileReader(file));
    		String s;
    		int counter = 0;
    		while((s = reader.readLine()) != null){
    			algorithmList.put(s, counter);
    			counter++;
    		}
    		reader.close();
    		return algorithmList;
    	}catch(IOException e){
    		System.out.println(e);
    	}
    	return new HashMap<String,Integer>();
    }

    public static HashMap<String, Integer> score(){
    	try{
    		HashMap<String, Integer> scoreList = new HashMap<String, Integer>();
    		File file = new File("score.txt");
    		BufferedReader reader = new BufferedReader(new FileReader(file));
    		String s;
    		while((s = reader.readLine()) != null){
    			String[] t = s.split(",", 0);
    			scoreList.put(t[0], Integer.parseInt(t[t.length-1]));
    		}
    		reader.close();
    		return scoreList;
    	}catch(IOException e){
    		System.out.println(e);
    	}
    	return new HashMap<String, Integer>();	
    }

    public static HashMap<String, String[]> scoreName(){
    	try{
    		HashMap<String, String[]> scoreNameList = new HashMap<String, String[]>();
    		File file = new File("score.txt");
    		BufferedReader reader = new BufferedReader(new FileReader(file));
    		String s;
    		while((s = reader.readLine()) != null){
    			String[] t = s.split(",", 0);
    			String[] u = new String[t.length-2];
    			for(int i=0;i<u.length;i++){
    				u[i] = t[i+1];
    			}
    			scoreNameList.put(t[0], u);
    		}
    		reader.close();
    		return scoreNameList;
    	}catch(IOException e){
    		System.out.println(e);
    	}
    	return new HashMap<String, String[]>();	
    }

    public static void output(int now, HashMap<String, Integer> algorithmList){
    	for(String key : algorithmList.keySet()){
    		if(now==algorithmList.get(key)){
    			System.out.println(key);
    			break;
    		}
    	}
    }
}
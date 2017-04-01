import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
public class Long_Incr_SubSeq {

   // Longest Increasing Subsequence 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[]arr=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=scn.nextInt();
		}
		HashMap<Integer, Boolean>table=new HashMap<>();
		for(int i=0;i<n;i++){
			if(table.containsKey(arr[i]-1)){
				table.put(arr[i], false);
			}
			else
				table.put(arr[i], true);
			
			if(table.containsKey(arr[i]+1))
			{
				table.put(arr[i]+1, false);
			}	
		}
		System.out.println(table);
		String osf="";
		String toPrint="";
		int lis=0;
		int count=0;
		int counter=0;
		Set<Map.Entry<Integer, Boolean>>allEntries=table.entrySet();
		for(Map.Entry<Integer, Boolean>entry:allEntries){
			if(entry.getValue()){
				if(count>lis){
					lis=count;
					toPrint=osf;
				}
				count=0;
				osf="";
			}
			if(table.containsKey(entry.getKey()+1)){
			count++;
			osf=osf+entry.getKey()+",";
			}
		    counter++;
		    if(counter==table.size()){
		    	if(count>lis){
		    		lis=count;
		    		toPrint=osf;
		    	}
		    }
		}
		System.out.println(lis);
		System.out.println(toPrint);

	}

}

package com.apple.store.challenge;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
public class IpadressSortingPractice1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> iplist = Arrays.asList("9.20.245.12","26.62.244.12","26.62.245.12","244.64.245.12","26.62.245.13","27.62.245.12");
        List<String> iplistPort = Arrays.asList("26.62.245.12:8080","26.62.244.12:8081","26.62.245.12:8082","26.64.245.12:8083","26.62.245.13:8084","27.62.245.12:8085");
        
        ipSorting(iplist).forEach(e->System.out.println(e));
        ipSorting(iplistPort).forEach(e->System.out.println(e));
        ipSorting1(iplist).forEach(e->System.out.println(e));
	}
	
    public static List<String> ipSorting(List<String> list){
    	Collections.sort(list, new Comparator<String>(){
			public int compare(String o1, String o2) {				
				return stringtonumber1(o1).compareTo(stringtonumber1(o2));
			}   		
    	});    	
    	return list;
    }  
    
    public static List<String> ipSorting1(List<String> list){
    	Collections.sort(list,(name1,name2)->{  
            return stringtonumber1(name1).compareTo(stringtonumber1(name2));  
            });  	
    	return list;
    } 
    
  
	static Long stringtonumber1(String ip) {
	   String[] st = ip.split("\\.|\\:");
	   Long l = null;
	   if(st.length>=5){
		   l= (Long.parseLong(st[0]) << 32)+(Long.parseLong(st[1]) << 24) + (Long.parseLong(st[2]) << 16) + (Long.parseLong(st[3]) << 8)+ (Long.parseLong(st[4]));
	      }else{ 	  
	    	  l= (Long.parseLong(st[0]) << 24) + (Long.parseLong(st[1]) << 16) + (Long.parseLong(st[2]) << 8)+ (Long.parseLong(st[3]));		
		  }	   
	    return l;
	  }
    }
/*26.62.244.12
26.62.245.12
26.62.245.12
26.62.245.13
26.64.245.12
27.62.245.12

26.62.244.12:8081
26.62.245.12:8080
26.62.245.12:8082
26.62.245.13:8084
26.64.245.12:8083
27.62.245.12:8085
     */


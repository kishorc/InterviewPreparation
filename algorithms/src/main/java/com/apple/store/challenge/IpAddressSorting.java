package com.apple.store.challenge;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class IpAddressSorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ipList = new ArrayList<String>();
	    ipList.add("192.168.0.1");
	    ipList.add("192.168.0.2");
	    ipList.add("192.168.0.9");
	    ipList.add("9.9.9.9");
	    ipList.add("127.0.0.1");
	   	    
		List<String> ipListWithPort = new ArrayList<String>();
		ipListWithPort.add("123.4.245.23:8087");
		ipListWithPort.add("104.244.253.29:8086");
		ipListWithPort.add("1.198.3.93:8080");
		ipListWithPort.add("32.183.93.40:8081");
		ipListWithPort.add("104.30.244.2:8083");
		ipListWithPort.add("104.244.4.1:8084");
	    
	    sortIPList(ipList).forEach(e-> System.out.println(e));
	    
	    System.out.println();
	    System.out.println();
	    System.out.println();
	    
	    sorIPListWithPortNumber(ipListWithPort).forEach(e-> System.out.println(e));

	}
		
	public static List<String>  sortIPList(List<String> ipListWithPort){
		 Collections.sort(ipListWithPort, new Comparator<String>(){
		    	@Override
		        public int compare(String o1, String o2) {
		            String[] ips1 = o1.split("\\.");
		
		            String updatedIp1 = String.format("%3s.%3s.%3s.%3s",
		            		                                 ips1[0],ips1[1],ips1[2],ips1[3]);
		            //System.out.println(updatedIp1);  
		            String[] ips2 = o2.split("\\.");
		            String updatedIp2 = String.format("%3s.%3s.%3s.%3s",
		                                                  ips2[0],ips2[1],ips2[2],ips2[3]);
		            
		            //System.out.println(updatedIp2);
		            return updatedIp1.compareTo(updatedIp2);
		        }
		    });
		 return ipListWithPort;   
	}
	
	public static List<String> sorIPListWithPortNumber(List<String> ipList){
		Collections.sort(ipList, new Comparator<String>(){
	    	@Override
	        public int compare(String o1, String o2) {
	            String[] ips1 = o1.split("\\.|\\:");
	
	            String updatedIp1 = String.format("%3s.%3s.%3s.%3s:%4s",
	            		                                 ips1[0],ips1[1],ips1[2],ips1[3],ips1[4]);
	            //System.out.println(updatedIp1);  
	            String[] ips2 = o2.split("\\.|\\:");
	            String updatedIp2 = String.format("%3s.%3s.%3s.%3s:%4s",
	                                                  ips2[0],ips2[1],ips2[2],ips2[3],ips2[4]);
	            
	            //System.out.println(updatedIp2);
	            return updatedIp1.compareTo(updatedIp2);
	        }
	    });
		return ipList;
	}
	
}

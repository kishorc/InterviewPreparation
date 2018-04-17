package com.apple.store.challenge;

import java.math.BigInteger;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;

public class IpAddressSortingJava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     final String[] addresses = {
	                "123.4.245.23",
	                "104.244.253.29",
	                "1.198.3.93",
	                "32.183.93.40",
	                "104.30.244.2",
	                "104.244.4.1"
	        };
	     
	     for (final String address : sort(addresses)) {
	            System.out.println(address);
	        }
	}
	private static final Comparator<InetAddress> COMPARATOR = Comparator
            .comparing(InetAddress::getAddress,
                    Comparator.comparingInt((byte[] b) -> b.length)
                    .thenComparing(b -> new BigInteger(1, b)));
	public static String[] sort(final String[] addresses) {
        return Arrays.stream(addresses)
                .map(s -> new AbstractMap.SimpleImmutableEntry<>(toInetAddress(s), s))
                .sorted(Comparator.comparing(Map.Entry::getKey, Comparator.nullsLast(COMPARATOR)))
                .map(Map.Entry::getValue)
                .toArray(String[]::new);
    }
	 private static InetAddress toInetAddress(final String address) {
	        try {
	            return InetAddress.getByName(address);
	        } catch (final UnknownHostException | SecurityException e) {
	            e.printStackTrace();
	            return null;
	        }
	    }
}

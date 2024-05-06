package com.corejava.demo.abstraction;

/**
 * GSM IS STANDARD USED BY MULTIPLE VENDORS
 */
public interface GSM {

	/**
	 * registers network into the carrier frequency
	 * @param networkType
	 */
	public void registerNetwork(String networkType);
	
	/**
	 * identify SIM with UID
	 */
	public void getSimUid();
	
	/**
	 * get IP address and throughput based on generation
	 * @param generation
	 */
	public void getIpAddress(String generation);
	
	
	public void callByIp(String ipAddress);
}

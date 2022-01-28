package model;

/**  
* Kai Mwirotsi-Shaw - kimwirotsishaw  
* CIS171 12601 WH1  
* Jan 27, 2022  
*/
public class Computer {
	private String operatingSystem;
	private int processorCores;
	private int ramSize;
	private boolean hyperthreading;
	
	public Computer(String operatingSystem, int processorCores, int ramSize, boolean hyperthreading) {
		super();
		this.operatingSystem = operatingSystem;
		this.processorCores = processorCores;
		this.ramSize = ramSize;
		this.hyperthreading = hyperthreading;
	}
	public boolean getHyperthreading() {
		return hyperthreading;
	}
	public void setHyperthreading(boolean hyperthreading) {
		this.hyperthreading = hyperthreading;
	}
	public int getProcessorCores() {
		return processorCores;
	}
	public void setProcessorCores(int processorCores) {
		this.processorCores = processorCores;
	}
	public String getOperatingSystem() {
		return operatingSystem;
	}
	public void setOperatingSystem(String operatingSystem) {
		this.operatingSystem = operatingSystem;
	}
	public int getRamSize() {
		return ramSize;
	}
	public void setRamSize(int ramSize) {
		this.ramSize = ramSize;
	}
	public int getLogicalProcessors() {
		if(getHyperthreading() == true) {
			return getProcessorCores() * 2;
		}
		else {
			return getProcessorCores();
		}
	}
	public boolean isLinuxCompatible() {
		if(getRamSize() >= 4) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isWindowsCompatible() {
		if(getRamSize() >= 8) {
			return true;
		}
		else {
			return false;
		}
	}
}

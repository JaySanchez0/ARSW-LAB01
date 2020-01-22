package edu.eci.arsw.threads;
import edu.eci.arsw.math.PiDigits;;

public class ThreadBBP extends Thread{
	private int start;
	private int count;
	private byte[] resp;
	private int first;
	public ThreadBBP(int start,int count,byte[] resp,int first) {
		this.start = start;
		this.count = count;
		this.resp = resp;;
		this.first = first;
	}
	@Override
	public void run() {
		byte[] resp = PiDigits.getDigits(start, count);
		for(int i=0;i<resp.length;i++) {
			this.resp[first+i]=resp[i];
		}
		
	}
}

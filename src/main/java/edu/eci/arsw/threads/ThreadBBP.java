package edu.eci.arsw.threads;
import edu.eci.arsw.math.PiDigits;;

public class ThreadBBP extends Thread{
	private int start;
	private int count;
	private byte[] resp;
	public ThreadBBP(int start,int count) {
		this.start = start;
		this.count = count;
		resp = null;
	}
	@Override
	public void run() {
		resp = PiDigits.getDigits(start, count);
		
	}
	public byte[] getResp() {
		return resp;
	}

}

package pkg15;

import java.util.Vector;

public class VideoShop {
	String[] arrVideo = {"겨울 왕국", "명량"};
	
	public static VideoShop vshop = new VideoShop();
	
	private Vector<String> videoLists = new Vector<String>() ;
	
	public VideoShop() {
		for (int i = 0; i < arrVideo.length; i++) {
			videoLists.addElement(arrVideo[i]);
		}		
	}
	
	public synchronized String lendVideo() {
		String threadName = Thread.currentThread().getName() ;
		if (this.videoLists.size() == 0) {
			System.out.println(threadName + "님 번호표 받고 기다리세요.");
			try {
				super.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		String videoName = this.videoLists.remove(videoLists.size()-1);
		return videoName; //빌려 주는 비디오 이름
	}
	
	public synchronized void returnVideo(String video) {
		this.videoLists.addElement(video);
		super.notify();
	}
}

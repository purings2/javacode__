package pkg07;

public class CaptionTv {
	private String color = "°ËÁ¤" ;
	private String caption = "³ëÄ¸¼Ç" ;
	private int volume = 5 ;
	private int channel = 11 ;
	
	public CaptionTv() {
	
	}
	
	public CaptionTv(String color, String caption) {
		this.color = color ;
		this.caption = caption ;
	}

	public CaptionTv(String color, String caption, int volume, int channel) {
		this.color = color ;
		this.caption = caption ;
		this.volume = volume ;
		this.channel = channel ;
	}

	public void Display() {
		System.out.println("»ö»ó : " + this.color);
		System.out.println("º¼·ý : " + this.volume);
		System.out.println("Ã¤³Î : " + this.channel);
		System.out.println("Ä¸¼Ç : " + this.caption);
	}

	public void setVolume(int volume) {
		this.volume = volume ;
	}

	public void volumeDown(int volume) {
		this.volume -= volume ;		
	}

	public void volumeUp(int volume) {
		this.volume += volume ;
	}

	public void channelUp(int channel) {
		this.channel += channel ;		
	}

}

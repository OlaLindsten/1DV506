package ol222es_lab3;

public class Radio {

	private boolean on = false;
	private int channel = 1;
	private int volume = 1;
	
	public String getSettings() {
		
		String settings = "Settings: On " + on + ", Channel " + channel + ", Volume " + volume;
		
		return settings;
	}
	
	public void turnOn() {
		this.on = true;
	}
	
	public void turnOff() {
		this.on = false;
		this.channel = 1;
		this.volume = 1;
	}

	public void setVolume(int volume) {
		if(checkVolume(volume)) {
			this.volume = volume;
		}
	}
	
	public void volumeUp() {
		if (checkVolume(volume + 1)) {
			this.volume = volume + 1;
		}
	}
	
	public void volumeDown() {
		if (checkVolume(volume - 1)) {
			this.volume = volume - 1;
		}
	}
	
	public void setChannel(int channel) {
		if (checkChannel(channel)) {
			this.channel = channel;
		}
	}
	
	public void channelUp() {
		if (checkChannel(channel + 1)) {
			this.channel = channel + 1;
		}
	}
	
	public void channelDown() {
		if (checkChannel(channel - 1)) {
			this.channel = channel - 1;
		}
	}
	
	private boolean checkVolume(int volume) {
		if (isRadioOn()) {
			if(!(volume >= 0 && volume <= 5)) {
				System.out.println("New volume not within range!");
				return false;
			}
			return true;
		}
		return false;
	}
	
	private boolean checkChannel(int channel) {
		if(isRadioOn()) {
			if(!(channel >= 1 && channel <= 10)) {
				System.out.println("New channel not within range!");
				return false;
			}
			return true;
		}
		return false;
	}
	
	private boolean isRadioOn() {
		if(!on) {
			System.out.println("Radio off ==> No adjustment possible");
			return false;
		}
		return true;
	}
}

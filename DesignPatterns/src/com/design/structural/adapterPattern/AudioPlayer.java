package com.design.structural.adapterPattern;

public class AudioPlayer implements MediaPlayer {
	MediaAdapter adapter;

	@Override
	public void play(String audioType, String fileName) {
		if (audioType.equalsIgnoreCase("mp3")) {
			System.out.println("Playing MP3 file");
		} else if (audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mp4")) {
			adapter = new MediaAdapter(audioType);
			adapter.play(audioType, fileName);
		} else {
			System.out.println("INVALID FORMAT" + "." + audioType + " format is not supported.");
		}
		
	}
}

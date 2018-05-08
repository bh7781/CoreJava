package com.design.structural.adapterPattern;

public class EntryPoint {

	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		audioPlayer.play("mp3", "Summer of 69.mp3");
		audioPlayer.play("vlc", "Harry Potter 4.vlc");
		audioPlayer.play("mp4", "Heavy.mp4");
		audioPlayer.play("avi", "It's my Life.avi");
	}

}

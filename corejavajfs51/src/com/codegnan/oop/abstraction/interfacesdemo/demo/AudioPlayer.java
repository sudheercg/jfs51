package com.codegnan.oop.abstraction.interfacesdemo.demo;

public class AudioPlayer implements Playable {

	String songName;
	int duration;
	String status; // Playing or Paused, stopped

	AudioPlayer(String songName, int duration) {
		this.songName = songName;
		this.duration = duration;
		this.status = "STOPPED";

	}

	@Override
	public void play() {

		if (status.equals("STOPPED")) {
			System.out.println("Playing song" + songName);
			status = "PLAYING";
		} else if (status.equals("PAUSED")) {
			System.out.println("Resume playing " + songName);
			status = "PLAYING";
		} else {
			System.out.println("Already playing the song");
		}
	}

	@Override
	public void pause() {
		if (status.equals("PLAYING")) {
			System.out.println("Paused " + songName);
			status = "PAUSED";
		} else {
			System.out.println("Not currently playing");
		}

	}

	@Override
	public void stop() {

		if (!status.equals("STOPPED")) {
			System.out.println("stopped: " + songName);
			status = "STOPPED";
		} else {
			System.out.println("Already stopped");
		}
	}

}

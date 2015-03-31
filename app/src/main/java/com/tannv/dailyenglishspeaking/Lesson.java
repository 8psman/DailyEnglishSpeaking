package com.tannv.dailyenglishspeaking;

public class Lesson {
	private String title;
	private int image;

	public Lesson(String _title, int _image) {
		this.title = _title;
		this.image = _image;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getImage() {
		return image;
	}

	public void setImage(int image) {
		this.image = image;
	}

}

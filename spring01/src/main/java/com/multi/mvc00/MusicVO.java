package com.multi.mvc00;

public class MusicVO {
	private int id;
	private String name;
	private String singer;
	private String genre;
	private String album;
	
	public MusicVO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MusicVO(int id, String name, String singer, String genre, String album) {
		super();
		this.id = id;
		this.name = name;
		this.singer = singer;
		this.genre = genre;
		this.album = album;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSinger() {
		return singer;
	}

	public void setSinger(String singer) {
		this.singer = singer;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}
	
}

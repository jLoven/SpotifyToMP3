//  Jackie Loven, 20 December 2015

package readSongList;

public class Song {

	private String songName;
	private String songArtist;
	public String searchURL;
	
	private String replaceNullString(String input) {
		//  Because you might add capability to type in just song name and get back an MP3.
		if (input == null) {
			return "";
		} else {
			return input.trim();
		}
	}
	
	public Song() {}

	public Song(String name, String artist) {
		this.songName = replaceNullString(name);
		this.songArtist = replaceNullString(artist);
	}

	public String getSongName() {
		return this.songName;
	}

	public void setSongName(String name) {
		this.songName = replaceNullString(name);
	}
	
	public String getSongArsits() {
		return this.songArtist;
	}

	public void setSongArtist(String artist) {
		this.songArtist = replaceNullString(artist);
	}
	
	@Override
	public String toString() {
		return "Song Name: " + this.songName + " Artist: " + this.songArtist;
	}

}


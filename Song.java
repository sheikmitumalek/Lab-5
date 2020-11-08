import java.util.*;
public class Song implements Comparable<Song>
{
   public String songTitle;//for song title
   public int streamCount;//for stream count
   public String artistName;//for artist name
   public int artistAverage;//for artist average
   public Song left;//for song left
   public Song right;//for song right
   public Song() 
   {
       this.songTitle = null;
       this.streamCount = 0;
       this.artistName = null;
       this.artistAverage = 0;
       left = null;
       right = null;
   }
   public Song(String songTitle, String artistName, int streamCount) 
   {
       this.songTitle = songTitle;
       this.streamCount = streamCount;
       this.artistName = artistName;
       this.artistAverage = streamCount;
       left = null;
       right = null;
   }
   public void setSongTitle(String songTitle) //for setting song title
   {
       this.songTitle = songTitle;
   }
   public String getSongTitle() //to get song title 
   {
       return this.songTitle;
   }
   public void setStreamCount(int streams) //to set stream count
   {
       this.streamCount = streams;
   }
   public int getStreamCount() //to get stream count
   {
       return this.streamCount;
   }
   public void setArtistName(String name) //to set artist name
   {
       this.artistName = name;
   }
   public String getArtistName() //to get artist name
   {
       return this.artistName;
   }
   public void setArtistAverage(Song obj) //to set artist average
   {
       this.artistAverage = (this.streamCount + obj.streamCount) / 2;
   }
   public int compareTo(Song obj) //for comparing
   {
       return this.songTitle.compareToIgnoreCase(obj.songTitle);
   }
  
   public String toString() {
       return this.songTitle + " by " + this.artistName + " has streamed " + this.streamCount + " times and streamed on average " + this.artistAverage + " times";
   }
}
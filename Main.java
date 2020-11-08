import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;//for the scanner
public class Main //main class
{
   static SongPlaylist lst = new SongPlaylist();
public static void main(String[] args) throws IOException 
{
   String[] fileLocation = { "Songs.csv",
               "Songs1.csv",
               "Songs2.csv",
               "Songs3.csv" }; // file location



       ArrayList<String> songList = new ArrayList<>(); // array list to store song tracks
       songList.ensureCapacity(1000); // ensures capacity for 5 input files
       ArrayList<String> artistList = new ArrayList<>(); // array list to store arist names
       artistList.ensureCapacity(1000); 
       ArrayList<Integer> streamList = new ArrayList<>(); // array list to store stream counts
       streamList.ensureCapacity(1000); 
         for (String x : fileLocation) 
         {
           FileInputStream inputStream = new FileInputStream(x); 
           Scanner sc = new Scanner(inputStream, StandardCharsets.UTF_8.name());//for scanner to read
           while (sc.hasNextLine()) 
           {                String line = sc.nextLine(); // line taken from file
               String[] array = line.split(",(?=(?:[^\"]*\"[^\"]*\")*[^\"]*$)", -1);
            if (array.length > 1) 
           { 
           for (int i = 0; i < array.length; i++) 
           {
            if (array[i].charAt(0) == '"') 
            {                          
               array[i] = array[i].substring(1, array[i].length() - 1);
            }
           }
               songList.add(array[1]); 
               artistList.add(array[2]); 
               streamList.add(Integer.parseInt(array[3]));  
            }
           }
              inputStream.close(); //to close the inputStream
              sc.close(); //to close the scanner
       }
              makeBST(songList, artistList, streamList); 
               lst.inorderTransversal();
       }
public static void makeBST(ArrayList<String> songLst, ArrayList<String> artistLst, ArrayList<Integer> streamLst) 
   {
       for (int i = 0; i < songLst.size(); i++) 
       {
           Song artist = new Song(songLst.get(i), artistLst.get(i), streamLst.get(i)); 
           lst.insert(artist); 
       }
   }

 }

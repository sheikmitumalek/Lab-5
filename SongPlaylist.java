public class SongPlaylist 
{
public Song root; // song root
public SongPlaylist() 
{
   root = null;
}
public boolean isEmpty() 
{
   return root == null; // return when empty
}
public void insert(Song obj) //for adding objects
{
   if (root == null) 
   {
      root = obj;
   }
   else 
   {
      Song current = root;
      Song parent;
    while (true) 
   {
      parent = current;
      if (obj.songTitle.compareToIgnoreCase(current.songTitle) == 0) 
      {
          current.setArtistAverage(obj);
          return;
      }
      else if (obj.songTitle.compareToIgnoreCase(current.songTitle) < 0) 
      {
          current = current.left;
      if (current == null) 
      {
          parent.left = obj;
          return;
      }
      }
      else 
      {
        current = current.right;
      if (current == null) 
      {
        parent.right = obj;
        return;
                      
       }
       }
       }
       }
       }
public void inorderTransversal() //for in order transversal
{
   inorder(root);
}
public void inorder(Song root) 
{
   if (root == null) 
   {
      return;
   }
      inorder(root.left); //for transverses left of root
      System.out.println(root); //for prints root
      inorder(root.right); //for transverses right of root
   }
public void subset(String song1, String song2) 
{
      subset(root, song1, song2); // calls helper function with root as one of the arguments
}
public Song subset(Song root, String song1, String song2) { // takes in three arguments
   if (root == null) 
   {
       return root;
   }
       Song current = root;
   if (song1.compareTo(current.songTitle) < 0) 
   {
       subset(current.left, song1, song2);
   }
   if ((song1.compareTo(current.songTitle) <= 0) && (song2.compareTo(current.songTitle) >= 0)) 
   {
       System.out.println(current);
   }
   if (song2.compareTo(current.songTitle) > 0) 
   {
       subset(current.right, song1, song2);
   }
       return root;
   }
}
import java.util.*;  
public class CollectionsRotateExample1 {  
    public static void main(String[] args) {                 
        //Let us create a list of strings  
            List<String>  mylist = new ArrayList<String>();  
            mylist.add("Java");  
            mylist.add("Python");  
            mylist.add("Cobol");  
            mylist.add("Perl");  
            mylist.add("Android");  
            System.out.println("Original List : " + mylist);    
            //Rotate the element by distance 3  
            Collections.rotate(mylist, 3);    
            System.out.println("Rotated List: " + mylist);  
          }  
}  
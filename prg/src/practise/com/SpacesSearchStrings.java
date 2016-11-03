package practise.com;

public class SpacesSearchStrings{
    public static void main(String args[]){
    
    String str[] = {" "," "," ","ball"," "," ","car"," "," ","dad",""," "};
    
    String search = "dad";
    
    if(search.equals(" ")){
        for(int i=0; i < str.length; i++){
                if(str[i].equals(" ")){
                        System.out.println(i);
                        return;
                }
        }
    }
        int low = 0;
        int high = str.length -1;
      System.out.println( searchInSpacesString(str, search, low, high) );
  }

 public static int searchInSpacesString(String []str, String search,int low, int high ){
         
         if(low > high)
             return -1;
         
         while(str[high].equals(" "))
        	 		high --;
         
         if(low > high)
             return -1;
         
         
         int mid = low + (high - low)/2;
         
         while( str[mid].equals(" ") )
                 mid++;
         
        
             
            int r = str[mid].compareTo(search);
            
            if( r ==0)
                return mid;
            else if( r < 0)
                return searchInSpacesString(str, search, mid + 1, high);
            else
                return searchInSpacesString(str, search, low, mid - 1);
                
    
 
 
     }

}

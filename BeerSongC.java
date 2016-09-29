
package beersong;

public class BeerSong {

    public static void main(String[] args) {
        Integer x = 99;
        
        while(x > 1){
            System.out.println(x + " bottles of beer on the wall");
            System.out.println(x + " bottles of beer");
            System.out.println("Take one down, pass it around");
            System.out.println(x - 1 + " bottles of beer on the wall");
            x--;
        }
        
            System.out.println("1 bottle of beer on the wall");
            System.out.println("1 bottle of beer");
            System.out.println("Take one down, pass it around");
            System.out.println("No more bottles of beer on the wall");
    }
}

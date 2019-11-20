import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class cmsc401{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String string_Test;
    int numCourses = Integer.parseInt(sc.nextLine());
    int numRooms = Integer.parseInt(sc.nextLine());

    //auto-initialized to falses
    boolean[][] big_bool = new boolean[numCourses][numRooms];

    //this loop scans each line of the input and then scans that line again
    //after the first string "cx:" the loop begins reading in the hall values
    //and triggers the corresponding boolean flag to be changed

    for(int i = 0; i < numCourses; i++){
      Scanner sc_line_by = new Scanner(sc.nextLine());
      sc_line_by.useDelimiter("h");
      //sc_line_by.useDelimiter(" ");
      sc_line_by.next();
      while(sc_line_by.hasNext()){
        int curr = Integer.parseInt(sc_line_by.next().replaceAll("\\s+", ""));
        //System.out.println("next is:" + curr + "j");
        big_bool[i][curr-1] = true;

        //System.out.println("bool is: " + big_bool[i][curr-1]);
      }
    }

    for(int i = 0; i < numCourses; i++){
      for(int j = 0; j < numRooms; j++){
        System.out.print(big_bool[i][j] + "   ");
      }
      System.out.println();
    }


  }
}

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class cmsc401{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String string_Test;
    int numCourses = Character.getNumericValue(sc.nextLine().charAt(0));
    int numRooms = Character.getNumericValue(sc.nextLine().charAt(0));

    String[][] big_string = new String[numCourses][numRooms];
    //System.out.println(sc.nextInt());
    //int numCourses = sc.nextInt();
    //int numRooms = sc.nextInt();

    // if(sc.hasNextInt()){
    //   System.out.println("has next int");
    // }else System.out.println("does not");
    for(int i = 0; i < numCourses; i++){
      Scanner sc_line_by = new Scanner(sc.nextLine());
      sc_line_by.next();

      while(sc_line_by.hasNext()){
        //string_Test = sc.next();
        System.out.println("next is:" + sc_line_by.next());
        //if(string_Test == "\n") break;
      }
    }

    //List<ArrayList<int>> full_list = new ArrayList<ArrayList<int>>();
    // ArrayList<Integer>[] course = new ArrayList[numCourses];
    //
    // String curr_line;
    //
    // for (int i = 0; i < numCourses; i++) {
    //   course[i] = new ArrayList<Integer>();
    // }
    // //int[] course_arr = new int[numCourses];
    //
    // System.out.println("numCourses :" + numCourses);
    // System.out.println("numRooms : " +numRooms);
    //
    // //curr_line = sc.nextLine();
    //
    // //System.out.println("currline character 2: " + curr_line.charAt(1));
    // for(int i = 0; i < numCourses; i++){
    //   curr_line = sc.nextLine();
    //   for(int j = 5; j < curr_line.length(); j+=3){
    //     course[i].add(Character.getNumericValue(curr_line.charAt(j)));
    //     //System.out.println(course[0].get(0));
    //   }
    // }
    //
    // for (int i = 0; i < numCourses; i++) {
    //   for (int j = 0; j < course[i].size(); j++) {
    //     System.out.print(course[i].get(j) + " ");
    //   }
    //   System.out.println();
    // }

  }
}

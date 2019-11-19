import java.util.Scanner;

public class cmsc401{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int numCourses = sc.nextLine();
    int numRooms = sc.nextInt();

    String curr_line;

    int[] course_arr = new int[numCourses];

    for(int i = 0; i < numCourses; i++){
      //course_arr[i] = sc.nextInt();
      //System.out.println("course_arr[" + i + "] = " + course_arr[i]);
      curr_line = sc.Line();
      System.out.println(curr_line);
    }
  }
}

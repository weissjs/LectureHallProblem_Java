import java.util.Scanner;

public class cmsc401{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int numCourses = sc.nextInt();
    int numRooms = sc.nextInt();

    int[] course_arr = new int[numCourses];

    for(int i = 0; i < numCourses; i++){
      //course_arr[i] = sc.nextInt();
      //System.out.println("course_arr[" + i + "] = " + course_arr[i]);
      //System.out.println(sc.next().charAt(0));
      System.out.println((sc.nextLine()).length());
    }
  }
}

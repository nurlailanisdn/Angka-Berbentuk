import java.util.*;

public class Main {
    public static void main(String[] args) {
      for(int i = 1; i <= 5; i++){
        for(int j = 1; j <= i; j++){
          System.out.print(j);
        }
        for(int k = 1; k <= 2*(5-i)-1; k++){
          System.out.print(" ");
        }
        for(int j = i; j>=1; j--){
          if (j==5) continue;
          System.out.print(j);
        }
        System.out.println();
      }
      for(int i = 1; i <= 4; i++){
        for(int j = 1; j <= 4-i+1; j++){
          System.out.print(j);
        }
        for(int k = 1; k <= (2*i)-1; k++){
          System.out.print(" ");
        }
        for(int j = 4-i+1; j>=1;j--){
          System.out.print(j);
        }
        System.out.println();
      }
  }
}
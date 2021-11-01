package com.company;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> nums = new ArrayList<>();
        System.out.println("Enter number of columns");
        int inputcolumn = input.nextInt();
        System.out.println("Enter number of rows");
        int inputrows = input.nextInt();
        int count = 1;
        for(int i = 0; i < inputcolumn; i++){
            nums.add(new ArrayList<>());
            for(int j = 0; j < inputrows; j++){
                nums.get(i).add(count);
                System.out.print(nums.get(i).get(j)+" ");
                count++;
            }
            System.out.println();
        }
    }
}

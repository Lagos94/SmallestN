/*By Juan Lagos
* CSC 201
* Professor Tanes Kanchanawanchai
* Assignment 5 Chapter 5
* Computer Configuration
* Due Date: 09/10/17*/
public class SmallestN {
    public static void main(String[] args) {
        int n = 0;
        while (n*n <= 12000) {
            n++;
        }
        System.out.println(n + " is lowest.");
        System.out.println(n*n + " is greater.");
    }
}

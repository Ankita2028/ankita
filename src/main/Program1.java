package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Program1 {
    public static void main(String[] args)throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
       int n=Integer.parseInt(br.readLine());
        User[] users = new User[n];
        for(int i=0;i<n;i++){
            users[i]=new User(br.readLine(),
                    br.readLine(),
                    br.readLine(),
                    Integer.parseInt(br.readLine()),
                    br.readLine(),
                    Integer.parseInt(br.readLine()),
                    Integer.parseInt(br.readLine()),
                    br.readLine());
        }
        for(int i=0;i<n;i++){
            System.out.println(users[i].toString());
        }
    }
}

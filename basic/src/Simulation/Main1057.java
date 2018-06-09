package Simulation;
import java.io.*;
import java.util.*;
public class Main1057 {
	
	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st=null;
		
		st=new StringTokenizer(br.readLine());
		int N=Integer.parseInt(st.nextToken());
		int A=Integer.parseInt(st.nextToken());
		int B=Integer.parseInt(st.nextToken());
		
		int round=0;
		
		while(A!=B){
			A=(A+1)/2;
			B=(B+1)/2;
			round++;
		}
		System.out.println(round);
	}
}
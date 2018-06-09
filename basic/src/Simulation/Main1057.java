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

		if(A>B){
			int temp=A;
			B=A;
			A=temp;
		}
		
		int round=1;
		
		if(N<A || N<B){
			System.out.println(-1);
		}else{
			while(A!=B){
				//System.out.println(A+" "+B);
//				if(B%2==0 && A+1==B){
//					break;
//				}else{
//					A=(A%2==0 ? A/2 : (A+1)/2);
//					B=(B%2==0 ? B/2 : (B+1)/2);
//				}
//				round++;
				A=(A%2==0 ? A/2 : (A+1)/2);
				B=(B%2==0 ? B/2 : (B+1)/2);
				round++;
			}
			System.out.println(round);
		}
	}
}
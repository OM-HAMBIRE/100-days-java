import java.util.Scanner;
import java.io.*;

//day 72/100
public class EditorString_72 
{
	
	
		public static void main (String[] args) throws java.lang.Exception
		{	Scanner sc = new Scanner(System.in);

        //input queries count
        int q = Integer.valueOf(sc.nextLine());
        
    
        StringBuilder string = new StringBuilder("");
        while(q >0 && sc.hasNext()){
            //next query
            String[] queryArr;
            String query;
            query = sc.nextLine();


            //query array
            queryArr = query.split(" ");


            switch(queryArr[0]){
                case "+":
                    if(string.length()==0){
                        string.append(queryArr[2]);
                    } else if(queryArr[1]=="0"){
                        string.insert(0, queryArr[2]);
                    } else {
                        string.insert(Integer.valueOf(queryArr[1]), queryArr[2]);
                    }
                    break;
                case "?":
                    if(queryArr[1]=="0"){
                        System.out.println(string.substring(0,string.length()));
                    } else {
                        System.out.println(string.substring(Integer.valueOf(queryArr[1])-1, Integer.valueOf(queryArr[1])+Integer.valueOf(queryArr[2])-1));
                    }
                    break;
            }
            q--;
        }	
	}
}

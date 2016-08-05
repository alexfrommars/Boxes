/**
 File: Boxes.java

 Description:

 Student Name: Alexandra K. Scott

 Student UT EID:aks2936

 Partner Name: Travis P. Driver

 Partner UT EID:tpd399

 Course Name: CS 312

 Unique Number: 58705

 Date Created:07/30/016

 Date Last Modified:08/01/2016
 */
    import java.io.*;
    import java.util.*;
    //import java,util.Arrays;

public class Boxes 
{

    public static void main(String[] args) throws IOException
     {
        
        Scanner input = new Scanner(new File("src/boxes.txt"));

        

        
            int num = input.nextInt();
            input.nextLine();

            ArrayList<Integer[]> list = new ArrayList<Integer[]>();
            while (input.hasNextLine()) 
            {
                String [] line = input.nextLine().split("\\s+");
                Integer [] toint = new Integer[line.length];
                for(int i = 0; i < line.length; i++)//.length for arrays and .size for arraylists
                {
                    toint[i]= Integer.parseInt(line[i]);
                }
                Arrays.sort(line);
                list.add(toint);
                 

             }
              
        

            ArrayList<Integer[]> sortedlist = new ArrayList<Integer[]>();

            while (list.size()!=0)
                {
                    Integer [] thisbox = new Integer[]{0,0,0};
                    for (Integer [] i : list)
                    {
                        if(isbigger(i,thisbox))
                        {
                          thisbox = i;
                        }
                    }
                    sortedlist.add(thisbox);
                    list.remove(thisbox);
                }           
                for(Integer [] arr : sortedlist)//quick way to print array lists
                {
                    System.out.println(Arrays.toString(arr));
                }
                
                int sizeoflargestsubset = 0;
        
    }
        
        public static boolean isbigger(Integer [] a, Integer [] b)//is greater than or equal to.
            {
                if(a[2]>b[2])
                {
                    return true;
                }
                else if(a[2]==b[2])
                {
                    if(a[1]>b[1])
                    {
                        return true;
                    }
                    else if (a[0]==b[0])
                    {
                        return true;
                    }
                    else
                    {
                        return false;
                    }   
                }
                else
                {
                    return false;
                }
                
            }
        public static boolean CanNest(Integer [] arr1, Integer [] arr2)
        {
            if (arr2[0]>arr1[0] && arr2[1]>arr1[1] && arr2[2]>arr1[2])
            {
                return true;
            }
        else
            {
                return false;
            }
        }
}


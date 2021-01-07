package javaapplication1;
import java.util.Scanner;

public class Game_Of_Life {
    public static void main(String[] args)
    {
        System.out.println("Enter the element values(ROW WISE)(2x2) :");
        Scanner sc=new Scanner(System.in);
        int[][] input_matrix= new int[4][4];
        
        for(int i=1;i<3;i++)
        {
            for(int j=1;j<3;j++)
            {
                input_matrix[i][j]=sc.nextInt();
                while((input_matrix[i][j]<0||input_matrix[i][j]>1))// Making sure the input is valid.
                {
                    System.out.println("The input can be a '0' OR a '1'. Enter Again!");
                    input_matrix[i][j]=sc.nextInt();
                }
            }
        }
        System.out.println();
        System.out.println("THE INPUT MATRIX IS :");
        for(int i=1;i<3;i++)
        {
            for(int j=1;j<3;j++)
            {
                System.out.print(input_matrix[i][j]+"  ");
            }
            System.out.println();
            System.out.println();
        }
        
        int population=0;
//        int u=m*n;
        int final_matrix[][]=new int[4][4];
        for(int i=1;i<3;i++)
        {
            for(int j=1;j<3;j++)
            {
                population=0;
                for(int k=i-1;k<i+2;k++)
                {
                    for(int l=j-1;l<j+2;l++)
                    {
                        if(k==i && l==j)
                        {
                            continue;
                        }
                        else
                        {
                            if(input_matrix[k][l]==1)
                            {
                                population++;
                            }
                        }
                    }
                }
                if(input_matrix[i][j]==0)
                {
                    if(population==3)
                    {
                        final_matrix[i][j]=1;
                    }
                }
                else
                {
                    if(population<2)
                    {
                        final_matrix[i][j]=0;
                    }
                    else if(population==2 || population==3)
                        {
                            final_matrix[i][j]=1;
                        }
                    else if(population>3)
                        {
                            final_matrix[i][j]=0;
                        }
                }
            }
        }
        System.out.println("THE OUTPUT MATRIX WOULD BE :");
        for(int i=1;i<3;i++)
        {
            for(int j=1;j<3;j++)
            {
                System.out.print(final_matrix[i][j]+"  ");
            }
            System.out.println();//Row Spacing
            System.out.println();//Row spacing
        }
    }
}
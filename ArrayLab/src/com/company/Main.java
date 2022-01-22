package com.company;

public class Main {

    public static void main(String[] args) {
        int [] C = new int[30];
        int random_number;
        for(int i=0;i<C.length;i++)
        {
            random_number = 0 + (int)(Math.random() * 21);
            C[i] = random_number;
            System.out.print("" +  C[i] + " ");
        }

        System.out.println("");

        int i, j, step;
        int tmp;
        for (step = C.length / 2; step > 0; step /= 2)
            for (i = step; i < C.length; i++)
            {
                tmp = C[i];
                for (j = i; j >= step; j -= step)
                {
                    if (tmp < C[j - step])
                        C[j] = C[j - step];
                    else
                        break;
                }
                C[j] = tmp;
            }

        for(i=0;i<C.length;i++)
        {
            System.out.print("" +  C[i] + " ");
        }

        System.out.println("\n");

        float sum=0;

        for(i=0;i<C.length;i++)
            sum+=C[i];
        System.out.println("Сумма: " +  sum);
        System.out.println("Среднее значение: " +  sum / C.length);


    }
}

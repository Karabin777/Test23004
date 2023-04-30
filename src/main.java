import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        int c;

        Scanner sc = new Scanner(System.in);
        System.out.println("Sayirlari daxil edin");

            a=sc.nextInt();
        System.out.println("1ci sayini daxil edin");

            b =sc.nextInt();
        System.out.println("ikinci sayini daxil edin");

            c=sc.nextInt();
        System.out.println("Üçünçü sayini daxil edin");


            if(a<b && a<c) {
                if (b < c) {
                    System.out.println("a<b<c");
                } else {
                    System.out.println("a<c<b");
                }

            }else if(b<a && b<c) {
                if (a < c) {
                    System.out.println("b<a<c");
                }else{
                    System.out.println("b<c<a");
                }
            } else if (c<a && (c<b)) {
                if(b<a) {
                    System.out.println("c<b<a");
                }else{
                    System.out.println("c<a<b");




            }
    }




            }



    }

public class Main {
    public static void main(String[] args){

        //task 1
        for(int i = 500; i <= 650; i = i + 10){
            //System.out.println(i);
        }
        int x = 500;
        int c = 650;
        while (x < c){
            x = x + 10;
            ///System.out.println(x);
        }
        int v = 500;
        do {
            //System.out.println(v);
            v = v + 10;
         }while (v <= c);


        //task 2
        int a = 2;
        while (2*a-1 < 5000){
            //System.out.println(a);
            a = 2*a-1;
        }


        //task 3
        int p = 10;
        int l = 1;
        while (l <= p){
            l++;
            if(p % l == 0){
                //System.out.println(l);
            }
        }


        //task 4
        int m = 1;
        for(int g = 1;g <= p;g++){
            m *= g;
            ///System.out.println(m);
        }
        int y = 1;
        int d = 1;

        while (d < 10) {
            d++;
            y *= d;
        }
        //System.out.println(y);


        //task 5

    }
}

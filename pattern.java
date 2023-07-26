import java.lang.Math;

class Crown{
    static void gap(int x){
        System.out.print(" ");
        if(x==0)
            return;
        gap(x-1);
    }
    static void draw(){
        for(int i=0; i<5; i++){
            gap(80);
            for(int j=0; j<5-i; j++)
                System.out.print(" ");
            for(int z=0; z<=i*2-1; z++)
                System.out.print("&");
            System.out.println();
        }
        for(int i=0; i<2; i++){
            gap(80);
            for(int j=0; j<10; j++)
                System.out.print("&");
        System.out.println(" ");
        }
        for(int i=0; i<10; i++){
            gap(70);
            for(int j=0; j<10-i; j++)
            System.out.print(" ");
        for(int z=0; z<=9+2*i; z++)
            System.out.print("&");
        System.out.println();
        }
    }
}
class Head{
    static void gap(int b){
        for(int i=0; i<b; i++)
            System.out.print(" ");
    }
    static void rect(int s){
        System.out.print(" ");
        for(int i=0; i<s; i++){
                System.out.print("@");
        }
    }
    static void eyes(){
        System.out.print(" ");
        for(int g=0; g<7; g++)
                    System.out.print("@");
                for(int q=0; q<7; q++)
                    System.out.print("^");
                for(int l=0; l<11; l++)
                    System.out.print("@");
                for(int q=0; q<7; q++)
                    System.out.print("^");
                for(int g=0; g<6; g++)
                    System.out.print("@");
    }
    static void draw(){
        int a = 20;
        for(int i=0; i<a; i++){
            Head.gap(45);
            for(int z=0; z<=i; z++)
                System.out.print(" ");
            for(int j=0;j<a-i;j++)
                System.out.print("@");
            if(i>=0&&i<4){
                for(int x=0; x<4-i; x++)
                    System.out.print(" ");
                rect(38-2*(4-i));
                for(int h=0; h<4-i; h++)
                    System.out.print(" ");
            }
            else if(i==7){
                eyes();
            }
            else if(i>=17&&i<=19){
                for(int l=3-(20-i); l>=0; l--)
                    System.out.print(" ");
                rect(36-2*(3-(20-i)));
                for(int v=3-(20-i); v>=0; v--)
                    System.out.print(" ");
            }
            else
                rect(38);
            System.out.print(" ");
            for(int k=0; k<a-i; k++)
                System.out.print("@");
            System.out.println("");
        }
    }
}

class Trunk{
    static void gap(int a){
        for(int i=0; i<a; i++)
            System.out.print(" ");
    }
    static void tooth(){
        for(int i=0; i<=7; i++){
            if(i<=3){
                if(i>2)
                    Trunk.gap(70-(int)Math.pow(-1,i));
                else
                    Trunk.gap(70);
            for(int h=0; h<9-i; h++)
                System.out.print("#");
            for(int x=1; x<i; x++)
                System.out.print(" ");
            System.out.print(" ");
            }

            else    
                Trunk.gap(80);

            for(int x=0; x<=2; x++)
                System.out.print("\\???");
            System.out.print(" ");
            if(i>2){
            for(int k=0; k<(int)Math.pow(-1,i); k++)
                System.out.print(" ");
            }
            for(int k=0; k<i; k++)
                System.out.print(" ");
            for(int j=0; j<9-i; j++)
                System.out.print("#");
            System.out.println("");
            /*for(int j=0; j<=i; j++)*/
                //System.out.print("");
        }
    }
    static void draw(){
        Trunk.tooth();
        for(int i=1; i<=2; i++){
            Trunk.gap(80);
            for(int j=0; j<Math.sin(i*Math.PI/2); j++)
                System.out.print(" ");
            for(int j=0; j<=2; j++)
                System.out.print("\\???");
            System.out.println();
        }
        for(int j=0; j<6; j++){
            Trunk.gap(80);
            for(int i=0; i<Math.pow(j,2); i++)
                System.out.print(" ");
            for(int z=0; z<=2; z++)
                System.out.print("\\???");
            if(j>=3&&j<5){
                for(int i=0; i<6-j; i++)
                    System.out.print("  ");
                for(int z=0; z<=2; z++)
                    System.out.print("\\???");
            }
            System.out.println();
        }
    }
}

public class pattern{
    public static void main(String args[]){
        Crown.draw();
        Head.draw();
        Trunk.draw();
    }
}
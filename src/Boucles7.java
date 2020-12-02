public class Boucles7 {
    public  static void main(String[]args)
    {
        int i = 200;

        while (i>0){
            System.out.println("C'est presque bon " + i +"pas");
            if(i<=8)
            {
                System.out.println("Enfin!!");
            }
            i-=12;
        }
    }
}

public class decisao{

    public static void main(String[] args) {
        Scanner leitor =  new Scanner(System.in);
        System.out.println("Digite um número:");
        int x = leitor.nextInt();
        if(x >0){
            System.out.println("x é positivo!");
         }else if(x < 0){
            System.out.println("x é negativo!");
        }else{
            System.out.printl("x é zero!")
        }

    }
}


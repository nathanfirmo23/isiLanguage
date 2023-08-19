import java.util.Scanner;
public class MainClass{
	public static void main(String args[]){
	Scanner _key = new Scanner(System.in);
int a,b,c,d,e,f;
System.out.println("Testando simbolos");
System.out.println("#, $, %, &, *, (, ), _, +");
System.out.println("Programa Teste");
System.out.println("Digite a valor 2");
a= _key.nextInt();
System.out.println("Digite b valor 1");
b= _key.nextInt();
if (a<b) {
 System.out.println("Errado pois b menor que a");
}
else {
System.out.println("condicional if correto");
}
System.out.println("Multiplicando constantes  5 vezes 2");
c=5*2;
System.out.println(c);
System.out.println("Multiplicando variaveis a vezes b");
d=a*b;
System.out.println(d);
e=0;
f=0;
do {
System.out.println("Valor de e até 3");
e=e+1;
} while (e<3);
while (f<3) {
 System.out.println("Valor de f até 3");
f=f+1;
}
	}}

import java.util.Scanner;
public class AvaliaçãoCone {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		double raio,areatotal,geratriz,fundocone,lateralcone,cobertura,capaclata,geratriz1,quantlitrostinta;
		int latastotal;
		System.out.println("Digite o raio do cone a ser pintado: ");
		raio =entrada.nextFloat();
		System.out.println("Digite o altura do cone a ser pintado: ");
		float altura =entrada.nextFloat();
		System.out.println("Escolha o tipo de tinta que você quer? 1-Tinta Clase1, 2-Tinta Classe2,3-Tinta Classe3");
		int tinta=entrada.nextInt();
		geratriz=((raio*raio)+(altura*altura));
		geratriz1=Math.sqrt(geratriz);
		areatotal= (3.14*raio*(raio+geratriz1));
		fundocone=(3.14*(raio*raio));
		lateralcone=(3.14*raio*geratriz1);
		cobertura =(1/ 3.45);
		capaclata = 18;
		double preçodalata1 = 238.90;
		double preçolata2 = 467.98;
		double preçolata3 = 758.34;
		double valortotallatas=0;
		
		if (tinta== 1)	 {
		quantlitrostinta = (areatotal/cobertura);
		latastotal = (int) ((int) (quantlitrostinta/capaclata));
			if (quantlitrostinta%capaclata != 0) 
			latastotal +=1;
			valortotallatas = (latastotal*preçodalata1);	
		}
		else if (tinta==2) {
		quantlitrostinta = (areatotal/cobertura);
		latastotal = (int) ((int) (quantlitrostinta/capaclata));
			if (quantlitrostinta%capaclata != 0) 
			latastotal +=1;
			valortotallatas = (latastotal*preçolata2);	
		}
		else {
		quantlitrostinta = (areatotal/cobertura);
		latastotal = (int) ((int) (quantlitrostinta/capaclata));
			if (quantlitrostinta%capaclata != 0) 
			latastotal +=1;
			valortotallatas = (latastotal*preçolata3);	
		}
		
			
		System.out.println("A área total do cone é "+areatotal);
		System.out.println("Area de fundo do cone "+fundocone);
		System.out.println("Valor da geratriz: "+geratriz1);
		System.out.println("Area lateral do cone "+lateralcone);
		System.out.println("A quantidade de litros de tinta necessária é "+quantlitrostinta);
		System.out.println("Quantidade de latas utilizadas "+latastotal);
		System.out.println("Valor total "+valortotallatas+ " usando a tinta "+ tinta);
		entrada.close();
		}
	
	}
	
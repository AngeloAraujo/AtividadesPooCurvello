import java.util.Scanner;
public class Avalia��oCone {

	public static void main(String[] args) {
		Scanner entrada=new Scanner (System.in);
		double raio,areatotal,geratriz,fundocone,lateralcone,cobertura,capaclata,geratriz1,quantlitrostinta;
		int latastotal;
		System.out.println("Digite o raio do cone a ser pintado: ");
		raio =entrada.nextFloat();
		System.out.println("Digite o altura do cone a ser pintado: ");
		float altura =entrada.nextFloat();
		System.out.println("Escolha o tipo de tinta que voc� quer? 1-Tinta Clase1, 2-Tinta Classe2,3-Tinta Classe3");
		int tinta=entrada.nextInt();
		geratriz=((raio*raio)+(altura*altura));
		geratriz1=Math.sqrt(geratriz);
		areatotal= (3.14*raio*(raio+geratriz1));
		fundocone=(3.14*(raio*raio));
		lateralcone=(3.14*raio*geratriz1);
		cobertura =(1/ 3.45);
		capaclata = 18;
		double pre�odalata1 = 238.90;
		double pre�olata2 = 467.98;
		double pre�olata3 = 758.34;
		double valortotallatas=0;
		
		if (tinta== 1)	 {
		quantlitrostinta = (areatotal/cobertura);
		latastotal = (int) ((int) (quantlitrostinta/capaclata));
			if (quantlitrostinta%capaclata != 0) 
			latastotal +=1;
			valortotallatas = (latastotal*pre�odalata1);	
		}
		else if (tinta==2) {
		quantlitrostinta = (areatotal/cobertura);
		latastotal = (int) ((int) (quantlitrostinta/capaclata));
			if (quantlitrostinta%capaclata != 0) 
			latastotal +=1;
			valortotallatas = (latastotal*pre�olata2);	
		}
		else {
		quantlitrostinta = (areatotal/cobertura);
		latastotal = (int) ((int) (quantlitrostinta/capaclata));
			if (quantlitrostinta%capaclata != 0) 
			latastotal +=1;
			valortotallatas = (latastotal*pre�olata3);	
		}
		
			
		System.out.println("A �rea total do cone � "+areatotal);
		System.out.println("Area de fundo do cone "+fundocone);
		System.out.println("Valor da geratriz: "+geratriz1);
		System.out.println("Area lateral do cone "+lateralcone);
		System.out.println("A quantidade de litros de tinta necess�ria � "+quantlitrostinta);
		System.out.println("Quantidade de latas utilizadas "+latastotal);
		System.out.println("Valor total "+valortotallatas+ " usando a tinta "+ tinta);
		entrada.close();
		}
	
	}
	

import java.util.Scanner;


public class Humano extends Jogador{

    public Scanner entrada = new Scanner(System.in);
    
    public Humano(int jogador){
        super(jogador);
        this.jogador = jogador;
        //System.out.println("Jogador 'Humano' criado!");
    }
    
    @Override
    public void jogar(Tabuleiro tabuleiro){
        Tentativa(tabuleiro);
        tabuleiro.setPosicao(tentativa, jogador);
    }
    
    @Override
    public void Tentativa(Tabuleiro tabuleiro){
        do{
            do{
                System.out.print("Linha: ");
                tentativa[0] = entrada.nextInt();
                
                if(tentativa[0] > 3 ||tentativa[0] < 1) System.out.println("A linha só pode ser 1, 2 ou 3");
                
            } while(tentativa[0] > 3 ||tentativa[0] < 1);
            
            do{
                System.out.print("Coluna: ");
                tentativa[1] = entrada.nextInt();
                
                if(tentativa[1] > 3 ||tentativa[1] < 1) System.out.println("A linha só pode ser 1, 2 ou 3");
                
            }while(tentativa[1] > 3 ||tentativa[1] < 1);
            
            tentativa[0]--; 
            tentativa[1]--;
            
            if(!verificarTentativa(tentativa, tabuleiro))
                System.out.println("Posição Já Preenchida!");
        } while(!verificarTentativa(tentativa, tabuleiro));
    }
}


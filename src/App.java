import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("É sua estreia no profissional do ");
                Scanner scanner = new Scanner(System.in);
                
                String time = scanner.next();
                
                System.out.println("É sua estreia no profissional do " + time + " com a camisa");
                
                
                int num = scanner.nextInt();
                
                System.out.println("É sua estreia no profissional do " + time + " com a camisa " + num + " no minuto 34 do segundo tempo, o jogo está empatado em 2x2.");
                System.out.println("no minuto 38 seu companheiro carlos faz um passe enfiado te deixando na entrada da grande área, prontamente o zagueiro do time adversário se aproxima, o que você deve fazer?"
                );
                System.out.println("digite 1- tentar driblar o zagueiro aplicando um elástico e em seguida correr para dentro da área.\r\n" + //
                        "\r\n" + //
                        "digite 2- Dá um toque na bola para a direita tirando do zagueiro e chutar colocado fora de área.\r\n" + //
                        "\r\n" + //
                        "digite 3- passar a bola de volta pro companheiro.\r\n" + //
                        "");
                
                int op = scanner.nextInt();
                if(op == 1){
                    System.out.println("você consegue driblar o zagueiro e corre para a área, ao olhar para direita percebe que um companheiro está entrando na área levantando o braço pedindo a bola, o que será seu próximo passo?" + //
                            "");
                    System.out.println("\r\n" + //
                            "digite 1-  prontamente passa a bola para o companheiro\r\n" + //
                            "digite 2- ignorar o companheiro e chutar para o gol\r\n" + //
                            "");
                    
                    int op1 = scanner.nextInt();
                    if( op1 == 1){
                        System.out.println("rapidamente você faz o passe para seu companheiro que logo se prepara para receber, porém o zagueiro adversário aparece interrompendo o passe e dando um chutão para seu lado de ataque. passa alguns minutos o árbitro encerra o jogo terminado em 2x2\r\n" + //
                                "\r\n" + //
                                "");
                    }
                    if(op1 == 2){
                        System.out.println("gnorar o companheiro e chutar para o gol,você enche o pé buscando tirar a bola do goleiro, a bola viaja rapidamente mas acaba indo por cima da trave, é apenas tiro de meta para os adversários. passa alguns minutos o árbitro encerra o jogo terminado em 2x2\r\n" + //
                                "");
                    }
                if (op == 2) {
                    System.out.println("você enche o pé chutando a bola colocada, porém calcula errado e a bola viaja alto pelo estádio, é apenas tiro de meta para os adversários.passa alguns minutos o árbitro encerra o jogo terminado em 2x2.\r\n" + //
                            "");
                    
                } 
                if (op == 3){
                    System.out.println("você faz o passe para o companheiro que vem pela lateral esquerda, \r\n" + //
                    "ao conseguir com sucesso realizar o passe o que será seu próximo passo?\r\n" + //
                    "1- correr para a pequena área e sinalizar para receber o cruzamento.\r\n" + //
                            "\t2 - fica fora da área para se livrar da marcação.\r\n" + //
                            "");
                    int op2 = scanner.nextInt();
                    if (op2== 1){
                        System.out.println("você corre para pequena area levantando um braço pedindo cruzamento, prontamente seu companheiro cruza, você  salta no momento certo e cabeceia com precisão, marcando o gol. Todos festejam e após alguns minutos o jogo acaba lhe consagrando herói.\r\n" + //
                                "");
                    }
                    if (op2 == 2){
                        System.out.println("você se livra da marcação e pede a bola fora da area, porem seu companheiro não consegue realizar o passe e o time adversário rouba a bola, passa alguns minutos o árbitro encerra o jogo terminado em 2x2\r\n" + //
                                "");
                    }
                    scanner.close();
                }
    }
}
}

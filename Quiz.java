import java.util.Scanner;

//Quiz
public class Quiz {

    public static void main(String[] args) {
        long clockstart = System.currentTimeMillis();
        int contador = 0;
        cabecalho();
        String name;
        Scanner n = new Scanner(System.in);
        System.out.println("Mas primeito informe seu nome: ");
        name = n.nextLine();
        System.out.println("Tenha um ótimo Quiz " + name + " !");

        //Questão 1
        Questao qst1 = new Questao();
        qst1.pergunta = "1 - Qual das seguintes características NÃO é associada à memória SRAM?";
        qst1.opcaoA = "A) Alta velocidade de acesso. ";
        qst1.opcaoB = "B) Baixo consumo de energia. ";
        qst1.opcaoC = "C) Alto custo em relação a DRAM. ";
        qst1.opcaoD = "D) Utilização em memórias cache. ";
        qst1.opcaoE = "E) Maior densidade de armazenamento em relação a DRAM. ";
        qst1.correta = "E";

        //Questão 2
        Questao qst2 = new Questao();
        qst2.pergunta = "2 - Qual tipo de memória é utilizada como cache na maioria das CPUs modernas?";
        qst2.opcaoA = "A) SRAM. ";
        qst2.opcaoB = "B) DRAM. ";
        qst2.opcaoC = "C) ROM. ";
        qst2.opcaoD = "D) EEPROM. ";
        qst2.opcaoE = "E) Flash. ";
        qst2.correta = "A";

        //Questão 3
        Questao qst3 = new Questao();
        qst3.pergunta = "3 - Qual a função do barramento de endereços em um computador?";
        qst3.opcaoA = "A) Transportar dados entre os componentes. ";
        qst3.opcaoB = "B) Regular o fluxo de dados e controlar as operações do barramento. ";
        qst3.opcaoC = "C) Definir o local na memória onde os dados serão armazenados ou recuperados. ";
        qst3.opcaoD = "D) Armazenar dados e instruções que são frequentemente acessados pela CPU. ";
        qst3.opcaoE = "E) Nenhuma das alternativas acima. ";
        qst3.correta = "C";

        //Questão 4
        Questao qst4 = new Questao();
        qst4.pergunta = "4 - Qual dos seguintes dispositivos NÃO é um dispositivo de entrada? ";
        qst4.opcaoA = "A) Impressora.";
        qst4.opcaoB = "B) Teclado.";
        qst4.opcaoC = "C) Mouse.";
        qst4.opcaoD = "D) Scanner.";
        qst4.opcaoE = "E) Controle.";
        qst4.correta = "A";

        //Questão 5
        Questao qst5 = new Questao();
        qst5.pergunta = "Qual a principal vantagem de um SSD em relação a um HD tradicional?. ";
        qst5.opcaoA = "A) Menor capacidade de armazenamento. ";
        qst5.opcaoB = "B) Maior consumo de energia. ";
        qst5.opcaoC = "C) Maior velocidade de leitura e escrita. ";
        qst5.opcaoD = "D) Maior fragilidade e suscetibilidade a danos. ";
        qst5.opcaoE = "E) Menor custo de produção.";
        qst5.correta = "C";

        //Questão 6
        Questao qst6 = new Questao();
        qst6.pergunta = "6 - Qual a função principal da memória cache? ";
        qst6.opcaoA = "A) Armazenar o sistema operacional.";
        qst6.opcaoB = "B) Aumentar a capacidade de armazenamento do computador. ";
        qst6.opcaoC = "C) Reduzir o tempo de acesso à memória principal.  ";
        qst6.opcaoD = "D) Gerenciar a comunicação entre o processador e a placa de vídeo. ";
        qst6.opcaoE = "E) Controlar a temperatura do processador. ";
        qst6.correta = "C";

        //Questão 7
        Questao qst7 = new Questao();
        qst7.pergunta = "7 - Qual a função principal da CPU?";
        qst7.opcaoA = "A) Armazenar dados e programas.";
        qst7.opcaoB = "B) Controlar o funcionamento do computador.";
        qst7.opcaoC = "C) Mostrar imagens na tela.";
        qst7.opcaoD = "D) Conectar o computador à internet.";
        qst7.opcaoE = "E) Nenhuma das anteriores";
        qst7.correta = "B";

        //Questão 8
        Questao qst8 = new Questao();
        qst8.pergunta = "8 - Qual a diferença entre um núcleo e um thread?";
        qst8.opcaoA = "A) Um núcleo é uma unidade de processamento, enquanto um thread é uma sequência de instruções.";
        qst8.opcaoB = "B) Um núcleo é um programa, enquanto um thread é um arquivo. ";
        qst8.opcaoC = "C) Um núcleo é um componente físico, enquanto um thread é um componente virtual.";
        qst8.opcaoD = "D) Não existe diferença entre núcleo e thread.";
        qst8.opcaoE = "E) Todas as alternativas estão corretas.";
        qst8.correta = "A";

        //Questão 9
        Questao qst9 = new Questao();
        qst9.pergunta = "9 - O que significa overclock?";
        qst9.opcaoA = "A) Formatar o disco rígido. ";
        qst9.opcaoB = "B) Diminuir a velocidade da CPU. ";
        qst9.opcaoC = "C) Fazer a CPU funcionar além de sua velocidade normal.";
        qst9.opcaoD = "D) Aumentar a velocidade da CPU.";
        qst9.opcaoE = "E) Instalar um novo sistema operacional.";
        qst9.correta = "D";

        //Questão 10
        Questao qst10 = new Questao();
        qst10.pergunta = "10 - Qual é a função dos registradores em um processador?";
        qst10.opcaoA = "A) Armazenar grandes quantidades de dados temporariamente.";
        qst10.opcaoB = "B) Controlar o fluxo de dados entre a CPU e dispositivos de E/S.";
        qst10.opcaoC = "C) Armazenar pequenos conjuntos de dados e instruções de forma muito rápida.";
        qst10.opcaoD = "D) Gerenciar a comunicação entre dispositivos externos.";
        qst10.opcaoE = "E) Controlar a velocidade do processador.";
        qst10.correta = "E";

        //Questão 11
        Questao qst11 = new Questao();
        qst11.pergunta = "11 - O que é um buffer?";
        qst11.opcaoA = "A) Um tipo de memória que armazena dados temporariamente.";
        qst11.opcaoB = "B) Um programa que protege o computador de vírus. ";
        qst11.opcaoC = "C) Um componente que controla a velocidade do mouse. ";
        qst11.opcaoD = "D) Um tipo de conexão de internet. ";
        qst11.opcaoE = "E) Uma área de armazenamento temporário para dados que estão sendo transferidos entre dispositivos.";
        qst11.correta = "E";

        //Questão 12
        Questao qst12 = new Questao();
        qst12.pergunta = "12 - O que é um processador multi-core?";
        qst12.opcaoA = "A) Um processador com memória integrada.";
        qst12.opcaoB = "B) Um processador com múltiplos núcleos de execução.";
        qst12.opcaoC = "C) Um processador com uma unidade gráfica dedicada.";
        qst12.opcaoD = "D) Um processador especializado para gráficos.";
        qst12.opcaoE = "E) Um processador que trabalha apenas com dados binários.";
        qst12.correta = "B";

        //Questão 13
        Questao qst13 = new Questao();
        qst13.pergunta = "13 - O que caracteriza uma memória externa?";
        qst13.opcaoA = "A) É volátil e acessada diretamente pelo processador.";
        qst13.opcaoB = "B) Armazena dados temporários enquanto o computador está ligado.";
        qst13.opcaoC = "C) Usa meios magnéticos ou ópticos externos à CPU para armazenamento.";
        qst13.opcaoD = "D) Tem uma capacidade limitada e alta velocidade de acesso.";
        qst13.opcaoE = "E) É integrada diretamente à placa-mãe.";
        qst13.correta = "C";

        //Questão 14
        Questao qst14 = new Questao();
        qst14.pergunta = "14 - O que caracteriza um barramento de sistema?";
        qst14.opcaoA = "A) É um caminho de comunicação entre componentes de hardware.";
        qst14.opcaoB = "B) É uma unidade de armazenamento temporária dentro do processador.";
        qst14.opcaoC = "C) Controla a velocidade de processamento do computador.";
        qst14.opcaoD = "D) É uma interface gráfica que controla o vídeo.";
        qst14.opcaoE = "E) Faz a leitura e gravação de dados em discos magnéticos.";
        qst14.correta = "A";

        //Questão 15
        Questao qst15 = new Questao();
        qst15.pergunta = "15 - O que são registradores de propósito geral?";
        qst15.opcaoA = "A) Registradores usados para tarefas específicas como controle de interrupções.";
        qst15.opcaoB = "B) Registradores que armazenam dados temporários durante a execução de instruções.";
        qst15.opcaoC = "C) Barramentos dedicados ao transporte de dados para dispositivos de E/S.";
        qst15.opcaoD = "D) Memórias de armazenamento secundário conectadas à CPU.";
        qst15.opcaoE = "E) Componentes que armazenam dados não voláteis.";
        qst15.correta = "B";

        //Escrevendo as questões

        qst1.escrevaQuestao();
        if(qst1.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst2.escrevaQuestao();
        if(qst2.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst3.escrevaQuestao();
        if(qst3.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst4.escrevaQuestao();
        if(qst4.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst5.escrevaQuestao();
        if(qst5.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst6.escrevaQuestao();
        if(qst6.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst7.escrevaQuestao();
        if(qst7.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst8.escrevaQuestao();
        if(qst8.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst9.escrevaQuestao();
        if(qst9.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst10.escrevaQuestao();
        if(qst10.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst11.escrevaQuestao();
        if(qst11.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst12.escrevaQuestao();
        if(qst12.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst13.escrevaQuestao();
        if(qst13.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst14.escrevaQuestao();
        if(qst14.isCorreta()){
            contador++;
        }
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        qst15.escrevaQuestao();
        if(qst15.isCorreta()){
            contador++;
        }
        int erros;
        erros = (15 - contador);
        System.out.println("Total de acertos: " +contador+"/15");
        System.out.println("Total de erros: " + erros);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        long clockend = System.currentTimeMillis();
        System.out.println("Você chegou ao fim do quiz!");
        System.out.println("Você acertou um total de: " +contador+"/15.");
        System.out.println("Você gastou: "+(clockend - clockstart )/1000 + "s");

    }



    // Cabeçalho
        public static void cabecalho() {
            System.out.println("");
            System.out.println(" Centro Universitário Alfredo Nasser ");
            System.out.println("");
            System.out.println("Professor: Breno Pimenta");
            System.out.println("Disciplina: Algoritmos e Programação II");
            System.out.println("Aluno: Israel Felipe Dias");
            System.out.println("");
            System.out.println("------------------------------Bem-vindo ao Quiz!----------------------------------------");
            System.out.println("        Aqui você responderá a 15 questões a respeito da Arquitetura e Organização de Computadores!");
            System.out.println("------------------------------------------------------------------------------");
        }


}



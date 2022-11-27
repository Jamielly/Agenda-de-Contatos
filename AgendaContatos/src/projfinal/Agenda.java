package projfinal;

import java.util.ArrayList;
import java.util.Scanner;

public class Agenda {

	    static ArrayList<Contato> listaContato;
	    
	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        int menuPrograma = 0;

	        listaContato = new ArrayList<>();
	        
	        while(menuPrograma != 6){
	            Label("Agenda de contatods e suas escolhas:");
	            Label("------------------------------------");
	            Label("1 - Inserir novo contato");
	            Label("2 - Buscar um contato existente");
	            Label("3 - Exibir o nome de todos os contatos cadastrados");
	            Label("4 - Atualizar os dados de um contato já existente");
	            Label("5 - Remover contato");
	            Label("6 - Sair");
	            Label("-----------------------------------------");
	            Label("Digite o numero de uma dos opções acima: ");
	            menuPrograma = input.nextInt();

	            while (menuPrograma < 1 || menuPrograma > 6) {
	                Label("Digite uma das opções 1 ao 6: ");
	                menuPrograma = input.nextInt();
	            }
	            
	            if (menuPrograma == 1) {
	                Scanner contato;
	                Contato c = new Contato();
	                Label("Nome: ");
	                contato = new Scanner(System.in);
	                c.setNome(contato.nextLine());
	                
	                Label("Email: ");
	                contato = new Scanner(System.in);
	                c.setEmail(contato.next());
	                
	                Label("Endereço: ");
	                contato = new Scanner(System.in);
	                c.setEndereco(contato.nextLine());
	                
	                Label("Telefone: ");
	                contato = new Scanner(System.in);
	                c.setTelefone(contato.nextInt());
	           
	                InserirContato(c);
	            } else if (menuPrograma == 2) {
	                Label("Qual o NOME do contato que você está procurando: ");
	                Scanner contato = new Scanner(System.in);
	                BuscarContato(contato.nextLine());
	            } else if (menuPrograma == 3) {
	                if(listaContato.isEmpty()){
	                    Label("NÃO EXISTE nenhum contato com este nome na lista de contatos.");
	                }
	                ExibirNomeContatos();
	            } else if (menuPrograma == 4) {
	                Scanner contato;
	                Contato c = new Contato();
	                
	                Label("Nome do contato: ");
	                contato = new Scanner(System.in);
	                c.setNome(contato.nextLine());
	                
	                BuscarContato(c.getNome());
	                
	                for (Contato todos : listaContato){
	                    if (todos.getNome().toUpperCase().equals(c.getNome().toUpperCase())){
	                
	                        Label("Novo email do contato: ");
	                        contato = new Scanner(System.in);
	                        c.setEmail(contato.next());

	                        Label("Novo endereço do contato: ");
	                        contato = new Scanner(System.in);
	                        c.setEndereco(contato.nextLine());

	                        Label("Novo telefone do contato: ");
	                        contato = new Scanner(System.in);
	                        c.setTelefone(contato.nextInt());

	                        Label("Tem certeza que deseja atualizar esse contato? (S/N): ");
	                        Scanner pergunta = new Scanner(System.in);
	                        String resposta = pergunta.nextLine();
	                        while (resposta.equals("S") || resposta.equals("N")) {
	                            Label("Responda 'S' para sim ou 'N' para não.");
	                            resposta = pergunta.nextLine();
	                        }
	                        switch (resposta.toUpperCase()) {
	                            case "S":
	                                AtualizarContato(c);
	                                Label("O contato foi atualizado com sucesso!");
	                                break;
	                            case "N":
	                                Label("A atualização foi cancelada.");
	                                break;
	                        }
	                    }
	                }
	            } else if (menuPrograma == 5) {
	                Scanner contato;
	                Contato c = new Contato();
	                
	                Label("Nome do contato: ");
	                contato = new Scanner(System.in);
	                c.setNome(contato.nextLine());
	                
	                BuscarContato(c.getNome());
	                
	                for (Contato todos : listaContato){
	                    if (todos.getNome().toUpperCase().equals(c.getNome().toUpperCase())){
	                        Label("Tem certeza que deseja remover esse contato? (S/N): ");
	                        Scanner pergunta = new Scanner(System.in);
	                        String resposta = pergunta.nextLine();
	                        while (resposta.equals("S") || resposta.equals("N")) {
	                            Label("Responda 'S' para sim ou 'N' para não.");
	                            resposta = pergunta.nextLine();
	                        }
	                        switch (resposta.toUpperCase()) {
	                            case "S":
	                                RemoverContato(c);
	                                break;
	                            case "N":
	                                Label("A remoção do contato foi cancelada.");
	                                break;
	                        }
	                    }
	                }
	            } else if (menuPrograma == 6) {
	                Label("Tem certeza que deseja sair do programa? (S/N): ");
	                Scanner pergunta = new Scanner(System.in);
	                String resposta = pergunta.nextLine();
	                while (resposta.equals("S") || resposta.equals("N")) {
	                    Label("Responda 'S' para sim ou 'N' para não.");
	                    resposta = pergunta.nextLine();
	                }
	                switch (resposta.toUpperCase()) {
	                    case "S":
	                        ExibirNomeContatos();
	                        Label("Encerrado com sucesso!");
	                        System.exit(0);
	                        break;
	                    case "N":
	                        menuPrograma = 0;
	                        Label("Ação cancelada ---> retornando ao menu principal.");
	                        break;
	                }
	            }
	        }
	    }
	    
	    private static void InserirContato(Contato c) {
	        listaContato.add(c);
	        Label("[Contato adicionado com sucesso]");
	    }

	    private static void BuscarContato(String nome) {
	        int posicao = 0;
	        boolean encontrado = false;
	        for (Contato c : listaContato){
	            posicao++;
	            if (c.getNome().toUpperCase().equals(nome.toUpperCase())){
	                encontrado = true;
	                Label("[[Contato foi encontrado na posição "+posicao+" da lista]");
	                Label("Nome: "+c.getNome());
	                Label("Email: "+c.getEmail());
	                Label("Endereço: "+c.getEndereco());
	                Label("Telefone: "+c.getTelefone());
	              
	            }
	        }
	        if(!encontrado){
	            Label("[Nenhum contato encontrado com o nome '"+nome+"]");
	        }
	    }

	    private static void ExibirNomeContatos() {
	        int posicao = 0;
	        for (Contato c : listaContato){
	            posicao++;
	            Label(posicao+"\t"+c.getNome());
	        }
	    }

	    private static void AtualizarContato(Contato novo) {
	        for (Contato c : listaContato){
	            if (c.getNome().equals(novo.getNome())){
	                c.setEmail(novo.getEmail());
	                c.setEndereco(novo.getEndereco());
	                c.setTelefone(novo.getTelefone());
	            }
	        }
	    }

	    private static void RemoverContato(Contato remover) {
	        if(listaContato.size()==1){
	            listaContato = new ArrayList<>();
	        }else{
	            for(int i = 0; i < listaContato.size(); i++){
	                if (remover.getNome().equals(listaContato.get(i).getNome())){
	                    listaContato.remove(i);
	                }
	            }
	        }
	        Label("Este contato removido com sucesso!!!");
	    }
	    private static void Label(String txt){ //reduz o uso de sysout
	        System.out.println(txt);
	    }
	}

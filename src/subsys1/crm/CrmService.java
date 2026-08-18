package subsys1.crm;

public class CrmService {
    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Gravando cliente: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}


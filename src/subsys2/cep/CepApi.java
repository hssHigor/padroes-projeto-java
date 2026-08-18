package subsys2.cep;

public class CepApi {
    private static CepApi instancia;

    private CepApi() {
    }

    public static CepApi getInstancia() {
        if (instancia == null) {
            instancia = new CepApi();
        }
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "São Paulo";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}


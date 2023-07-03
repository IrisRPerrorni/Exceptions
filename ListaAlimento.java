package Ex1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListaAlimento {
    private Map<String, List<TipoAlimento>> listaDeAlimentos;
    private ValidarAlimentoMenu validar;

    public ListaAlimento() {
        listaDeAlimentos = new HashMap<>();
        validar = new ValidarAlimentoMenu() {
            public void validarAlimento(String alimentoTipo, String quantidade) {

            }

        };
    }

    public void addAlimentosNaLista(String alimentoTipo, String quantidade, String nomeAlimento)
            throws IllegalArgumentException, NumberFormatException {
        validar.validarAlimento(alimentoTipo, quantidade);
        double quantidadeAlimento = Double.parseDouble(quantidade);
        List<TipoAlimento> alimentos = listaDeAlimentos.getOrDefault(alimentoTipo, new ArrayList<>());
        alimentos.add(new TipoAlimento(nomeAlimento,quantidadeAlimento));
        listaDeAlimentos.put(alimentoTipo,alimentos);

    }

    public void setValidar(ValidarAlimentoMenu validar) {
        this.validar = validar;
    }

    public void exibirListaDeAlimento(){
        for (Map.Entry<String, List<TipoAlimento>> chave : listaDeAlimentos.entrySet()) {

            List<TipoAlimento> alimentos = chave.getValue();
            System.out.println(chave.getKey() + ":");
            for (TipoAlimento seletalimento : alimentos){
                System.out.println(seletalimento.getAlimento() + ":" + seletalimento.getQtd());

            }
            System.out.println(listaDeAlimentos.getOrDefault("VERDURA", new ArrayList<>()).size());

        }


    }
}


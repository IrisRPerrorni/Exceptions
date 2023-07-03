package Ex1;

public class Outros implements ValidarAlimentoMenu {

    @Override
    public void validarAlimento(String alimentoTipo, String quantidade) throws IllegalArgumentException, NumberFormatException {
        if (!alimentoTipo.equals("OUTROS"))
            throw new IllegalArgumentException("Tipo de alimento inválido");

        if (quantidade.isEmpty())
            throw new UnsupportedOperationException("Não é permitido inserir valor vazio");

        try {
            Integer.parseInt(quantidade);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Para outros, a quantidade deve ser informada em unidades inteiras");
        }
    }
}

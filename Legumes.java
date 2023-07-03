package Ex1;
//. Se a pessoa escolher alimento do tipo LEGUME ou OUTROS, ela deve informar a quantidade em unidades, dessa forma,
// a quantidade deve ser do tipo inteiro.
//i. Caso a quantidade que a pessoa informar para LEGUME for do tipo double, o programa deve estourar uma exception
// do tipo NumberFormatException com a mensagem “Para legume, a quantidade deve ser informada em unidades inteiras”.

public class Legumes implements ValidarAlimentoMenu {


    @Override
    public void validarAlimento(String alimentoTipo, String quantidade) throws IllegalArgumentException, NumberFormatException {
        if (!alimentoTipo.equalsIgnoreCase("LEGUME"))
            throw new IllegalArgumentException("Tipo de alimento inválido");
        if (quantidade.isEmpty())
            throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
        try {
            Integer.parseInt(quantidade);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Para legume, a quantidade deve ser informada em unidades inteiras");
        }


    }
}

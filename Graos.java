package Ex1;
// Se a pessoa escolher alimento do tipo VERDURA ou GRÃOS, ela deve informar a quantidade em gramas,
// dessa forma, a quantidade deve ser do tipo double.
//Caso a quantidade que a pessoa informar para GRÃOS for do tipo inteiro, o programa deve estourar
// uma exception do tipo NumberFormatException com a mensagem “Para grãos, a quantidade deve ser informada com ponto”.
//Caso a quantidade que a pessoa informar para GRÃOS for do tipo inteiro, o programa deve estourar uma exception
// do tipo NumberFormatException com a mensagem “Para grãos, a quantidade deve ser informada com ponto”.

public class Graos implements ValidarAlimentoMenu{

    @Override
    public void validarAlimento(String alimentoTipo, String quantidade) throws IllegalArgumentException, NumberFormatException {
        if(!alimentoTipo.equalsIgnoreCase("GRÃOS"))
            throw new IllegalArgumentException();
        if (quantidade.isEmpty())
            throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
        try {
            Double.parseDouble(quantidade);
        } catch (NumberFormatException e) {
            throw new NumberFormatException("A quantidade deve ser um valor decimal com ponto");

        }
    }
}

package Ex1;

//VERDURA for do tipo inteiro, o programa deve estourar uma exception do tipo NumberFormatException com a mensagem
// “Para verdura, a quantidade deve ser informada com ponto”.
//Para qualquer tipo de alimento, se a pessoa tentar inserir uma quantidade vazia, ou seja,
// “” [abre e fecha aspas duplas sem nada dentro], o programa deve estourar uma exception
// do tipo UnsupportedOperationException com a mensagem “Não é permitido inserir valor vazio”.
//f. Para qualquer tipo de alimento, se a pessoa tentar inserir uma quantidade menor que zero,
// o sistema deve informar a pessoa usuária que não é possível inserir número negativos e pedir novamente
// a quantidade que precisa comprar do alimento.

public class Verduras implements ValidarAlimentoMenu{

    @Override
    public void validarAlimento(String alimentoTipo, String quantidade) throws IllegalArgumentException, NumberFormatException {
        if (!alimentoTipo.equalsIgnoreCase("VERDURA"))
            throw new IllegalArgumentException("Tipo de alimento inválido");

        if(quantidade.isEmpty()) //condicao se iserir valor vazio
            throw new UnsupportedOperationException("Não é permitido inserir valor vazio");
        try {
            Double.parseDouble(quantidade);
            }catch (NumberFormatException e){
            throw new NumberFormatException("A quantidade deve ser um valor decimal com ponto");
        }



    }
}

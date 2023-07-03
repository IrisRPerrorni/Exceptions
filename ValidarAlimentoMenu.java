package Ex1;

//A pessoa usuária só pode incluir alimentos do tipo: VERDURA, LEGUMES, GRÃOS e OUTROS.
//i. Caso a pessoa tente incluir outro tipo de alimento, o programa deve estourar uma exception
// do tipo IllegalArgumentException com a mensagem “Tipo de alimento inválido”.

public interface ValidarAlimentoMenu {
    void validarAlimento(String alimentoTipo , String quantidade)throws IllegalArgumentException, NumberFormatException;
}


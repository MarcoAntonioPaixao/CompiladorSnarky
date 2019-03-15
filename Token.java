class Token {
  String conteudo;
  String tipoToken;

  public Token(String conteudo, String tipoToken) {
    this.conteudo = conteudo;
    this.tipoToken = tipoToken;
  }

  public static Token identificaTipoToken(char conteudo) {
    String tipo = "";

    if (conteudo == '{')
      tipo = "ABRE_CHAVE";
    else if (conteudo == '}')
      tipo = "FECHA_CHAVE";
    else if (conteudo == '(')
      tipo = "ABRE_PARENTESE";
    else if (conteudo == ')')
      tipo = "FECHA_PARENTESE";
    else if (conteudo == ';')
      tipo = "PONTO_VIRGULA";
    else if (ehOpAritmetico(conteudo))
      tipo = "OP_ARITMETICO";

    return new Token(Character.toString(conteudo), tipo);
  }

  public static Token retornaIdentificador(String conteudoArquivo, int indiceAtual) {
    String conteudoToken = "";

    while (ehElementoValidoID(conteudoArquivo.charAt(indiceAtual))) {
      conteudoToken += conteudoArquivo.charAt(indiceAtual);
      indiceAtual++;
    }

    if (ehPalavraReservada(conteudoToken)) {
      return new Token(conteudoToken, "RESERVADA");
    } else {
      return new Token(conteudoToken, "ID");
    }
  }

  public static Token retornaNumero(String conteudoArquivo, int indiceAtual) throws NumeroInvalidoException {
    String conteudoToken = "";
    boolean flagNumeroReal = false;

    while (ehElementoValidoNumero(conteudoArquivo.charAt(indiceAtual))) {
      if (conteudoArquivo.charAt(indiceAtual) == '.') {
        flagNumeroReal = true;
        if (!Character.isDigit(conteudoArquivo.charAt(indiceAtual + 1))) {
          throw new NumeroInvalidoException(
              "O caractere " + conteudoArquivo.charAt(indiceAtual + 1) + " nao pode compor um numero real.");
        }

      }

      conteudoToken += conteudoArquivo.charAt(indiceAtual);
      indiceAtual++;
    }

    if (flagNumeroReal) {
      return new Token(conteudoToken, "NUMERO_REAL");
    } else {
      return new Token(conteudoToken, "NUMERO_INTEIRO");
    }

  }

  public static Token retornaOpLogico(String conteudoArquivo, int indiceAtual) {
    String conteudoToken = "";

    if (conteudoArquivo.charAt(indiceAtual) == '=' && conteudoArquivo.charAt(indiceAtual + 1) != '=')
      return new Token("=", "ATRIBUICAO");
    else {
      if (conteudoArquivo.charAt(indiceAtual) == '!')
        conteudoToken = "!";
      if (conteudoArquivo.charAt(indiceAtual) == '!' && conteudoArquivo.charAt(indiceAtual + 1) == '=')
        conteudoToken = "!=";
      if (conteudoArquivo.charAt(indiceAtual) == '=' && conteudoArquivo.charAt(indiceAtual + 1) == '=')
        conteudoToken = "==";
      if (conteudoArquivo.charAt(indiceAtual) == '<' && conteudoArquivo.charAt(indiceAtual + 1) == '=')
        conteudoToken = "<=";
      if (conteudoArquivo.charAt(indiceAtual) == '>' && conteudoArquivo.charAt(indiceAtual + 1) == '=')
        conteudoToken = ">=";
      if (conteudoArquivo.charAt(indiceAtual) == '<' && conteudoArquivo.charAt(indiceAtual + 1) != '=')
        conteudoToken = "<";
      if (conteudoArquivo.charAt(indiceAtual) == '>' && conteudoArquivo.charAt(indiceAtual + 1) != '=')
        conteudoToken = ">";
      if (conteudoArquivo.charAt(indiceAtual) == '&' && conteudoArquivo.charAt(indiceAtual + 1) == '&')
        conteudoToken = "&&";
      if (conteudoArquivo.charAt(indiceAtual) == '|' && conteudoArquivo.charAt(indiceAtual + 1) == '|')
        conteudoToken = "||";

      return new Token(conteudoToken, "OP_LOGICO");
    }

  }

  private static boolean ehElementoValidoID(char elemento) {
    return (Character.isLetter(elemento) || elemento == '_');
  }

  private static boolean ehPalavraReservada(String palavra) {
    return (palavra.equals("else") || palavra.equals("if") || palavra.equals("do") || palavra.equals("while")
        || palavra.equals("read") || palavra.equals("write") || palavra.equals("int") || palavra.equals("float")
        || palavra.equals("boolean"));
  }

  private static boolean ehElementoValidoNumero(char elemento) {
    return (Character.isDigit(elemento) || elemento == '.');
  }

  private static boolean ehOpAritmetico(char elemento) {
    return (elemento == '+' || elemento == '-' || elemento == '*' || elemento == '/');
  }
}

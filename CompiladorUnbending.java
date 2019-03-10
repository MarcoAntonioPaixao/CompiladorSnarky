import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

class CompiladorUnbending {
  public static void main(String[] args) {
    String arquivoEntrada;

    if (args.length < 1) {
      System.out.println("Passe o nome do arquivo source como argumento ao executar o programa.");
      return;
    } else {
      arquivoEntrada = new String(args[0]);
      System.out.println("Nome do arquivo de entrada: " + args[0]);
    }

    String conteudoArquivo;

    try {
      conteudoArquivo = readFile(arquivoEntrada, Charset.defaultCharset());
    } catch (IOException e) {
      System.out.println("Erro ao ler arquivo: " + e);
      return;
    }
    // System.out.println("Conteudo do arquivo: \n" + conteudoArquivo);

    App.run(conteudoArquivo);

  }

  static String readFile(String path, Charset encoding) throws IOException {
    byte[] encoded = Files.readAllBytes(Paths.get(path));
    return new String(encoded, encoding);
  }
}

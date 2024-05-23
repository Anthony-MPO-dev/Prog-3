import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandler;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.concurrent.CompletableFuture;

public class App {
    public static void main(String[] args) throws Exception {
        HttpClient cliente = HttpClient.newHttpClient(); // Conversa com o servidor
        HttpRequest req = HttpRequest.newBuilder(new URI("https://www.uol.com.br")).GET().build();//mensagem de requisição
        CompletableFuture<HttpResponse<String>> resposta = cliente.sendAsync(req, BodyHandlers.ofString());//manda a mensagem resqueste para o servidor
        resposta.thenAccept((HttpResponse<String> s)-> System.out.println(s.body()));//ação apos a chegada da resposta do servidor
        while (true);
    }
}

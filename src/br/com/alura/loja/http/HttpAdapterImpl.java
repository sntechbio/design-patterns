package br.com.alura.loja.http;

import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class HttpAdapterImpl implements HttpAdapter{
    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL urlDaApi = new URL(url);
            URLConnection connection = urlDaApi.openConnection();
            connection.connect();
            System.out.println("Registrando orcamento no sistema externo");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao enviar requisicao HTTP", e);
        }
    }
}

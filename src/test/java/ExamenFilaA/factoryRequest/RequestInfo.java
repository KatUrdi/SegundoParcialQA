package ExamenFilaA.factoryRequest;

import java.util.HashMap;
import java.util.Map;

public class RequestInfo {
    private String url;
    private String body;
    private String host;
    private Map<String, String> headers = new HashMap<>();
    private Map<String, String> params = new HashMap<>();

    public String getHost(){
        return host;
    }

    public String getUrl() {
        return url;
    }

    public RequestInfo setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getBody() {
        return body;
    }

    public RequestInfo setBody(String body) {
        this.body = body;
        return this;
    }

    public String getHeader(String key) {
        return headers.get(key);
    }

    public RequestInfo setHeaders(String key, String value) {
        this.headers.put(key, value);
        return this;
    }

    public Map<String, String> getParams() {
        return params;
    }

    public RequestInfo setParams(String key, String value) {
        this.params.put(key, value);
        return this;
    }

    public RequestInfo setHeader(String key, String value) {
        this.headers.put(key, value);
        return this;
    }

    public RequestInfo setHost(String host) {
        this.host= host;
        return this;
    }
}

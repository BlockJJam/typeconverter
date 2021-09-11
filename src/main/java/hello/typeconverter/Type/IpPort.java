package hello.typeconverter.Type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

//127.0.0.1
@Getter
@EqualsAndHashCode
public class IpPort {

    private String ip;
    private int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
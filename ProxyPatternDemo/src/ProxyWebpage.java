import java.util.HashSet;
import java.util.Set;

public class ProxyWebpage implements IProxyInterfrace {
    private String url;
    private RealWebpage webpage;


    public ProxyWebpage(String url) {
        this.url = url;
    }

    @Override
    public void display() {
        if(webpage==null){
            webpage = new RealWebpage(url);
        }
        webpage.display();

    }
}

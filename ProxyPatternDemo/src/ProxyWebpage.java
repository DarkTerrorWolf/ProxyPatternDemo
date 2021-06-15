import java.util.HashSet;
import java.util.Set;

public class ProxyWebpage implements IProxyInterfrace {
    private String url;
    private RealWebpage webpage;
    private Set<String> blocksites = new HashSet<>();

    public ProxyWebpage(String url) {
        this.url = url;
        blocksites.add("abc.com");
        blocksites.add("schoolstuff.com");
        blocksites.add("egator.greenriver.edu");
    }

    @Override
    public void display() {
        if(blocksites.contains(url)){
            System.out.println("Access denied! "+url+" has been blocked by the admin.");
            return;
        }
        else if(webpage==null){
            webpage = new RealWebpage(url);
        }
        webpage.display();

    }
}

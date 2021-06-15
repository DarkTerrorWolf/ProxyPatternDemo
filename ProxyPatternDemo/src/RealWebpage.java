import java.sql.SQLOutput;

public class RealWebpage implements IProxyInterfrace{
    private String website;

    public RealWebpage(String website) {
        this.website = website;
        downloadWebsite(website);
    }

    private void downloadWebsite(String website) {
        System.out.println(website+ " has been downloaded");
    }

    @Override
    public void display() {
        System.out.println("Displaying "+website);
    }
}

package Task2;

import org.openqa.selenium.WebDriver;

public class Main {
    //private WebDriver driver;

    public static void main(String[] args) {
        ECommerce ecommerce = new ECommerce();
        Education education = new Education();
        News news = new News();

        ecommerce.initializeDriver();
        education.initializeDriver();
        news.initializeDriver();

        // Launching ECommerce websites
        ecommerce.launchAmazon();
//        ecommerce.launchJumia();
//        ecommerce.launchEbay();
        ecommerce.closeDriver();

        // Launching Education Websites
        education.launchUdemy();
//        education.launchCoursera();
//        education.launchAlison();
        education.closeDriver();

        // Launching News Websites
        news.launchBBCNews();
//        news.launchCNNNews();
//        news.launchNYTimes();
        news.closeDriver();


    }

}

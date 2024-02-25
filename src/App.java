import logic.Resources;
import view.View;

public class App {
    public static void main(String[] args) throws Exception {
        
        boolean gameOn = true;
        // View location = new View();
        
        Resources resources = new Resources();
        Thread resees = new Thread(resources);
        if (gameOn) {
            resees.start();
        }
        
        while (gameOn) {
                View.home();
        }
        
    }

}

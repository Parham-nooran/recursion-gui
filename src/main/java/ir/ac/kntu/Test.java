package ir.ac.kntu;

public class Test {
    /*public void start(Stage stage) {
        double height, width;
        Pane root = new Pane();
        Scene scene;
        RecursiveGUI recursiveGUI = new RecursiveGUI();
        //root.setStyle("-fx-border-width: 0 0 5 0; -fx-border-style: dotted;");
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter page dimensions");
            System.out.println("Enter the height");
            height = scanner.nextDouble();
            System.out.println("Enter the width");
            width = scanner.nextDouble();
            scene = new Scene(root, height + 10, width + 10);
            // try to separate logic from GUI
            System.out.println("Enter a number between 1 and 11");
            recursiveGUI.setNumber(scanner.nextInt());
        }
        double radius = height/2;
        Circle circle = new Circle(radius, radius, radius, Color.GOLD);
        root.getChildren().add(circle);
        if(recursiveGUI.getNumber()>=1&&recursiveGUI.getNumber()<12) {
            recursiveGUI.draw(root, radius, radius, radius / 4);
            stage.initStyle(StageStyle.UTILITY);
            stage.setTitle("Recursion in JavaFX!");
            stage.setScene(scene);
            stage.show();
        }else {
            System.out.println("The input is out of range");
            stage.close();
            System.exit(0);
        }
    }*/
    /*private int number;
    public void draw(Pane pane, double x,double y,double radius){
        Circle center = new Circle(x, y, 2*radius, Color.BLACK);
        Circle circle0 = new Circle(x+3*radius, y, radius, Color.RED);
        Circle circle45 = new Circle(x+2.121*radius, y-2.121*radius, radius, Color.CHARTREUSE);
        Circle circle90 = new Circle(x, y-3*radius, radius, Color.YELLOW);
        Circle circle135 = new Circle(x-2.121*radius, y-2.121*radius, radius, Color.ROYALBLUE);
        Circle circle180 = new Circle(x-3*radius, y, radius, Color.MEDIUMPURPLE);
        Circle circle245 = new Circle(x-2.121*radius, y+2.121*radius, radius, Color.	GREENYELLOW);
        Circle circle270 = new Circle(x, y+3*radius, radius, Color.	FUCHSIA);
        Circle circle345 = new Circle(x+2.121*radius, y+2.121*radius, radius, Color.BLUE);
        pane.getChildren().addAll(center, circle0, circle45, circle90, circle135,
                circle180, circle245,circle270, circle345);
        if(radius>300/Math.pow(2, number)) {
            draw(pane, x, y, radius/2);
            draw(pane, x, y-3*radius, radius/4);
            draw(pane, x-3*radius, y, radius/4);
            draw(pane, x, y+3*radius, radius/4);
            draw(pane, x+3*radius, y, radius/4);
            draw(pane, x+2.121*radius, y+2.121*radius, radius/4);
            draw(pane, x-2.121*radius, y-2.121*radius, radius/4);
            draw(pane, x+2.121*radius, y-2.121*radius, radius/4);
            draw(pane, x-2.121*radius, y+2.121*radius, radius/4);
        }
    }
    public void setNumber(int number){
        this.number = number;
    }
    public int getNumber(){
        return number;
    }*/
}

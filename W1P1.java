public class W1P1 {
    public static void main(String[] args) {
        // Teerawat Chanvipardilok 64011154
        
        int currentP = 312032486,sec = 365*24*60*60*5;
        int birth,death,immigrant;
        birth=sec/7;
        death=sec/13;
        immigrant=sec/45;
        currentP += (birth-death+immigrant);
        System.out.println(currentP);
    }
}
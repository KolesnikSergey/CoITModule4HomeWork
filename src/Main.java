public class Main {
    public static void main(String[] args) {
        /**
         * First task from homework
         **/
        Figure fig[] = new Figure[3];
        int figCount = 0;

        fig[0] = new Circle(6);
        fig[1] = new Tringle(4,5);
        fig[2] = new Square(3,4);

        while( figCount < fig.length ) {
            System.out.println(fig[figCount].getName() + " area = " + fig[figCount].area());
            figCount++;
        }
        /**
         * End of first task
         */

        /**
         * Second task from homework
         */
        Convert conv[] = new Convert[2];
        figCount = 0;

        conv[0] = new FarhToCel(234);
        conv[1] = new CelToFarh(43);

        while( figCount < conv.length ) {
            conv[figCount].calculate();
            figCount++;
        }
        /**
         * End of second task
         */

        /**
         * Third task from homework
         */
        FindLength points;
        points = new FindLength(2,4,6,9);
        /**
         * End of third task
         */
    }
}

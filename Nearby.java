import javax.jws.soap.SOAPMessageHandlers;

class Nearby {

    int[][] multi = new int[][]{
            { 2, 0, 4, 1241, 12, 5, 11, 1110, -42, 424, 1, 12323 },
            { 1, 3, 5, 7 },
            { 321, 320, 32, 3, 41241, -11, -12, -13, -66, -688 }
    };

    public int[] nearby(int x, int y, int range) {

        int[] subMulti = null;

        if (areParametersValid(x, y, range)){

            subMulti = fillSubMulti(x, y, range);

        } else {
           System.out.println("wrong arguments given");
        }

        return subMulti;
    }

    private int[] fillSubMulti(int x, int y, int range) {

        int subSize = countSubSize(x, y, range);
        int[] subMulti = new int[subSize];
        int subIndex = 0;

        for (int i = -range; i<0; i++) {

            try {
                subMulti[subIndex] = multi[x][y+i];
                subIndex++;
            } catch (IndexOutOfBoundsException e) {}
        }

        for (int i = 1; i<= range; i++) {

            try {
                subMulti[subIndex] = multi[x][y+i];
                subIndex++;
            } catch (IndexOutOfBoundsException e) {}
        }

        return subMulti;
    }

    private int countSubSize(int x, int y, int range) {

        x = multi[x].length;

        if (0 <= y - range) {
            if (y + range < x) return 2*range;
            else return range + x - y - 1;
        }
        else {
            if (y + range < x) return range + y;
            else return x - 1;
        }
    }

    private boolean areParametersValid(int x, int y, int range) {

        return 0 <= x && x < multi.length && 0 <= y && y < multi[x].length && 0 < range;
    }

    public static void main(String[] args) {

        Nearby n = new Nearby();
        int[] multiMulti = n.nearby(1,2,1);

        for (int i: multiMulti) {
            System.out.println(i);
        }
    }
}
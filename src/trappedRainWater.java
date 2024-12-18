public class trappedRainWater {
    public static int calc(int lvls[]) {
        int n = lvls.length;
        int trappedWater = 0;
        int lm[] = new int[n];
        lm[0] = lvls[0];
        for (int i = 1; i < n; i++) {
            lm[i] = Math.max(lvls[i], lm[i - 1]);
        }
        int rm[] = new int[n];
        rm[n - 1] = lvls[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rm[i] = Math.max(lvls[i], rm[i + 1]);

        }
        for (int i = 0; i < n; i++) {
            int totalWater = Math.min(lm[i], rm[i]);
            trappedWater += totalWater - lvls[i];

        }
        return trappedWater;
    }
    public static void main(String args[]){
        int levels [] = {4,2,5,6,0,4};
        System.out.println(calc(levels));
    }
}

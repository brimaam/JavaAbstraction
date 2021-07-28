package Problem1Fowls.model;

public class ComputeFowl extends FowlYuan {

    @Override
    public void compute() {
        FowlYuan yuan = new ComputeFowl();

        //the computation is 5 * x + 3 * y + z / 3 = 100
        //x + y + z = 100
        //5 * x <= 100,
        //3 * y <= 100,
        //x <= 20, y <= 33

        for(yuan.cocks = 0; yuan.cocks <= 20; yuan.cocks++){
            for(yuan.hens = 0; yuan.hens <= 33; yuan.hens++){
                yuan.chickens = 100 - yuan.cocks - yuan.hens;
                if(yuan.chickens % 3 == 0 && 5 * yuan.cocks + 3 * yuan.hens + yuan.chickens / 3 == 100) {
                    System.out.println("Buy " + yuan.cocks + " cocks, " + yuan.hens + " hens, " + yuan.chickens + " chickens.");
                }
            }
        }
    }
}


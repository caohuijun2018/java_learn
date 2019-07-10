public class division {
    public static void main(String[] args) {
        int div=77;
        int dicision =8;

        //System.out.println(div+ "可以整除" + dicision + "吗?"  +(div++) % dicision ==0);

        //System.out.println(div + "可以整除" + dicision + "吗？" + ((div++) % dicision == 0));
        //System.out.println(div + "可以整除" + dicision + "吗？" + ((div++) % dicision == 0));

        for(int i=77;i<=100;i++) {
            Boolean a = div % dicision == 0;

            System.out.println(a + "整除");
            div++;
        }
    }
}

public class Washinemachine {


    private static volatile Washinemachine Onwashinemahine;
    private Washinemachine(){


    }

    public static Washinemachine doWash(){

        if(Onwashinemahine==null){
            synchronized (Washinemachine.class){

                if(Onwashinemahine==null){
                    Onwashinemahine=new Washinemachine();

                }


            }


        }

        return Onwashinemahine;
    }

}

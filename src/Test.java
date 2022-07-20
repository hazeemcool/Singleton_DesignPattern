public class Test {
    public static void main(String[] args) {

        long start;
        long end;
        long s;

        start=System.currentTimeMillis();
        Washinemachine user=Washinemachine.doWash();
        end=System.currentTimeMillis();
        System.out.println(user);
        System.out.println(end-start);

        start=System.currentTimeMillis();
        Washinemachine user1=Washinemachine.doWash();
        end=System.currentTimeMillis();
        System.out.println(end-start);
        System.out.println(user1);
    }
}

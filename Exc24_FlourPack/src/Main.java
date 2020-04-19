public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(FlourPacker.canPack(1, 0, 4));
        System.out.println(FlourPacker.canPack(1, 0, 5));
        System.out.println(FlourPacker.canPack(0, 5, 4));
        System.out.println(FlourPacker.canPack(2, 2, 11));
        System.out.println(FlourPacker.canPack(-3, 2, 12));
        System.out.println(FlourPacker.canPack(1, 0, 6));
        System.out.println(FlourPacker.canPack(2, 1, 5));
    }
}

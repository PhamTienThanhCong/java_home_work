package external_sort;

public class Test {
	public static void main(String[] args) {
        String file_in = "H:\\DATA CODE\\code java\\KiemTraGiuaKi\\test\\input.txt";
        String file_out = "./external-sorted.txt";
        ExternalSort.externalSort(file_in, file_out, 100000);
    }
}

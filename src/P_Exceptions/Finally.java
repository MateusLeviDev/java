package P_Exceptions;

public class Finally {
    public static void main(String[] args) {

        int[] num = {2, 8, 6, 58, 40, 56};
        int[] div = {2, 0, 6, 4, 0};

        for (int i = 0; i < num.length; i++) {
            try {
                System.out.println(num[i] + "/" + div[i] + "= " + (num[i] / div[i]));

            } catch (ArithmeticException exception) {
                System.out.println("Error div 0");
                System.exit(0); //exemplo onde o finally não é executado depois do catch
            } catch (ArrayIndexOutOfBoundsException exception) {
                System.out.println("i dont exist");
                System.exit(0);
            } finally {
                System.out.println("executa depois do try");
            }
        }
    }
}

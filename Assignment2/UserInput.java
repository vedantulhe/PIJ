import java.io.*;

public class UserInput {
    public static double[] getArray(int size) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double[] inputArray = new double[size];
        String array = br.readLine();
        String[] input = array.trim().split("\\s+");
        for (int i = 0; i < size; i++) {
            inputArray[i] = Double.parseDouble(input[i]);
        }
	return inputArray;
    }
}
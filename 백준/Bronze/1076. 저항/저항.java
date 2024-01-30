import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long resistant = 0;

        resistant = (checkResistant(br.readLine()) * 10L + checkResistant(br.readLine())) * checkMultiply(br.readLine());

        br.close();

        bw.write(String.valueOf(resistant));
        bw.flush();
        bw.close();
    }

    static int checkResistant(String str) {

        int resistant = 0;

        switch (str) {
            case "brown":
                resistant = 1;
                break;
            case "red":
                resistant = 2;
                break;
            case "orange":
                resistant = 3;
                break;
            case "yellow":
                resistant = 4;
                break;
            case "green":
                resistant = 5;
                break;
            case "blue":
                resistant = 6;
                break;
            case "violet":
                resistant = 7;
                break;
            case "grey":
                resistant = 8;
                break;
            case "white":
                resistant = 9;
                break;
            default:
                resistant = 0;
        }

        return resistant;
    }

    static long checkMultiply(String str) {

        long multiply = 1;

        switch (str) {
            case "brown":
                multiply = 10;
                break;
            case "red":
                multiply = 100;
                break;
            case "orange":
                multiply = 1000;
                break;
            case "yellow":
                multiply = 10000;
                break;
            case "green":
                multiply = 100000;
                break;
            case "blue":
                multiply = 1000000;
                break;
            case "violet":
                multiply = 10000000;
                break;
            case "grey":
                multiply = 100000000;
                break;
            case "white":
                multiply = 1000000000;
                break;
            default:
                multiply = 1;
        }

        return multiply;
    }
}
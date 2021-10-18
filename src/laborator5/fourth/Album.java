package laborator5.fourth;

import java.util.ArrayList;

public abstract class Album {
    ArrayList<Song> songList = new ArrayList<>();

    abstract void addSong(Song song);

    void removeSong() {};

    @Override
    public String toString() {
        return "Album{" +
                "songList=" + songList +
                '}';
    }

    static boolean checkIfPrime(int inputNumber)
    {
        boolean isItPrime = true;
        if(inputNumber <= 1)
        {
            isItPrime = false;
            return isItPrime;
        }
        else
        {
            for (int i = 2; i<= inputNumber/2; i++)
            {
                if ((inputNumber % i) == 0)
                {
                    isItPrime = false;
                    break;
                }
            }
            return isItPrime;
        }
    }
    public static boolean checkIfPalindrome(int number) {
        int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }
}

package number.set;



import java.util.NoSuchElementException;
import java.util.Random;
import java.util.stream.IntStream;


public class NumberSet  {
    public static int MAX_SIZE = 100;
    private int[] nSet = new int[MAX_SIZE];
    private int size;
    private Random generator = new Random();



    public void add(int value) throws Exception{

        if(size >= MAX_SIZE) throw new Exception("Nie można nic dodać, zbiór przepełniony");
        nSet[size++] = value;

    }

    public void remove(int value) throws Exception {

        assert(size > 0): "Nie można usunąć nieistniejącego elementu";

        int[] temp = new int[MAX_SIZE];
        int counter = 0;

        for(int i = 0; i<size; i++) {
            if(nSet[i] != value)
                temp[counter++] = nSet[i];
        }

        if(counter == size)
            throw new Exception("Zbiór nie posiada liczby, którą chcemy usunąć!");
        else
            size = counter;

        size = counter;
        nSet = temp;


    }

    public void printSet() {

        assert(size > 0): "Brak elementów";

        for(int i = 0;i<size;i++)
            System.out.print(nSet[i] + " ");

    }

    public int getRandomValue() throws Exception{

        int randomValue;
        int minValue = getMinValue();
        int maxValue = getMaxValue();

        assert (minValue <= maxValue) : "Niepoprawny zakres!";

        if(getSize() == 0) throw new Exception("Zbiór pusty!");

        do{
            randomValue = generator.nextInt(maxValue - minValue + 1) + minValue;
        }
        while (!contains(randomValue));

        assert (randomValue >= minValue && randomValue <= maxValue): "Losowa liczba nie należy do zakresu!";

        remove(randomValue);

        return randomValue;
    }

    public int getSumOfElements() throws Exception{


        if(getSize() == 0) throw new Exception("Zbiór pusty!");

        int sum = 0;

        for(int i =0; i< size;i++)
            sum += nSet[i];

        return sum;

    }


    public void divideAllElementsBy(int value) {

        assert(size > 0);
        assert(value != 0) : "Nie można dzielić przez 0 !";

        for(int i = 0;i <size;i++)
            nSet[i] /= value;

    }

    public boolean contains(int value) {

        for(int i = 0; i < size;i++)
            if(nSet[i] == value)
                return true;
        return false;

    }

    public int getSize() {
        assert (size >= 0) : "Rozmiar nie może byc ujemny!";
        return size;
    }

    private int getMinValue() {

        int minValue = nSet[0];

        for(int i = 1;i <size;i++){

            if(minValue > nSet[i])
                minValue = nSet[i];
        }

        return minValue;

    }
    private int getMaxValue() {

        int maxValue = nSet[0];

        for(int i = 1;i <size;i++){
            if(maxValue < nSet[i])
                maxValue = nSet[i];
        }

        return maxValue;
    }




}

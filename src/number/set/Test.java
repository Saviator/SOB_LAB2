package number.set;

public class Test {

    public static void main(String[] args) throws Exception {

        NumberSet testNumberSet = new NumberSet();

        testNumberSet.add(10);testNumberSet.add(5);testNumberSet.add(5);
        testNumberSet.add(20);testNumberSet.add(25);testNumberSet.add(10);

        System.out.print("Oryginalna lista: ");
        testNumberSet.printSet();
        System.out.print("\nRozmiar tabeli na początku: ");
        System.out.println(testNumberSet.getSize());

        System.out.print("\nLista po sumowaniu: ");
        System.out.println(testNumberSet.getSumOfElements());

        System.out.print("\nLista zawiera podaną cyfre (20) ?: ");
        System.out.println(testNumberSet.contains(20));
        System.out.print("Lista zawiera podaną cyfre (17) ?: ");
        System.out.println(testNumberSet.contains(17));

        testNumberSet.remove(10);
        System.out.print("\nPo usunięciu elementu (10): ");
        testNumberSet.printSet();


        System.out.println("\n\nlosowa liczba: " + testNumberSet.getRandomValue());
        System.out.print("Po usunięciu losowego elementu: ");
        testNumberSet.printSet();

        System.out.print("\n\nPo podzieleniu: ");
        testNumberSet.divideAllElementsBy(4);
        testNumberSet.printSet();

        System.out.print("\n\nRozmiar tabeli na końcu: ");
        System.out.println(testNumberSet.getSize());


    }

}
